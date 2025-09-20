package com.kuit.kuit6android.ui.home.data

import com.kuit.kuit6android.R

data class RecentRestaurantData(
    val imageId: Int = R.drawable.chicken,
    val name: String = "맛집명",
    val time: Int = 123,
    val rating: Double = 4.5,
    val reviewerCount: Int = 1234567890
)
