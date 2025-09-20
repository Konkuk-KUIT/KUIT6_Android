package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
import com.kuit.kuit6android.ui.home.component.CityDropdown
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.SearchTextField

@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
//반드시 레이지여야 함
        modifier = Modifier
            .fillMaxSize()
            .padding(
                paddingValues = padding
            ),
    ) {
        item {
            GetCouponItem()

        }
        item {
            Row {
                CityDropdown()
            }
        }
        item {
            SearchTextField(modifier = modifier.padding(start = 49.dp))

        }
        item {
            LazyColumn(//반드시 레이지여야 함
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item {
                    CategoryRow(modifier = modifier.fillMaxWidth())
                }
                item {
                    CategoryRow(modifier = modifier.fillMaxWidth())
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(PaddingValues())
}