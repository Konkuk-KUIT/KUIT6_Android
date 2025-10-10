package com.kuit.kuit6android.ui.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.cart.component.CartDetail
import com.kuit.kuit6android.ui.cart.component.CartTopBar
import com.kuit.kuit6android.ui.cart.component.RestaurantInfo
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.cart.data.CartMenuDetail

@Composable
fun CartScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(padding)
    ) {
        CartTopBar(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 12.dp)
        )
        LazyColumn(
            modifier.padding(horizontal = 0.dp)
        ) {
            item {
                RestaurantInfo(
                    modifier = Modifier.padding()
                )
            }
            item {
                CartDetail(
                    menu = CartMenuDetail(
                        menu = "BBQ소스",
                        price = 500,
                        detail = "소스 선택 : BBQ양념치킨소스(25g)",
                        img = R.drawable.sauce,
                        amount = 1,
                    )
                )
            }
            item {
                CartDetail(
                    menu = CartMenuDetail(
                        menu = "황금올리브치킨",
                        price = 24000,
                        detail = "음료 추가 선택: 서비스 음료 미제공",
                        img = R.drawable.justchicken,
                        amount = 1,
                    )
                )
            }
            item {
                CartDetail(
                    menu = CartMenuDetail(
                        menu = "[황.양.반] 황올 반 + 양념 반",
                        price = 24000,
                        detail = "음료 추가 선택: 코카콜라",
                        img = R.drawable.chickenandcoke,
                        amount = 1,
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CartScreenPreview() {
    CartScreen(
        padding = PaddingValues(0.dp)
    )
}