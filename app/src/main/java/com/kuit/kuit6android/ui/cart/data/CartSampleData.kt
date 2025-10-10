package com.kuit.kuit6android.ui.cart.data

import com.kuit.kuit6android.ui.cart.model.CartItem
import com.kuit.kuit6android.ui.cart.model.CartStore
import com.kuit.kuit6android.ui.cart.model.RecommendedItem

object CartSampleData {
    val sampleStore = CartStore(
        name = "BBQ 건대점",
        items = listOf(
            CartItem(
                id = 1,
                name = "BBQ 소스",
                price = 500,
                quantity = 1,
                options = "소스 선택 : BBQ허니갈릭소스(무료)"
            ),
            CartItem(
                id = 2,
                name = "황금올리브치킨",
                price = 24000,
                quantity = 1,
                options = "옵션 추가(선택) : 칠리 마요소스"
            ),
            CartItem(
                id = 3,
                name = "황금올리브+생맥주 반",
                price = 24000,
                quantity = 1,
                options = "옵션 추가(선택) : 포카칩비"
            )
        )
    )

    val recommendedItems = listOf(
        RecommendedItem(
            id = 1,
            name = "황금올리브치킨 핫크리스피",
            price = 24500
        ),
        RecommendedItem(
            id = 2,
            name = "치즈볼",
            price = 2000
        ),
        RecommendedItem(
            id = 3,
            name = "BBQ 먹태어",
            price = 6000
        ),
        RecommendedItem(
            id = 4,
            name = "BBQ콜(도우)",
            price = 5000
        )
    )
}