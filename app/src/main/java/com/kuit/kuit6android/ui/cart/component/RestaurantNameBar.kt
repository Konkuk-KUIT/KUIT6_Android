package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.cart.data.CartRestaurantData
import com.kuit.kuit6android.ui.cart.data.MenuData
import com.kuit.kuit6android.ui.cart.data.ShortMenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun RestaurantNameBar(
    modifier: Modifier = Modifier,
    restaurantData: CartRestaurantData
) {
    Row(
        modifier = modifier
            .background(CoupangEatsTheme.colors.white)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = restaurantData.imageId),
            contentDescription = restaurantData.restaurantName,
            modifier = Modifier
                .size(30.dp)
                .clip(RoundedCornerShape(5.dp)),
            contentScale = ContentScale.Crop,
        )
        Text(
            text = restaurantData.restaurantName,
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_03_B_16,
            modifier = Modifier.padding(start = 10.dp, end = 7.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_right),
            contentDescription = "ic_right",
            tint = CoupangEatsTheme.colors.black,
            modifier = Modifier.size(16.dp)
        )
    }
}

@Preview
@Composable
private fun RestaurantNameBarPreview() {
    RestaurantNameBar(
        restaurantData = CartRestaurantData(
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