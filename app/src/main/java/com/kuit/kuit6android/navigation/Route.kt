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
    data object FavoriteToMyEats : Route

    @Serializable
    data object MyEatsNestedGraph : Route

    @Serializable
    data class FavoriteDetail(
        val restaurantImageId: Int,
        val restaurantName: String,
        val restaurantRating: Double,
        val restaurantReviewerCount: Int
    ) : Route


    @Serializable
    data object OrderHistory : Route

    @Serializable
    data object MyEats : Route
}

