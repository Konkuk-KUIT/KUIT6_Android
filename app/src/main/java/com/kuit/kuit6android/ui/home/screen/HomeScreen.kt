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
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.GoOrderItem
import com.kuit.kuit6android.ui.home.component.RegionSelectionRow
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
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) { RegionSelectionRow() }
        }
        item {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 11.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) { SearchTextField(modifier = modifier.padding(start = 49.dp)) } // 높이 55라 생각 20/15/20
        }
        item {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CategoryRow(modifier = modifier.fillMaxWidth())
                CategoryRow(modifier = modifier.fillMaxWidth())
            }
        }
        item {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 14.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                GoOrderItem()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(PaddingValues())
}