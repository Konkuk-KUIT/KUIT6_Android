package com.kuit.kuit6android.navigation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object Home : Route

    @Serializable
    data object Search : Route

    @Serializable
    data object Favorite : Route

    @Serializable
    data object OrderHistory : Route

    @Serializable
    data object MyEats : Route
}

