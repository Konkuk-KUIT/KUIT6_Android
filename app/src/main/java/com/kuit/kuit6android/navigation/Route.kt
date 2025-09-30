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

    @Serializable
    data class Detail(val storeId: String) : Route{
        companion object{
            const val routeBase = "detail"
            const val routeWithArg = "detail/{storeId}"

            fun fromRoute(route: String?): Detail?{
                val id = route?.substringAfter("detail/") ?: return null
                return Detail(storeId = id)
            }
        }

        fun toRoute(): String = "$routeBase/$storeId"
    }
}

