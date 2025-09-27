package com.kuit.kuit6android.ui.home.data

import kotlinx.serialization.Serializable

@Serializable
data class RestaurantData(
    val imageId: Int,
    val name: String,
    val time: Int,
    val rating: Double,
    val reviewerCount: Int
)
