package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.cart.data.CartRestaurantData
import com.kuit.kuit6android.ui.cart.data.MenuData
import com.kuit.kuit6android.ui.cart.data.ShortMenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun DeliveryOptionSection(modifier: Modifier = Modifier,
                          restaurantData: CartRestaurantData) {
    var selectedOption by rememberSaveable { mutableStateOf("가게배달") }

    Column(
        modifier = modifier.background(CoupangEatsTheme.colors.white)
    ) {
        Text(
            text = "수령방법을 선택해주세요",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_03_B_16,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        DeliveryOptionItem(
            optionString = "가게배달",
            timeString = restaurantData.deliveryTime,
            isSelected = selectedOption == "가게배달",
            onClick = { selectedOption = "가게배달" }
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        DeliveryOptionItem(
            optionString = "픽업",
            timeString = restaurantData.pickUpTime,
            isSelected = selectedOption == "픽업",
            onClick = { selectedOption = "픽업" }
        )
    }
}

@Preview
@Composable
private fun DeliveryOptionSectionPreview() {
    DeliveryOptionSection(
        restaurantData = CartRestaurantData(
            deliveryTime = "22~37",
            pickUpTime = "14~24",
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
            recommendMenuList = listOf(
                ShortMenuData(
                    "황금올리브치킨 핫크리스피",
                    24500,
                    R.drawable.img_bbq_h_o
                ),
                ShortMenuData(
                    "제로콜라",
                    24500,
                    R.drawable.img_zero_coke
                ),
                ShortMenuData(
                    "BBQ 떡볶이",
                    24500,
                    R.drawable.img_bbq_ddeokbokki
                ),
                ShortMenuData(
                    "BBQ볼(5개)",
                    24500,
                    R.drawable.img_bbq_ball
                )
            )
        )
    )
}