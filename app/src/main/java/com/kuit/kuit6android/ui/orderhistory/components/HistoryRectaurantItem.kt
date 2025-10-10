package com.kuit.kuit6android.ui.orderhistory.components

import android.icu.text.ListFormatter
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import com.kuit.kuit6android.R
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.extension.toDataFormat
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.orderhistory.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.MenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsColors
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@androidx.compose.ui.tooling.preview.Preview(showBackground = true)
@Composable
fun HistoryRectaurantItemPreView(modifier: Modifier = Modifier) {
    HistoryRestaurantItem(
        restaurantData = HistoryRestaurantData(
            data = "10-01-토",
            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = true,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData("1인세트", 1, "떡볶이 1인 세트"),
            ),
            isClosed = true,
        )
    )
}

@Composable
fun HistoryRestaurantItem(
    modifier: Modifier = Modifier, restaurantData: HistoryRestaurantData
) {
    var isFavorite by rememberSaveable { mutableStateOf(restaurantData.isFavorite) }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(20.dp)
            )
            .height(354.dp)
            .width(320.dp)
            .padding(horizontal = 20.dp)
            .padding(top = 20.dp, bottom = 20.dp)

    ) {
        Row {
            Text(text = restaurantData.data,
                style = CoupangEatsTheme.typograahy.body_01_M_14,
                color = CoupangEatsTheme.colors.Gray500
            )
        }
        Row(
            modifier = modifier
                .padding(top=23.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id=R.drawable.ic_sinjeon),
                contentDescription = "sinjeon",
                modifier = modifier.size(50.dp)
            )
            Text(text = restaurantData.restaurantName,
                style = CoupangEatsTheme.typograahy.head_03_B_16,
                color = CoupangEatsTheme.colors.black,
                modifier = modifier.padding(start = 10.dp)
            )
            Icon(
                modifier = modifier.padding(start = 5.39.dp,end = 38.dp),
                painter = painterResource(id = R.drawable.ic_right),
                contentDescription = "right"
            )
            Icon(painter = painterResource(id = if(isFavorite) R.drawable.ic_full_like else R.drawable.ic_like)
                , contentDescription = "heart icon",
                modifier = modifier.size(30.dp)
                    .clickable{ isFavorite = !isFavorite },
                tint = Color.Unspecified
            )
            println(restaurantData.orderPrice.toDecimalFormat()) //10,000
            println(restaurantData.data.toDataFormat())
        }

        Row(modifier = Modifier.padding(top = 12.dp)) {
            restaurantData.menu.forEach { menu ->
                Text(
                    text = "${menu.menuName}",
                    style = CoupangEatsTheme.typograahy.body_01_M_14,
                    color = CoupangEatsTheme.colors.black,
                    modifier = Modifier.padding(bottom = 5.dp)
                )
                Text(
                    text = "${menu.menuCount}개",
                    style = CoupangEatsTheme.typograahy.body_01_M_14,
                    color = CoupangEatsTheme.colors.Gray300,
                    modifier = Modifier.padding(bottom = 5.dp, start = 8.dp)
                )

            }
        }
        restaurantData.menu.forEach { menu ->
            Text(
                text = " - ${menu.menuDetail}",
                style = CoupangEatsTheme.typograahy.body_02_5B_12,
                color = CoupangEatsTheme.colors.Gray500,
            )
        }
        Box(
            modifier = modifier
                .padding(top = 20.dp)
                .width(279.dp)
                .height(1.dp)
                .background(color = CoupangEatsTheme.colors.Gray300)
        )
        Row(
            modifier = modifier.padding(top = 20.dp)
        ) {
            Text(text = "결제금액",
                style = CoupangEatsTheme.typograahy.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
            Text(text = "${restaurantData.orderPrice}원",
                style = TextStyle(
                    textDecoration = TextDecoration.LineThrough,
                ),
                color = CoupangEatsTheme.colors.Gray500,
                modifier = modifier.padding(start = 85.dp)
            )
            Text(
                text = "${restaurantData.salePrice}원",
                modifier = modifier.padding(start = 7.dp),
                style = CoupangEatsTheme.typograahy.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
        }

        Box(
            modifier = modifier
                .padding(start =104.dp, top = 21.dp)
                .width(175.dp)
                .height(28.dp)
                .clip(shape = RoundedCornerShape(20.dp))
                .background(color = CoupangEatsTheme.colors.Lavender)
                .padding(vertical = 8.dp, horizontal = 14.dp)

        ){
            Image(
                painter = painterResource(id = R.drawable.ic_sonic),
                contentDescription = "sonic",
                )
            Text(text = "${restaurantData.orderPrice-restaurantData.salePrice}원 할인이 적용",
                style = CoupangEatsTheme.typograahy.body_02_5B_12,
                color = CoupangEatsTheme.colors.Purple,
                modifier = modifier.padding(start = 14.dp)
            )
        }

        Box(
            modifier = modifier.padding(top = 20.dp)
        ){
            if(restaurantData.isClosed){
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .border(
                            width = 1.dp,
                            color = Color.Gray,
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(horizontal = 81.dp)
                        .padding(top = 12.dp, bottom = 10.dp)
                ){
                    Text(text = "같은 메뉴 담기",
                        style = CoupangEatsTheme.typograahy.head_02_B_20,
                        color = CoupangEatsTheme.colors.Gray300
                    )
                    Text(text = "오픈 전 가게예요",
                        style = CoupangEatsTheme.typograahy.head_05_B_10,
                        color = CoupangEatsTheme.colors.Gray300,
                        modifier = modifier.padding(top = 25.dp)
                    )
                }
            }
        }


    }
}