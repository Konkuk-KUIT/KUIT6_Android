package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.home.component.AdvertiseItem
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.LocationSetting
import com.kuit.kuit6android.ui.home.component.RecentMenu
import com.kuit.kuit6android.ui.home.component.SearchTextField

@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                padding
            ),
    ) {
        item { GetCouponItem() }
        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {
                LocationSetting()
            }
        }
        item { SearchTextField(modifier = modifier.padding(start = 49.dp)) }
        item {
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CategoryRow(modifier = modifier.padding(bottom = 14.dp))
                CategoryRow(modifier = modifier.padding(bottom = 14.dp))
            }
        }
        item {
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AdvertiseItem()
            }
        }
        item {
            Column(
                modifier = modifier.padding(start = 27.dp)
            ) {
                RecentMenu()
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(PaddingValues())
}