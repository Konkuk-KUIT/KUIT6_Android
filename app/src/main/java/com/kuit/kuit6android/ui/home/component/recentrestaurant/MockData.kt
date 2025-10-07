package com.kuit.kuit6android.ui.home.component.recentrestaurant

import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RestaurantData

object MockData {
    val restaurantList = listOf(
        RestaurantData(
            imageId = R.drawable.restaurant,
            name = "아워떡볶이",
            time = 30,
            rating = 4.9,
            reviewerCount = 3849
        ),
        RestaurantData(
            imageId = R.drawable.threestar,
            name = "모수",
            time = 60,
            rating = 3.3,
            reviewerCount = 192837
        ),
        RestaurantData(
            imageId = R.drawable.yakurt,
            name = "야쿠르트",
            time = 3,
            rating = 4.8,
            reviewerCount = 129743
        ),
        RestaurantData(
            imageId = R.drawable.fishbread,
            name = "붕어빵",
            time = 2,
            rating = 4.0,
            reviewerCount = 924385
        ),
        RestaurantData(
            imageId = R.drawable.katsu,
            name = "경양식",
            time = 20,
            rating = 4.3,
            reviewerCount = 278
        ),
    )
}