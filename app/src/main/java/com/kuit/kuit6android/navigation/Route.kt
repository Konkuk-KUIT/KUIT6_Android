package com.kuit.kuit6android.navigation

import com.kuit.kuit6android.ui.home.data.RestaurantData
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
    data class FavoriteDetail(
        val restaurantData: RestaurantData,
    ) : Route

    @Serializable
    data object OrderHistory : Route

    @Serializable
    data object MyEats : Route
}

