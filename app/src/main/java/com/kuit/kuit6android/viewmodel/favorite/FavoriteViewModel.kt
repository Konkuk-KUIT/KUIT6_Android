package com.kuit.kuit6android.viewmodel.favorite

import androidx.lifecycle.ViewModel
import com.kuit.kuit6android.model.Store
import com.kuit.kuit6android.model.User
import com.kuit.kuit6android.model.factory.StoreFactory
import com.kuit.kuit6android.navigation.NavEvent
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

class FavoriteViewModel : ViewModel() {
    private val _user = MutableStateFlow<User?>(null)
    val user: StateFlow<User?> = _user

    private val _nav = MutableSharedFlow<NavEvent>(
        replay = 0, extraBufferCapacity = 1
    )
    val nav: SharedFlow<NavEvent> = _nav

    fun onBack(){
        _nav.tryEmit(NavEvent.Back)
    }

    init {
        _user.value = User(
            name = "채민지",
            phone = "010-1234-5678",
            myReview = listOf(),
            helpCount = 0,
            favoriteStore = StoreFactory.getStoreList()
        )
    }

    fun onStoreClicked(store: Store) {
        StoreCache.put(store)
        _nav.tryEmit(NavEvent.ToDetail(store.id))
    }
}


object StoreCache {
    private val storeMap = mutableMapOf<String, Store>()

    fun put(store: Store) {
        storeMap[store.id] = store
    }

    fun get(id: String?): Store? {
        return id?.let { storeMap[it] }
    }

    fun clear() {
        storeMap.clear()
    }
}
