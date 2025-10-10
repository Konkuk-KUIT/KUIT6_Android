package com.kuit.kuit6android.ui.orderhistory.screen.component

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
import com.kuit.kuit6android.ui.orderhistory.screen.data.HistoryRestaurant
import com.kuit.kuit6android.ui.orderhistory.screen.data.MenuData

@Composable
fun HistoryRestaurantItem(modifier: Modifier = Modifier, restaurantDate: HistoryRestaurant) {

    var isFavorite by rememberSaveable { mutableStateOf(restaurantDate.isFavorite) }
    Icon(
        painter = painterResource(
            id = if (isFavorite) R.drawable.ic_fill_like
            else R.drawable.ic_like
        ),
        contentDescription = "heart Icon",
        modifier = modifier
            .size(30.dp)
            .clickable { isFavorite = !isFavorite }, tint = Color.Unspecified
    )
    println(restaurantDate.orderPrice.toDecimalFormat())
    println(restaurantDate.date.toDateFormat())


}

@Preview(showBackground = true)
@Composable
private fun HistoryRestaurantItemPreview() {
    HistoryRestaurantItem(
        restaurantDate = HistoryRestaurant(
            date = "10-4 토",
            isFavorite = true,
            restaurantName = "신전떡볶이 중곡역점",
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(MenuData("1인세트", 1, "떡볶이 1인분, 모듬튀김, 쥬시쿨")),
            isOpened = false

        )
    )
}

