package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.favorite.component.favoriteStores

@Composable
fun DetailScreen(storeName: String,
                 navController : NavController) {
    val store = favoriteStores.find { it.name == storeName }

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 27.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.back_grey),
                contentDescription = "뒤로 가기",
                modifier= Modifier
                .size(24.dp)
                    .clickable {
                        navController.popBackStack()

                    }
            )
            Image(
                painter = painterResource(R.drawable.like),
                contentDescription = "좋아요",
                modifier= Modifier
                    .size(24.dp)
            )
        }

        store?.let {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = it.imageResId),
                    contentDescription = "${it.name} 이미지",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(360.dp)
                        .height(149.dp)
                )



                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = it.name,
                    fontSize = 30.sp,
                    fontWeight = SemiBold
                )


                Spacer(modifier = Modifier.height(8.dp))

                Row {
                    Image(
                        painter = painterResource(R.drawable.icon_star),
                        contentDescription = "별점",
                        modifier = Modifier
                            .width(20.dp)
                            .height(15.dp)
                    )
                    Text(
                        text = "리뷰 4.9 (1264)",
                        fontSize = 12.sp
                    )
                }
            }

        }
        } ?: Text("가게 정보를 불러올 수 없습니다.")
    }


