package com.kuit.kuit6android.ui.shoppingcart.data

import com.kuit.kuit6android.R

fun getShoppingCartData(): List<ShoppingCartData> {
    return listOf(
        ShoppingCartData(
            imageResId = R.drawable.bbq_img,
            restaurantName = "BBQ 건대점",
            itemList = listOf(
                ItemNameData(
                    name = "BBQ 소스",
                    cost = 500,
                    extra = "소스선택 : BBQ양념치킨소스(25g)",
                    imageResId = R.drawable.marketmenu_icon1
                ),
                ItemNameData(
                    name = "황금올리브치킨",
                    cost = 24000,
                    extra = "음료 추가선택 : 서비스 음료 미제공",
                    imageResId = R.drawable.marketmenu_icon2
                ),
                ItemNameData(
                    name = "[황.양.반]황올 반 + 양념 반",
                    cost = 24000,
                    extra = "음료 추가선택 : 서비스 음료 미제공",
                    imageResId = R.drawable.marketmenu_icon3
                )
            ),
            recommendList = listOf(
                RecommendData(
                    imageResId = R.drawable.extra_menu1,
                    name = "황금올리브치킨 핫크리스피",
                    cost = 24500
                ),
                RecommendData(
                    imageResId = R.drawable.extra_menu2,
                    name = "제로콜라",
                    cost = 2000
                ),
                RecommendData(
                    imageResId = R.drawable.extra_menu3,
                    name = "BBQ 떡볶이",
                    cost = 8000
                ),
                RecommendData(
                    imageResId = R.drawable.extra_menu4,
                    name = "BBQ볼(5개)",
                    cost = 5000
                )
            )
        )
    )
}

fun getShoppingCartTotalCost(): Int {
    return getShoppingCartData().sumOf { cart ->
        cart.itemList.sumOf { it.cost }
    }
}
