package com.kuit.kuit6android.navigation

import androidx.navigation.NavBackStackEntry
import com.kuit.kuit6android.ui.home.component.StoreData
import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object Home : Route

    @Serializable
    data object Search : Route

    @Serializable
    data class SearchResult(
        val searchKeyword: String,
    ) : Route

    @Serializable
    data object SearchNestedGraphRoute : Route

    @Serializable
    data object Favorite : Route

    @Serializable
    data class DetailPage(
        val imageId : Int,
        val name : String,
        val deliveryTime : Int,
        val score : Double,
        val reviewCount : String
    ) : Route

    @Serializable
    data object FavoriteNestedGraphRoute : Route

    @Serializable
    data object OrderHistory : Route

    @Serializable
    data object MyEats : Route

    @Serializable
    data object MyEatsNestedGraphRoute : Route
}

