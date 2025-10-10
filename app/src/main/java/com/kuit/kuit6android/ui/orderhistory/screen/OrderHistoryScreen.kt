package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.orderhistory.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.MenuData
import com.kuit.kuit6android.ui.orderhistory.components.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.components.HistoryRestaurantItem
import com.kuit.kuit6android.ui.orderhistory.components.OrderHistoryDropDownItem
import com.kuit.kuit6android.ui.orderhistory.components.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.components.OrderHistoryTopAppBar

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = Modifier.padding(
            top = 25.dp
        )
            .padding(horizontal = 20.dp)
    ) {
        item(
        ) {
            OrderHistoryTopAppBar(
                modifier = modifier.padding(bottom = 25.dp)
            )
        }
        item {
            OrderHistoryTextField()
        }
        item {
            Row(
                modifier = modifier.padding(top = 12.dp, bottom = 15.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OrderHistoryDropDownItem(category = "주소")
                OrderHistoryDropDownItem(category = "조회기간")
                OrderHistoryDropDownItem(category = "주문상태정보")
            }
        }
        item {
            FreeDeliveryItem()
        }
        item {
            HistoryRestaurantItem(
                modifier = modifier.padding(top = 15.dp),
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
        item {
            HistoryRestaurantItem(
                modifier = modifier.padding(top = 15.dp),
                restaurantData = HistoryRestaurantData(
                    data = "10-01-토",
                    restaurantName = "처갓집양념치킨 중곡역점",
                    isFavorite = true,
                    orderPrice = 24000,
                    salePrice = 20000,
                    menu = listOf(
                        MenuData("슈프림양넘치킨", 1, "뼈, 토핑떡사리"),
                    ),
                    isClosed = true,
                )
            )
        }
        item {
            HistoryRestaurantItem(
                modifier = modifier.padding(top = 15.dp),
                restaurantData = HistoryRestaurantData(
                    data = "10-01-토",
                    restaurantName = "동대문엽기떡볶이 건대점",
                    isFavorite = true,
                    orderPrice = 20700,
                    salePrice = 18500,
                    menu = listOf(
                        MenuData("실속세트", 1, "반반,[엽기] 덜매운맛"),
                    ),
                    isClosed = true,
                )
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun OrderHistoryPreV() {
    OrderHistoryScreen(padding = PaddingValues(0.dp))
}
