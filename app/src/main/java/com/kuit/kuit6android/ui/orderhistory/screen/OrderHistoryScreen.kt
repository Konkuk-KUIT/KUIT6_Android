package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.orderhistory.screen.component.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.screen.component.HistoryRestaurantItem
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryDropdownItem
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryTopBar
import com.kuit.kuit6android.ui.orderhistory.screen.data.HistoryRestaurantDate

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.padding(
            padding
        )
    ) {
        OrderHistoryTopBar(
            modifier = Modifier.padding(
                top = 20.dp,
                start = 20.dp,
                end = 20.dp,
                bottom = 20.dp
            )
        )
        OrderHistoryTextField(modifier = Modifier.padding(start = 20.dp, end = 20.dp))
        Row(
            modifier = Modifier.padding(top = 12.dp, start = 20.dp, bottom = 15.dp)
        ) {
            OrderHistoryDropdownItem(modifier = Modifier.padding(), "주소")
            OrderHistoryDropdownItem(modifier = Modifier.padding(), "조회기간")
            OrderHistoryDropdownItem(modifier = Modifier.padding(), "주문 상태 정보")
        }
        FreeDeliveryItem(modifier = Modifier.padding(bottom = 15.dp))
        LazyColumn(
            modifier = Modifier.padding()
        ) {

        }
    }
}