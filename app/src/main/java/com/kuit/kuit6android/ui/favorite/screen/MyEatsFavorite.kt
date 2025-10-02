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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.StoreData

@Composable
fun MyEatsFavorite(
    padding: PaddingValues,
    onNavigateToDetailPage: (StoreData) -> Unit,
    navController: NavController,
    modifier: Modifier = Modifier,
) {

    val storeList = listOf(
        StoreData(
            imageId = R.drawable.img_food,
            name = "아워떡볶이",
            deliveryTime = 30,
            score = 4.9,
            reviewCount = "3,849"
        ),
        StoreData(
            imageId = R.drawable.img_soup,
            name = "값찌개",
            deliveryTime = 41,
            score = 4.1,
            reviewCount = "1,544"
        ),
        StoreData(
            imageId = R.drawable.img_bhc,
            name = "BHC 건대점",
            deliveryTime = 50,
            score = 4.3,
            reviewCount = "4,549"
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
                        .clickable { navController.popBackStack() }, // 이전 화면으로 이동
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
                text = "총 ${storeList.size}개",
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

        // 등록된 가게
        // LazyColumn으로 가게 수에 따라 스크롤 가능
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 27.dp, bottom = 27.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(storeList) { store ->
                Column(
                    modifier = modifier.clickable(onClick = {
                        onNavigateToDetailPage(store) // 눌렀을 때 가게 정보 페이지로 이동하는 함수 호출
                    })
                ) {
                    // 음식점 이미지
                    Image(
                        painter = painterResource(store.imageId),
                        contentDescription = store.name,
                        modifier = modifier
                            .clip(RoundedCornerShape(8.dp))
                            .size(height = 130.dp, width = 306.dp),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(Modifier.height(5.dp))

                    // 음식점 이름, 배달 시간 담은 Row
                    Row(
                        // 너비 정해주고 -> Arrangement.SpaceBetween 하면 각각 끝에 배치 가능
                        modifier = modifier.width(306.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = store.name,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )

                        Text(
                            text = "${store.deliveryTime}분",
                            fontSize = 12.sp,
                            color = Color.Black
                        )
                    }

                    Spacer(Modifier.height(10.dp))
                    // 별점, 리뷰 수를 담은 Row
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.img_star),
                            contentDescription = "별점",
                            modifier = modifier
                                .size(15.dp)
                        )
                        Text(
                            text = "${store.score}" + " (" + store.reviewCount + ")",
                            fontSize = 12.sp,
                            color = Color(0xFF575252)
                        )
                    }

                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun FavoriteScreenPreview() {
    val navController = rememberNavController()
    MyEatsFavorite(padding = PaddingValues(), {}, navController)
}