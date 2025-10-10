package com.kuit.kuit6android.ui.cart.model

data class CartItem(
    val id: Int,
    val name: String,
    val price: Int,
    var quantity: Int = 1,
    val options: String = "",
    val imageRes: Int = 0
)

data class RecommendedItem(
    val id: Int,
    val name: String,
    val price: Int,
    val imageRes: Int = 0
)

data class CartStore(
    val name: String,
    val items: List<CartItem>
)