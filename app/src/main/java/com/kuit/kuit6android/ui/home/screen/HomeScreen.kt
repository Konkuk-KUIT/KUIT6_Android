package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.LocationItem
import com.kuit.kuit6android.ui.home.component.RecentMenu
import com.kuit.kuit6android.ui.home.component.SearchTextField
import com.kuit.kuit6android.ui.home.component.WowDelivery


@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(
                    padding
                ),
          horizontalAlignment = Alignment.CenterHorizontally
        ) {
            item {
                GetCouponItem()
            }
            item {
                Spacer(Modifier.height(14.dp))
                LocationItem()
            }
            item {
                SearchTextField(
                    modifier = Modifier.padding(start = 49.dp)
                )
            }
            items(2) {
                CategoryRow(/*modifier = Modifier.fillMaxWidth()*/)
            }
            item {
                Spacer(Modifier.height(14.dp))
                WowDelivery()
            }
            item {
                Spacer(Modifier.height(24.dp))
                RecentMenu()
            }
        }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        padding = PaddingValues(),
        modifier = Modifier.fillMaxSize()
    )
}


