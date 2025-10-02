package com.kuit.kuit6android.navigation

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
    data class RestaurantDetail(
        val imageId: Int,
        val name: String,
        val time: String,
        val rate: Float,
        val reviewNum: Int
    ) : Route

    @Serializable
    data object FavoriteNestedGraphRoute : Route

    @Serializable
    data object OrderHistory : Route

    @Serializable
    data object MyEats : Route

    @Serializable
    data object MyEatsFavorite : Route

    @Serializable
    data object MyEatsNestedGraphRoute : Route
}

