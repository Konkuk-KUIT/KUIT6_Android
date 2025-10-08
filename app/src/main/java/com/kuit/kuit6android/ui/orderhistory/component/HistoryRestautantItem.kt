package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDateFormat
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.orderhistory.data.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.data.MenuData

@Composable
fun HistoryRestaurantItem(modifier: Modifier = Modifier, restaurantData: HistoryRestaurantData) {
    var isFavorite by rememberSaveable { mutableStateOf(restaurantData.isFavorite) }
    Icon(
        painter = painterResource(id = if (isFavorite) R.drawable.ic_filled_like else R.drawable.ic_blank_like),
        contentDescription = "heart icon",
        modifier = modifier
            .size(30.dp)
            .clickable { isFavorite = !isFavorite },
        tint = Color.Unspecified
    )
    println(restaurantData.orderPrice.toDecimalFormat()) // 10,000
    println(restaurantData.date.toDateFormat()) // 10월 4일 (토)
}

@Preview
@Composable
private fun HistoryRestaurantItemPreview() {
    HistoryRestaurantItem(
        restaurantData = HistoryRestaurantData(
            date = "10-4-토",
            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = true,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData("1인세트", 1,"떡볶이 1인분, 모듬튀김, 쥬시쿨")
            ),
            isOpened = false
        )
    )
}