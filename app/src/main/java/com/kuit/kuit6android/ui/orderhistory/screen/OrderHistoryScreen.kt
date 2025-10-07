package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.orderhistory.component.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.component.HistoryRestaurantItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryDropdownItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTopAppBar
import com.kuit.kuit6android.ui.orderhistory.data.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.data.MenuData

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    onNavigateToCartPage: () -> Unit
) {
    val restaurantList = listOf(
        HistoryRestaurantData(
            date = "10-4-토",
            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = false,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData(
                    "1인세트", 1, "떡볶이 1인분, 모듬튀김, 쥬시쿨"
                )
            ),
            isOpened = false,
            imageId = R.drawable.img_sinjeon
        ),
        HistoryRestaurantData(
            date = "10-3-금",
            restaurantName = "처갓집양념치킨 중곡역점",
            isFavorite = false,
            orderPrice = 24000,
            salePrice = 20000,
            menu = listOf(
                MenuData(
                    "슈프림양념치킨", 1, "뼈, 토핑떡사리"
                )
            ),
            isOpened = false,
            imageId = R.drawable.img_cheogajip
        ),
        HistoryRestaurantData(
            date = "9-27-토",
            restaurantName = "동대문엽기떡볶이 건대점",
            isFavorite = true,
            orderPrice = 20700,
            salePrice = 18500,
            menu = listOf(
                MenuData(
                    "실속세트", 1, "반반, [엽기] 덜매운맛"
                )
            ),
            isOpened = true,
            imageId = R.drawable.img_yeoptteok
        ),
        HistoryRestaurantData(
            date = "9-22-수",
            restaurantName = "피자나라치킨공주 건대점",
            isFavorite = false,
            orderPrice = 18000,
            salePrice = 16500,
            menu = listOf(
                MenuData(
                    "2인세트", 1, "콤비네이션, 콜라"
                )
            ),
            isOpened = false,
            imageId = R.drawable.img_pizza
        )
    )

    Column(
        modifier = Modifier
            .padding(
                horizontal = 20.dp
            )
            .padding(top = 45.dp, bottom = 130.dp)
    ) {
        OrderHistoryTopAppBar(Modifier,onNavigateToCartPage)
        Spacer(modifier = modifier.padding(bottom = 20.dp))
        OrderHistoryTextField()
        Row(
            modifier = modifier.padding(top = 12.dp, bottom = 7.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OrderHistoryDropdownItem(Modifier, "주소")
            OrderHistoryDropdownItem(Modifier, "조회기간")
            OrderHistoryDropdownItem(Modifier, "주문 상태·정보")
        }
        HorizontalDivider(Modifier,1.dp, Color(0xFFD9D9D9))

        LazyColumn(
            modifier = modifier,
        ) {
            item {
                Spacer(modifier = modifier.padding(bottom = 7.dp))
                FreeDeliveryItem()
                Spacer(modifier = modifier.padding(bottom = 15.dp))
            }

            items(items = restaurantList) { restaurant ->
                HistoryRestaurantItem(Modifier, restaurant)
                Spacer(modifier = modifier.padding(bottom = 20.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OrderHistoryScreenPreview() {
    OrderHistoryScreen(PaddingValues(), Modifier,{})
}