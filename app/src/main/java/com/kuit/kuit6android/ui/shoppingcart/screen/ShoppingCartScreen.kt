package com.kuit.kuit6android.ui.shoppingcart.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.component.CoupangEatsRoundedButton
import com.kuit.kuit6android.ui.shoppingcart.component.ShoppingCarSubTitle
import com.kuit.kuit6android.ui.shoppingcart.component.ShoppingCartRestaurantType
import com.kuit.kuit6android.ui.shoppingcart.component.ShoppingCartTopAppBar
import com.kuit.kuit6android.ui.shoppingcart.component.deliver.DeliveryMethodScreen
import com.kuit.kuit6android.ui.shoppingcart.component.payment.CheckPayScreen
import com.kuit.kuit6android.ui.shoppingcart.component.recommend.RecommendMenuScreen
import com.kuit.kuit6android.ui.shoppingcart.menu.menu.ShoppingCartMenuScreen

@Composable
fun ShoppingCartScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        // 🧱 상단 AppBar
        ShoppingCartTopAppBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp)
        )

        // 🧾 스크롤 영역 (weight 추가!)
        LazyColumn(
            modifier = Modifier
                .weight(1f) // ✅ 핵심: Column 내부 높이 제한
                .fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp)
        ) {
            item {
                ShoppingCartRestaurantType()
                Spacer(modifier = Modifier.height(8.dp))
            }

            // 장바구니 메뉴 리스트
            item {
                ShoppingCartMenuScreen()
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                ShoppingCarSubTitle("함께 먹으면 좋아요")
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                RecommendMenuScreen()
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                ShoppingCarSubTitle("수령방법을 선택해주세요")
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                DeliveryMethodScreen()
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                ShoppingCarSubTitle("결제금액을 확인해주세요")
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                CheckPayScreen()
                Spacer(modifier = Modifier.height(20.dp))
            }

            item {
                CoupangEatsRoundedButton()
                Spacer(modifier = Modifier.height(50.dp))

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ShoppingCartPreview() {
    ShoppingCartScreen()
}
