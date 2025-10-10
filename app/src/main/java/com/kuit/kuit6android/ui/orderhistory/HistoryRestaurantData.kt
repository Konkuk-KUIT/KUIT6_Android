package com.kuit.kuit6android.ui.orderhistory

data class HistoryRestaurantData(
    val data : String,
    val restaurantName: String,
    val isFavorite : Boolean,
    val orderPrice : Int,
    val salePrice : Int,
    val isClosed : Boolean,
    val menu : List<MenuData>
)

data class MenuData(
    val menuName : String,
    val menuCount : Int,
    val menuDetail : String
)
