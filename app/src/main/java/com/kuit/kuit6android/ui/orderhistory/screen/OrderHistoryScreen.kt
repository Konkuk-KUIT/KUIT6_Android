package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kuit.kuit6android.ui.orderhistory.screen.component.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.screen.component.OrderHistoryTopAppBar

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.padding(padding)
    ) {
        OrderHistoryTopAppBar(navController = navController)
        OrderHistoryTextField()
        FreeDeliveryItem()
    }
}

@Preview(showBackground = true)
@Composable
private fun OrderHistoryScreenPreview() {
    val navController = rememberNavController()
    OrderHistoryScreen(
        padding = PaddingValues(),
        navController = navController
    )
}
