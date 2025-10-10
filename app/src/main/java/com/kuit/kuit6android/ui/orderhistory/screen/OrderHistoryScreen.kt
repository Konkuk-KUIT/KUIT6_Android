package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.orderhistory.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.MenuData
import com.kuit.kuit6android.ui.orderhistory.component.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.component.HistoryRestaurantItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryDropdownItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTopAppBar

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    restaurantList: List<HistoryRestaurantData>
) {
    Column(
        modifier = Modifier.padding(
            padding
        )
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 20.dp)
            .padding(top = 20.dp)
    ) {
        OrderHistoryTopAppBar()
        Spacer(modifier = Modifier.height(25.dp))
        OrderHistoryTextField()
        Row(
            modifier = Modifier.padding(top = 12.dp, bottom = 7.dp, start = 20.dp)
                .fillMaxWidth()
        ) {
            OrderHistoryDropdownItem(category = "주소")
            OrderHistoryDropdownItem(category = "조회기간")
            OrderHistoryDropdownItem(category = "주문상태/정보")
        }
        HorizontalDivider(
            thickness = 1.dp
        )
        Spacer(modifier = modifier.padding(top = 7.dp))
        FreeDeliveryItem()
        LazyColumn(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ) {
            items(restaurantList) {
                item->HistoryRestaurantItem(restaurantData = item)
            }
        }
    }
}

@Preview
@Composable
private fun OrderHistoryPreview() {
    OrderHistoryScreen(padding = PaddingValues(),
        restaurantList = listOf(
            HistoryRestaurantData(
                date = "10-4-토",
                isFavorite = true,
                restaurantName = "신전떡볶이 중곡역점",
                orderPrice = 10000,
                salePrice = 2000,
                menu = listOf(
                    MenuData("1인세트",1,"떡볶이 1인분, 모듬튀김, 쥬시쿨")
                ),
                isClosed = true,
            )
        )
    )
}