package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.home.component.RestaurantItem
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun FavoriteScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues,
    onNavigateToRestaurantDetail: (RestaurantData) -> Unit,
    showBackButton: Boolean = false,
    onBackClick: (()-> Unit)? = null
) {
    Column(
        modifier = Modifier.padding(
            padding,
        ),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        val restaurantList = remember {
            mutableStateListOf(
                RestaurantData(
                    imageId = R.drawable.burgerry,
                    name = "버거리",
                    time = 20,
                    rating = 4.9,
                    reviewCount = "4,900"
                ),
                RestaurantData(
                    imageId = R.drawable.salmon,
                    name = "건대연어덮밥",
                    time = 30,
                    rating = 4.9,
                    reviewCount = "4,700"
                ),
                RestaurantData(
                    imageId = R.drawable.gomi,
                    name = "고미돈가스",
                    time = 30,
                    rating = 4.7,
                    reviewCount = "4,300"
                )
            )
        }

        Row(
            modifier
                .padding(start = 27.dp, end = 27.dp)
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 34.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            if(showBackButton){
                Icon(
                    painter = painterResource(
                        R.drawable.ic_back_arrow
                    ),
                    contentDescription = "뒤로가기 화살표",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { onBackClick?.invoke() }, // 함수 타입 변수는 invoke()로 실행 가능
                    tint = Color(0xFF666668)
                )
            }

            Text(
                modifier = Modifier
                    .weight(1f),
                text = "즐겨찾기",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
            Text(
                text = "수정",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF02AFFE)
            )
        }

        Text(
            text = "총 ${restaurantList.size}개",
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 27.dp)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(8.dp)
                .background(Color(0xFFF7F8F8))
                .padding(bottom = 3.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(restaurantList) { restaurant ->
                RestaurantItem(
                    restaurantData = restaurant,
                    modifier = modifier
                        .clickable(onClick = {
                            onNavigateToRestaurantDetail(restaurant)
                        })
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FavoritePreview() {
    FavoriteScreen(padding = PaddingValues(),onNavigateToRestaurantDetail = {})
}