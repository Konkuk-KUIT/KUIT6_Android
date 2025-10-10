package com.kuit.kuit6android.ui.orderhistory.data

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDateFormat
import com.kuit.kuit6android.ui.orderhistory.component.HistoryRestaurantItem

@Composable
fun OrderHistoryStoreColumn(modifier: Modifier = Modifier) {

    val restaurantList = listOf(
        HistoryRestaurantData(
            date = "10-4-토".toDateFormat(),

            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = true,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData("1인세트", 1, "1인분, 모둠튀김, 쥬시쿨")
            ),
            isClosed = true,
            imageResId = R.drawable.historyimg1,
        ),
        HistoryRestaurantData(
            date = "10-3-금".toDateFormat(),
            restaurantName = "처갓집양념치킨 중곡역점",
            isFavorite = false,
            orderPrice = 24000,
            salePrice = 20000,
            menu = listOf(
                MenuData("슈프림양념치킨", 1, "뼈, 토핑떡사리")
            ),
            isClosed = true,
            imageResId = R.drawable.historyimg2,
        ),
        HistoryRestaurantData(
            date = "10-1-수".toDateFormat(),
            restaurantName = "동대문 엽기떡볶이 건대점",
            isFavorite = true,
            orderPrice = 20700,
            salePrice = 18500,
            menu = listOf(
                MenuData("실속세트", 1, "반반, [엽기] 덜매운맛")
            ),
            isClosed = false,
            imageResId = R.drawable.historyimg3,
        ),
        HistoryRestaurantData(
            date = "9-22-수".toDateFormat(),
            restaurantName = "피자나라 치킨공주 건대점",
            isFavorite = true,
            orderPrice = 13000,
            salePrice = 13000,
            menu = listOf(
                MenuData("아아아", 1, "콜라 포함")
            ),
            isClosed = false,
            imageResId = R.drawable.historyimg4,
        ),
    )
    Column(modifier = modifier) {
        restaurantList.forEach { restaurant ->
            HistoryRestaurantItem(restaurantData = restaurant)
        }
    }

}
