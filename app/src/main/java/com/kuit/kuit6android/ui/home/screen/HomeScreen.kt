package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.home.component.Advertise
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.Location
import com.kuit.kuit6android.ui.home.component.SearchTextField
import com.kuit.kuit6android.ui.home.component.recent

@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    GetCouponItem()
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 45.dp)
    ) {
        Location(modifier = modifier.padding(top = 10.dp))
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 132.dp)
    ) {
        SearchTextField(modifier = modifier.padding(horizontal = 27.dp))
        Column(modifier = modifier.padding(horizontal = 22.dp, vertical = 22.dp)) {
            CategoryRow(modifier = modifier.fillMaxWidth())
            CategoryRow(modifier = modifier.padding(top = 14.dp).fillMaxWidth())
        }
    }
    Column(
        modifier = modifier.fillMaxWidth().padding(top = 350.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Advertise()
    }

    Column(
        modifier = modifier.padding(start = 27.dp)
    ) {
        recent()
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(PaddingValues())
}