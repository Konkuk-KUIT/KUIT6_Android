package com.kuit.kuit6android.ui.home.component

import android.icu.text.DecimalFormat
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun  RecentlyViewedItem(
    modifier: Modifier = Modifier,
    w: Dp,
    restaurantData: RestaurantData
) {
    Column(
        modifier = modifier
//            .size(width = w, height = 176.dp)
            .width(w)
            .wrapContentHeight() // 에뮬레이터에서 잘려 보여서...
    ) {
        Image(
            painter = painterResource(restaurantData.imageId),
            contentDescription = restaurantData.name,
            modifier = Modifier
                .size(width = w, height = 129.dp)
                .clip(shape = RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop // 사진 비율에 따른 여백 문제 해결(잘리더라도 꽉 채우게)
        )
        Row(
            modifier = Modifier
                .width(w)
                .padding(top = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = restaurantData.name,
                color = Color.Black,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = restaurantData.time,
                color = Color.Black,
                fontSize = 12.sp
            )
        }
        Row(
            modifier = Modifier.padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_star),
                contentDescription = "img_star",
                modifier = Modifier.size(width = 15.dp, height = 15.dp)
            )
            val revNum = DecimalFormat("#,###").format(restaurantData.reviewNum) // 천 단위 콤마
            Text(
                text = "${restaurantData.rate} (${revNum})",
                color = Color(0xFF575252).copy(alpha = 0.99f), // 투명도: 기존 Color에 .copy(alpha = ...)
                fontSize = 12.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecentItemPrev() {
    RecentlyViewedItem(
        w = 306.dp,
        restaurantData = RestaurantData(
            imageId = R.drawable.img_ourddeokbokki,
            name = "아워떡볶이",
            time = "30분",
            rate = 4.9f,
            reviewNum = 3849
        )
    )
}