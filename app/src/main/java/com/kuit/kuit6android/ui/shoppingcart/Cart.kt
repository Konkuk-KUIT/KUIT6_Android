package com.kuit.kuit6android.ui.shoppingcart


data class Cart(
    val name : String,
    val menu : List<Menu>,
    val img : Int
)

data class Menu(
    val name : String,
    val price : Int,
    var count : Int,
    val detail : String,
    val img : Int
)
