package com.kuit.kuit6android.ui.orderhistory.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.orderhistory.component.FreeDeliveryItem
import com.kuit.kuit6android.ui.orderhistory.component.HistoryRestaurantItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryDropdownItem
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTextField
import com.kuit.kuit6android.ui.orderhistory.component.OrderHistoryTopAppBar
import com.kuit.kuit6android.ui.orderhistory.data.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.data.MenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderHistoryScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    onCartClick: () -> Unit = {}
) {
    val historyRestaurantList = remember {
        mutableStateListOf(
            HistoryRestaurantData(
                date = "10-4-토",
                restaurantName = "신전떡볶이 중곡역점",
                isFavorite = true,
                orderPrice = 10000,
                salePrice = 8500,
                menu = listOf(
                    MenuData("1인세트", 1, "떡볶이 1인분, 모듬튀김, 쥬시쿨")
                ),
                isOpened = false,
                imageId = R.drawable.img_shinjeon
            ),
            HistoryRestaurantData(
                date = "10-3-금",
                restaurantName = "처갓집양념치킨 중곡역점",
                isFavorite = true,
                orderPrice = 24000,
                salePrice = 20000,
                menu = listOf(
                    MenuData("슈프림양념치킨", 1, "뼈, 토핑떡사리")
                ),
                isOpened = false,
                imageId = R.drawable.img_ch_chicken
            ),
            HistoryRestaurantData(
                date = "9-27-토",
                restaurantName = "동대문엽기떡볶이 건대점",
                isFavorite = true,
                orderPrice = 20700,
                salePrice = 18500,
                menu = listOf(
                    MenuData("실속세트", 1, "반반, [엽기] 덜매운맛")
                ),
                isOpened = true,
                imageId = R.drawable.img_yeopddeok
            ),
            HistoryRestaurantData(
                date = "9-22-수",
                restaurantName = "피자나라치킨공주 건대점",
                isFavorite = true,
                orderPrice = 30300,
                salePrice = 28300,
                menu = listOf(
                    MenuData("갈릭스테이크피치세트", 1, "스테이크피자, 순살 쉬림프 치킨")
                ),
                isOpened = true,
                imageId = R.drawable.img_pncg
            ),
        )
    }
    Column (
        modifier = Modifier.padding(padding)
    ){
        Column(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp)
        ) {
            OrderHistoryTopAppBar(onCartClick = onCartClick)
            Spacer(modifier = Modifier.padding(top = 20.dp))
            OrderHistoryTextField()
            Spacer(modifier = Modifier.padding(top = 12.dp))
            Row() {
                OrderHistoryDropdownItem(category = "주소")
                Spacer(modifier = Modifier.padding(start = 8.dp))
                OrderHistoryDropdownItem(category = "조회기간")
                Spacer(modifier = Modifier.padding(start = 8.dp))
                OrderHistoryDropdownItem(category = "주문 상태·정보")
            }
        }

        Divider(
            thickness = 1.dp,
            color = CoupangEatsTheme.colors.gray300,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 7.dp)
        )

        LazyColumn(
            modifier = Modifier.padding(horizontal = 20.dp)
        ) {
            item {
                Spacer(modifier = Modifier.padding(top = 7.dp))
                FreeDeliveryItem()
                Spacer(modifier = Modifier.padding(top = 15.dp))
            }
            items(historyRestaurantList) { restaurant ->
                HistoryRestaurantItem(restaurantData = restaurant)
                Spacer(modifier = Modifier.padding(top = 20.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OrderHistoryScreenPreview() {
    OrderHistoryScreen(padding = PaddingValues())
}