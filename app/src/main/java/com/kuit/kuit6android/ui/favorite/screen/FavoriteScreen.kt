package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.component.recentrestaurant.MockData
import com.kuit.kuit6android.ui.home.component.recentrestaurant.RestaurantItem

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 27.dp
                )
        ) {
            Spacer(
                modifier = Modifier.height(
                    height = 20.dp
                )
            )
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(
                        id = R.drawable.ic_back_arrow2
                    ),
                    contentDescription = "뒤로가기 화살표"
                )
                Spacer(
                    modifier = Modifier.width(
                        width = 27.dp
                    )
                )
                Text(
                    text = "즐겨찾기",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal
                )
                Spacer(
                    modifier = Modifier.weight(
                        weight = 1.0f
                    )
                )
                Text(
                    text = "수정",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(color = 0xFF02AFFE)
                )
            }

            Spacer(
                modifier = Modifier.height(
                    height = 58.dp
                )
            )

            Text(
                text = "총 ${MockData.restaurantList.size}개",
                fontSize = 20.sp
            )

            Spacer(
                modifier = Modifier.height(
                    height = 24.dp
                )
            )
        }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(
                    height = 8.dp
                )
                .background(
                    color = Color(
                        color = 0xFFF7F8F8
                    )
                ),
        ) {

        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    vertical = 27.dp
                ),
            verticalArrangement = Arrangement.spacedBy(
                space = 20.dp
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(
                items = MockData.restaurantList
            ) {
                RestaurantItem(
                    modifier = modifier.size(
                        width = 306.dp,
                        height = 176.dp
                    ),
                    restaurantData = it
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FavoritePreview() {
    FavoriteScreen(
        padding = PaddingValues()
    )
}