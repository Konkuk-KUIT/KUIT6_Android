package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.cart.data.CartRestaurantData
import com.kuit.kuit6android.ui.cart.data.MenuData
import com.kuit.kuit6android.ui.cart.data.ShortMenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun PriceSummarySection(
    modifier: Modifier = Modifier,
    restaurantData: CartRestaurantData,
    menuTotalPrice: Int,
) {
    val totalPrice = menuTotalPrice + restaurantData.deliveryFee

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(CoupangEatsTheme.colors.white)
    ) {
        Text(
            text = "결제금액을 확인해주세요",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_03_B_16,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        Column(
            modifier = modifier
                .clip(RoundedCornerShape(20.dp))
                .background(CoupangEatsTheme.colors.white)
                .border(
                    width = 1.dp,
                    shape = RoundedCornerShape(20.dp),
                    color = CoupangEatsTheme.colors.gray300
                )
                .padding(top = 20.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "메뉴 금액",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.body_02_SB_12
                )
                Text(
                    text = "${menuTotalPrice.toDecimalFormat()}원",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.body_02_SB_12
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 10.dp,
                        bottom = 20.dp
                    )
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "배달팁",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.body_02_SB_12
                )
                Text(
                    text = "${restaurantData.deliveryFee.toDecimalFormat()}원",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.body_02_SB_12
                )
            }

            Divider(
                color = CoupangEatsTheme.colors.gray300,
                thickness = 1.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 15.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "결제예정금액",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.head_04_SB_14
                )
                Text(
                    text = "${totalPrice.toDecimalFormat()}원",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.head_04_SB_14
                )
            }
        }
    }
}

@Preview
@Composable
private fun PriceSummarySectionPreview() {
    PriceSummarySection(
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
        ),
        menuTotalPrice = 1111
    )
}