package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.restaurantData

@Composable
fun RecentlyViewedRow(modifier: Modifier = Modifier) {
    val restaurantList = listOf(
        restaurantData(
            imageId = R.drawable.img_ourddeokbokki,
            name = "아워떡볶이",
            time = "30분",
            rate = 4.9f,
            reviewNum = 3849
        ),
        restaurantData(
            imageId = R.drawable.img_konoha,
            name = "코노하 건대점",
            time = "25분",
            rate = 4.9f,
            reviewNum = 2744
        ),
        restaurantData(
            imageId = R.drawable.img_twozzim,
            name = "두찜 건대점",
            time = "30분",
            rate = 4.7f,
            reviewNum = 795
        ),
        restaurantData(
            imageId = R.drawable.img_xihongshi,
            name = "시홍쓰",
            time = "40분",
            rate = 4.4f,
            reviewNum = 1143
        ),
        restaurantData(
            imageId = R.drawable.img_opoke,
            name = "오포케",
            time = "15분",
            rate = 3.9f,
            reviewNum = 6847
        )
    )
    Column (
        modifier = modifier.padding(start = 27.dp)
            .fillMaxWidth()
    ){
        Text(
            text = "최근 본 맛집",
            color = Color.Black,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(bottom = 25.dp)
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(21.dp)
        ) {
            items(restaurantList) { restaurant ->
                RecentlyViewedItem(restaurantData = restaurant)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecentPrev() {
    RecentlyViewedRow()
}