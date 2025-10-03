package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(
                padding
            )
            .background(Color.White)
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier
                .fillMaxWidth()
                .padding(start = 27.dp, end = 27.dp)
                .padding(top = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Image(
                painter = painterResource(
                    R.drawable.ic_back_arrow
                ),
                contentDescription = "뒤로가기 화살표",
            )

            Text(
                text = "즐겨찾기",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )

            Text(
                text = "수정",
                modifier = Modifier.padding(horizontal = 100.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF02AFFE)
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 27.dp, top = 58.dp, bottom = 24.dp)
        ) {
            Text(
                text = "총 3개",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
        }
    }
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 250.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            Image(
                painter = painterResource(R.drawable.our),
                contentDescription = "맛집 이미지",
                modifier = modifier
                    .fillMaxWidth()
                    .size(width = 306.dp, height = 129.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "아워떡볶이",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 27.dp, top = 5.dp)
                )

                Text(
                    modifier = Modifier.padding(end = 27.dp, top = 5.dp),
                    text = "30분",
                    fontSize = 12.sp
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(R.drawable.starrank),
                    contentDescription = "별짐",
                    modifier = modifier
                        .padding(start = 27.dp, top = 10.dp)
                        .size(
                            width = 20.dp, height = 15.dp
                        )
                )

                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "4.9 (3,849)",
                    fontSize = 12.sp,
                    color = Color(0xFF575252)
                )
            }
        }

        item {
            Image(
                painter = painterResource(R.drawable.our),
                contentDescription = "맛집 이미지",
                modifier = modifier
                    .fillMaxWidth()
                    .size(width = 306.dp, height = 129.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "아워떡볶이",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 27.dp, top = 5.dp)
                )

                Text(
                    modifier = Modifier.padding(end = 27.dp, top = 5.dp),
                    text = "30분",
                    fontSize = 12.sp
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(R.drawable.starrank),
                    contentDescription = "별짐",
                    modifier = modifier
                        .padding(start = 27.dp, top = 10.dp)
                        .size(
                            width = 20.dp, height = 15.dp
                        )
                )

                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "4.9 (3,849)",
                    fontSize = 12.sp,
                    color = Color(0xFF575252)
                )
            }
        }

        item {
            Image(
                painter = painterResource(R.drawable.our),
                contentDescription = "맛집 이미지",
                modifier = modifier
                    .fillMaxWidth()
                    .size(width = 306.dp, height = 129.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "아워떡볶이",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(start = 27.dp, top = 5.dp)
                )

                Text(
                    modifier = Modifier.padding(end = 27.dp, top = 5.dp),
                    text = "30분",
                    fontSize = 12.sp
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(R.drawable.starrank),
                    contentDescription = "별짐",
                    modifier = modifier
                        .padding(start = 27.dp, top = 10.dp)
                        .size(
                            width = 20.dp, height = 15.dp
                        )
                )

                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "4.9 (3,849)",
                    fontSize = 12.sp,
                    color = Color(0xFF575252)
                )
            }
        }
    }
}