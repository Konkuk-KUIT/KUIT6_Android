package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTopAppBar

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
        OrderHistoryTopAppBar()

    }
}

@Preview(showBackground = true)
@Composable
private fun OrderHistoryScreenPreview() {
    OrderHistoryScreen(padding = PaddingValues())
}