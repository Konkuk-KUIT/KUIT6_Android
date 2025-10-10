package com.kuit.kuit6android.ui.shoppingcart.data

data class ShoppingCartData(
    val imageResId: Int,
    val restaurantName: String,
    val itemList: List<ItemNameData>,
    val recommendList : List<RecommendData>
)

data class ItemNameData(
    val name: String,
    val cost: Int,
    val extra: String,
    val imageResId: Int
)

data class RecommendData(
    val imageResId: Int,
    val name : String,
    val cost : Int
)