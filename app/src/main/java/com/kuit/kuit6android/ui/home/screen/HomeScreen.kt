package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.ui.home.component.CategoryRow
import com.kuit.kuit6android.ui.home.component.CityDropdown
import com.kuit.kuit6android.ui.home.component.GetCouponItem
import com.kuit.kuit6android.ui.home.component.MidBanner
import com.kuit.kuit6android.ui.home.component.SearchTextField
import com.kuit.kuit6android.ui.home.component.recentrestaurant.RecentRestaurantRow

@Composable
fun HomeScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                paddingValues = padding
            ),
//        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            GetCouponItem()
            Row(
                modifier = modifier.padding(
                    start = 27.dp,
                    end = 27.dp,
                    top = 20.dp,
                    bottom = 31.dp
                )
            ) {
                CityDropdown()
            }
            SearchTextField(modifier = modifier.padding(start = 49.dp))
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CategoryRow(modifier = modifier.fillMaxWidth())
                CategoryRow(modifier = modifier.fillMaxWidth())
            }
            Spacer(
                Modifier.height(
                    height = 20.dp
                )
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
//                    .padding(vertical = 20.dp) 대신 위 아래 스페이서
                ,
                contentAlignment = Alignment.Center
            ) {
                MidBanner(
//                    modifier = modifier
//                    .padding(vertical = 20.dp)
//                    .align() 박스 컬럼 로우 레이아웃
//                    레이지 안에는 얼라인 없음
                )
            }
            Spacer(
                Modifier.height(
                    height = 20.dp
                )
            )
            Column(
                modifier = modifier
                    .padding(start = 27.dp)
            ) {
                Text(
                    text = "최근 본 맛집",
                    fontWeight = FontWeight.Bold,
                    fontSize = 17.sp,
                    lineHeight = 20.sp
                )
                RecentRestaurantRow()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(PaddingValues())
}