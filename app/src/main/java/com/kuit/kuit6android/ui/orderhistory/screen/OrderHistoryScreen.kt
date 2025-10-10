package com.kuit.kuit6android.ui.orderhistory.screen

import OrderItemCard
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.orderhistory.component.FreeDeliveryBanner
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryFilterRow
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistorySearchBar
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTopBar
import com.kuit.kuit6android.ui.orderhistory.data.OrderHistorySampleData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    onCartClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val orderItems = remember { OrderHistorySampleData.sampleOrderItems }
    var searchQuery by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(padding)
            .background(CoupangEatsTheme.colors.white)
    ) {
        //주문내역 & 장바구니
        OrderHistoryTopBar(
            onCartClick = onCartClick
        )
        //검색창
        OrderHistorySearchBar(
            value = searchQuery,
            onValueChange = { searchQuery = it }
        )
        //주소 조회기간, 주문 상태정보
        OrderHistoryFilterRow()
        HorizontalDivider(
            modifier = modifier.padding(
                bottom = 7.dp
            )
        )
        //지금 주문하면 무료배달
        FreeDeliveryBanner()

        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 15.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(orderItems) { item ->
                OrderItemCard(item)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderHistoryScreenPreview() {
    KUIT6_ANDROIDTheme {
        OrderHistoryScreen(
            padding = PaddingValues(0.dp)
        )
    }
}