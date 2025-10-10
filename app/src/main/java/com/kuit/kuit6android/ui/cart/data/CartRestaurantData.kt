package com.kuit.kuit6android.ui.cart.data

data class CartRestaurantData(
    val restaurantName: String,
    val deliveryFee: Int,
    val menuList: List<MenuData>,
    val imageId: Int,
    val recommendMenuList: List<ShortMenuData>,
    val deliveryTime: String,
    val pickUpTime: String
)

data class MenuData(
    val menuName: String,
    val menuPrice: Int,
    val menuCount: Int,
    val menuOptions: List<String>,
    val imageId: Int,
)

data class ShortMenuData(
    val menuName: String,
    val menuPrice: Int,
    val imageId: Int,
)