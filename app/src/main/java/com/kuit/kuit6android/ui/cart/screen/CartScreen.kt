package com.kuit.kuit6android.ui.cart.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.cart.component.CartBottomBar
import com.kuit.kuit6android.ui.cart.component.CartMenusCard
import com.kuit.kuit6android.ui.cart.component.CartTopBar
import com.kuit.kuit6android.ui.cart.component.DeliveryOptionSection
import com.kuit.kuit6android.ui.cart.component.PriceSummarySection
import com.kuit.kuit6android.ui.cart.component.RecommendMenuSection
import com.kuit.kuit6android.ui.cart.component.RestaurantNameBar
import com.kuit.kuit6android.ui.cart.data.CartRestaurantData
import com.kuit.kuit6android.ui.cart.data.MenuData
import com.kuit.kuit6android.ui.cart.data.ShortMenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun CartScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues,
    onBackClick: (() -> Unit)? = null
) {
    val restaurantData = CartRestaurantData(
        restaurantName = "BBQ 건대점",
        deliveryFee = 0,
        menuList = listOf(
            MenuData(
                "BBQ 소스",
                500,
                1,
                listOf("소스 선택 : BBQ양념치킨소스(25g)"),
                R.drawable.img_bbq_sauce
            ),
            MenuData(
                "황금올리브치킨",
                24000,
                1,
                listOf("음료 추가선택 : 서비스 음료 미제공"),
                R.drawable.img_bbq_h_o
            ),
            MenuData(
                "[황.양.반] 황올 반+양념 반",
                24000,
                1,
                listOf("음료 추가선택 : 코카콜라"),
                R.drawable.img_bbq_ho_seasoned_coke
            )
        ),
        imageId = R.drawable.img_bbq,
        deliveryTime = "22~37",
        pickUpTime = "14~24",
        recommendMenuList = listOf(
            ShortMenuData(
                "황금올리브치킨 핫크리스피",
                24500,
                R.drawable.img_bbq_h_o
            ),
            ShortMenuData(
                "제로콜라",
                2000,
                R.drawable.img_zero_coke
            ),
            ShortMenuData(
                "BBQ 떡볶이",
                8000,
                R.drawable.img_bbq_ddeokbokki
            ),
            ShortMenuData(
                "BBQ볼(5개)",
                5000,
                R.drawable.img_bbq_ball
            )
        )
    )

    val menuTotalPrice = restaurantData.menuList.sumOf { it.menuPrice * it.menuCount }

    Scaffold(
        containerColor = CoupangEatsTheme.colors.white,
        topBar = {
            CartTopBar(onBackClick = onBackClick,
                modifier = Modifier.statusBarsPadding()
                    .padding(horizontal = 20.dp))
        },
        bottomBar = {
            CartBottomBar(
                totalPrice = menuTotalPrice + restaurantData.deliveryFee,
                modifier = Modifier.navigationBarsPadding()
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                RestaurantNameBar(restaurantData = restaurantData)
                Spacer(modifier = Modifier.height(23.dp))
            }
            item {
                CartMenusCard(
                    restaurantData = restaurantData,
                    onIncrease = {} // !!!
                )
            }
            item {
                Spacer(modifier = Modifier.height(20.dp))
                RecommendMenuSection(
                    restaurantData = restaurantData,
                    onPlus = {}
                )
            }
            item {
                Spacer(modifier = Modifier.height(20.dp))
                DeliveryOptionSection(
                    restaurantData = restaurantData,
                )
            }
            item {
                Spacer(modifier = Modifier.height(20.dp))
                PriceSummarySection(
                    restaurantData = restaurantData,
                    menuTotalPrice = menuTotalPrice
                )
                Spacer(modifier = Modifier.height(66.dp))
            }
        }
    }
}

@Preview
@Composable
private fun CartScreenPreview() {
    CartScreen(padding = PaddingValues())
}