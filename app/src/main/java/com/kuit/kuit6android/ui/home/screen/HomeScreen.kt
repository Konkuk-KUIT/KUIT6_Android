package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.SearchTextField

@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                paddingValues = padding
            )
    ) {
        GetCouponItem()
        //여기를 레이지 컬럼으로 하라?
        Column(modifier = modifier.padding(horizontal = 27.dp)) {
            SearchTextField(modifier = modifier.padding(horizontal = 22.dp))
            CategoryRow(modifier = modifier.fillMaxWidth())
            CategoryRow(modifier = modifier.fillMaxWidth())
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(PaddingValues())
}