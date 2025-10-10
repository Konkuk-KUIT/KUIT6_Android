package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kuit.kuit6android.ui.orderhistory.component.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryDropdownItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTopAppBar
import com.kuit.kuit6android.ui.orderhistory.data.OrderHistoryStoreColumn
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(padding)
            .fillMaxSize() // 전체 화면 채우기
            .background(CoupangEatsTheme.colors.white)
    ) {
        OrderHistoryTopAppBar(
            navController = navController
        )
        Spacer(modifier = Modifier.height(10.dp))
        OrderHistoryTextField(
            value = "",
            onValueChange = {},
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            OrderHistoryDropdownItem(category = "주소")
            OrderHistoryDropdownItem(category = "조회기간")
            OrderHistoryDropdownItem(category = "주문 상태-정보")
        }

        Spacer(modifier = Modifier.height(12.dp))

        // 👇 Column 내부에 LazyColumn 배치
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Column 내부에서 남은 공간만큼 차지하게
        ) {
            item { FreeDeliveryItem() }
            item { OrderHistoryStoreColumn() }
        }
    }
}
