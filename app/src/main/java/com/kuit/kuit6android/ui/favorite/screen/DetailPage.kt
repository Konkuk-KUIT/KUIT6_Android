package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun DetailPage(
    storeInfo: StoreData,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 헤더
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 27.dp, horizontal = 27.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_back_arrow),
                contentDescription = "뒤로가기 화살표",
                modifier = modifier
                    .size(24.dp)
                    .clickable { navController.popBackStack() }, // 이전 화면으로 이동
                tint = Color.Gray
            )
            Image(
                painter = painterResource(R.drawable.img_like),
                contentDescription = "찜",
                modifier = modifier.size(24.dp)
            )
        }

        // 가게 정보
        // onNavigateToDetailPage() 로 전달 받은 StoreData 정보
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(storeInfo.imageId),
                contentDescription = storeInfo.name,
                modifier = modifier.fillMaxWidth().height(150.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.padding(bottom = 25.dp))
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = storeInfo.name,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Row(
                    modifier = modifier.padding(top = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_star),
                        contentDescription = "별점",
                        modifier = modifier.width(20.dp).height(15.dp)
                    )
                    Text(
                        text = "${storeInfo.score} (${storeInfo.reviewCount})",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailPagePreview(){
    val navController = rememberNavController()
    DetailPage(
        storeInfo = StoreData(
            imageId = R.drawable.img_food,
            name = "아워떡볶이",
            deliveryTime = 30,
            score = 4.9,
            reviewCount = "3,849"
        ),
        navController = navController
    )
}