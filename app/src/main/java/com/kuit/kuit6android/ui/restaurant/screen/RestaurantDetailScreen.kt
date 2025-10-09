package com.kuit.kuit6android.ui.restaurant.screen

import android.icu.text.DecimalFormat
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route

@Composable
fun RestaurantDetailScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues,
    restaurant: Route.RestaurantDetail,
    onBackClick: (() -> Unit)? = null
) {

    Column(
        modifier = Modifier.padding(
            padding
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier
                .padding(start = 27.dp, end = 27.dp)
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                painter = painterResource(
                    R.drawable.ic_back_arrow
                ),
                contentDescription = "뒤로가기 화살표",
                modifier = Modifier
                    .size(24.dp)
                    .clickable{onBackClick?.invoke()},
                tint = Color(0xFF666668)

            )
            Image(
                painter = painterResource(R.drawable.img_like),
                contentDescription = "like",
                modifier = Modifier
                    .size(30.dp),
                colorFilter = ColorFilter.tint(Color(0xFF939DA9))
            )
        }

        Image(
            painter = painterResource(restaurant.imageId),
            contentDescription = restaurant.name,
            modifier = Modifier
                .width(360.dp)
                .height(149.dp),
//                .fillMaxWidth()
//                .aspectRatio(360f / 149f), // 가로 기준 세로 비율 자동 결정
            contentScale = ContentScale.Crop // 사진 비율에 따른 여백 문제 해결(잘리더라도 꽉 채우게)
        )

        Text(
            text = restaurant.name,
            color = Color.Black,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 25.dp, bottom = 8.dp)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_star),
                contentDescription = "img_star",
                modifier = Modifier.size(width = 20.dp, height = 15.dp)
            )
            val revNum = DecimalFormat("#,###").format(restaurant.reviewNum) // 천 단위 콤마
            Text(
                text = "${restaurant.rate} (${revNum})",
                color = Color(0xFF575252).copy(alpha = 0.99f), // 투명도: 기존 Color에 .copy(alpha = ...)
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RestaurantDetailPrev() {
    RestaurantDetailScreen(
        padding = PaddingValues(), restaurant = Route.RestaurantDetail(
            imageId = R.drawable.img_ourddeokbokki,
            name = "아워떡볶이",
            time = "30분",
            rate = 4.9f,
            reviewNum = 3849
        )
    )
}