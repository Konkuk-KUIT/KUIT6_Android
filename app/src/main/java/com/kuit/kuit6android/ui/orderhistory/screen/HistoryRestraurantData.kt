package com.kuit.kuit6android.ui.orderhistory.screen

data class HistoryRestraurantData(
    val date : String,
    val restraurantName : String,
    val isFavorite : Boolean,
    val orderPrice : Int,
    val salePrice : Int,
    val menu : List<MenuListData>,
    val isClosed : Boolean,
    val RestrauntImg : Int
)

data class MenuListData(
    val menuName : String,
    val menuDetail : String,
    val menuCount : Int
)


