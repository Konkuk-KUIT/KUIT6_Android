package com.kuit.kuit6android.ui.orderhistory.screen

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.orderhistory.screen.component.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.screen.component.HistoryRestraurantItem
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryDropdownItem
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryTopAppBar

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    storeList: List<HistoryRestraurantData>
) {
    Column(
        modifier = Modifier.padding(
            padding
        )
    ) {
        OrderHistoryTopAppBar(modifier = Modifier.padding(top = 50.dp, bottom = 20.dp, end = 20.dp, start = 20.dp))
        OrderHistoryTextField(modifier = Modifier.padding(start = 20.dp, end = 20.dp))
        Row(
            modifier = Modifier.padding(top = 12.dp, bottom = 15.dp, start = 20.dp)
        ) {
            OrderHistoryDropdownItem("주소")
            OrderHistoryDropdownItem("조회기간")
            OrderHistoryDropdownItem("주문 상태 정보")
        }
        HorizontalDivider(thickness = 1.dp)
        FreeDeliveryItem(modifier = Modifier.padding(bottom = 15.dp, start = 20.dp, end = 20.dp, top = 7.dp))
        LazyColumn(
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        ){
            items(storeList){
                item -> HistoryRestraurantItem(restraurantData = item)
            }
        }
    }
}

@Preview
@Composable
private fun OrderHistoryScreenPreview() {
    OrderHistoryScreen(padding = PaddingValues(), storeList = listOf(
        HistoryRestraurantData(
            date = "10-4-토",
            restraurantName = "홍콩반점",
            isFavorite = false,
            orderPrice = 10000,
            salePrice = 5000,
            menu = listOf(
                MenuListData(
                    menuName = "1인 세트",
                    menuCount = 1,
                    menuDetail = "떡볶이 1인분"
                )
            ),
            isClosed = false,
            RestrauntImg = R.drawable.storeexample
        )
    ))
}