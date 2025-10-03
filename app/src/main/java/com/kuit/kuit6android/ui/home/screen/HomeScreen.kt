package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.MainActivity
import com.kuit.kuit6android.navigation.MainNavHost
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.Location
import com.kuit.kuit6android.ui.home.component.OrderGoGo
import com.kuit.kuit6android.ui.home.component.RecentMatjib
import com.kuit.kuit6android.ui.home.component.SearchTextField

@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
//    LazyColumn (
//
//    ) {
        //랜더이슈가 발생해서 lazycolunm으로 구현을 못했습니다
//        item{ GetCouponItem() }
//        item{ Location() }
//        item{ SearchTextField(modifier = modifier.padding(start = 49.dp)) }
//        item{ CategoryRow(modifier = modifier.fillMaxWidth()) }
//        item{ CategoryRow(modifier = modifier.fillMaxWidth()) }
//        item { OrderGoGo() }
//        item { RecentMatjib() }
//
    //   }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
            padding
        )
    ) {
        GetCouponItem()
        Location()
        SearchTextField(modifier = modifier.padding(start = 49.dp))
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CategoryRow(modifier = modifier.fillMaxWidth())
            CategoryRow(modifier = modifier.fillMaxWidth())
        }
        OrderGoGo()
        RecentMatjib()
    }
}

@Preview(showBackground = true)
@Composable
private fun homePreview() {
    HomeScreen(PaddingValues())
}