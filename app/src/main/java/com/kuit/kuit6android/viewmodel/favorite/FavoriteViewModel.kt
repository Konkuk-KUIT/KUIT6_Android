package com.kuit.kuit6android.viewmodel.favorite

import androidx.lifecycle.ViewModel
import com.kuit.kuit6android.model.Store
import com.kuit.kuit6android.model.User
import com.kuit.kuit6android.model.factory.StoreFactory
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

class FavoriteViewModel : ViewModel() {
    private val _user = MutableStateFlow<User?>(null)
    val user: StateFlow<User?> = _user

    private val _navigateToDetail = MutableSharedFlow<Store>(extraBufferCapacity = 1)
    val navigateToDetail: SharedFlow<Store> = _navigateToDetail

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
        _navigateToDetail.tryEmit(store)
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
