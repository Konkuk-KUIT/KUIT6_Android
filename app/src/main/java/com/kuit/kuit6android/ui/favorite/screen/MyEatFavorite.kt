package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun MyEatFavorite(padding: PaddingValues,
                  onNavigateToDetailPage: (RestaurantData) -> Unit,
                  navController: NavController,
                  modifier: Modifier = Modifier,
                  ) {
    val restaurantList = listOf(
        RestaurantData(
            imageId = R.drawable.salmon,
            name = "건대 연어 덮밥",
            time = 30,
            rating = 4.8,
            reviewCount = "(3,800)"
        ),
        RestaurantData(
            imageId = R.drawable.gomi,
            name = "고미 돈까스",
            time = 30,
            rating = 4.3,
            reviewCount = "(5,700)"
        ),
        RestaurantData(
            imageId = R.drawable.burritopia,
            name = "부리또피아",
            time = 30,
            rating = 4.7,
            reviewCount = "(2,700)"
        )
    )

    Column(
        modifier = Modifier
            .padding(
                padding
            )
            .fillMaxWidth()
            .background(Color.White),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 27.dp)
                .padding(top = 20.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(27.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_back_arrow),
                    contentDescription = "뒤로가기",
                    modifier = modifier
                        .size(24.dp)
                        .clickable { navController.popBackStack() },
                    tint = Color.Gray
                )
                Text(
                    text = "즐겨찾기",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )
            }
            Text(
                text = "수정",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF02AFFE)
            )
        }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 27.dp, end = 27.dp, top = 58.dp, bottom = 24.dp)
        ) {
            Text(
                text = "총 ${restaurantList.size}개",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
        }

        HorizontalDivider(
            Modifier.fillMaxWidth(),
            thickness = 8.dp,
            color = Color(0xFFF7F8F8)
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 27.dp, bottom = 27.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(restaurantList) { restaurant ->
                Column(
                    modifier = modifier.clickable(onClick = {
                        onNavigateToDetailPage(restaurant)
                    })
                ) {
                    // 음식점 이미지
                    Image(
                        painter = painterResource(restaurant.imageId),
                        contentDescription = restaurant.name,
                        modifier = modifier
                            .clip(RoundedCornerShape(8.dp))
                            .size(height = 130.dp, width = 306.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(Modifier.height(5.dp))

                    Row(
                        modifier = modifier.width(306.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = restaurant.name,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Text(
                            text = "${restaurant.time}분",
                            fontSize = 12.sp,
                            color = Color.Black
                        )
                    }

                    Spacer(Modifier.height(10.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = "별점",
                            modifier = modifier
                                .size(15.dp)
                        )
                        Text(
                            text = "${restaurant.rating}" + " (" + restaurant.reviewCount + ")",
                            fontSize = 12.sp,
                            color = Color(0xFF575252)
                        )
                    }
                }
            }
        }
    }
}