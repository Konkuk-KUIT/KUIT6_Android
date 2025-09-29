package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.search.screen.SearchScreen

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    onNavigateToFavorite: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(
                padding
            )
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 20.dp),
    ) {
        // 내 정보
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text(
                text = "사예원",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "010-****-****",
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF444D53)
            )
        }

        // 내가 남긴 리뷰, 도움이 됐어요, 즐겨찾기
        Row(
            horizontalArrangement = Arrangement.spacedBy(
                30.dp,
                Alignment.CenterHorizontally
                ),
            modifier = modifier.fillMaxWidth().padding(top = 18.dp)
        ){
            Column(
                verticalArrangement = Arrangement.spacedBy(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.width(70.dp)
            )
            {
                Text(
                    text = "0",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "내가 남긴 리뷰",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF444D53)
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.width(70.dp)
            )
            {
                Text(
                    text = "0",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "도움이 됐어요",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF444D53)
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.width(70.dp)
            )
            {
                Text(
                    text = "0",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(
                    text = "즐겨찾기",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF444D53)
                )
            }
        }

        // 자세히 보기
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 21.dp, start = 27.dp, end = 27.dp)
                .clip(RoundedCornerShape(4.dp))
                .border(0.5.dp, color = Color(0xFF02AFFE), shape = RoundedCornerShape(4.dp)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "자세히 보기",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF02AFFE),
                modifier = modifier
                    .padding(vertical = 14.dp)
            )
        }

        // 즐겨찾기
        Row (
            modifier = modifier.fillMaxWidth().padding(top = 22.dp, start = 27.dp, end = 27.dp)
                .clickable(onClick = {
                    onNavigateToFavorite()
                }),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(R.drawable.img_like),
                contentDescription = "즐겨찾기",
                modifier = modifier.size(30.dp)
            )
            Text(
                text = "즐겨찾기",
                fontSize = 21.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    MyEatsScreen(padding = PaddingValues(), {})
}