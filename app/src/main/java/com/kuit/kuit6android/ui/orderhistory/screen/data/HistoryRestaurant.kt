package com.kuit.kuit6android.ui.orderhistory.screen.data

data class HistoryRestaurant(
    val date : String,
    val restaurantName : String,
    val isFavorite : Boolean,
    val orderPrice : Int,
    val salePrice : Int,
    val menu : List<MenuData>,
    val isOpened : Boolean

)

data class MenuData(
    val menuName : String,
    val menuCount : Int,
    val menuDetail : String
)
