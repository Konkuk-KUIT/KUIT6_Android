package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    navController: NavHostController,
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
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 18.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "박경민",
                fontSize = 28.sp,
                fontWeight = Bold
            )
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "010-xxxx-xxxx",
                fontSize = 13.sp,
                color = Color(0xFF444D53)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top=18.dp),
            contentAlignment = Alignment.Center
        ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(29.5.dp),
            modifier = Modifier
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(67.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "0",
                    fontSize = 28.sp
                )
                Text(
                    text = "내가 남긴 리뷰",
                    fontSize = 11.sp,
                    color = Color(0xFF444D53)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(67.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "0",
                    fontSize = 28.sp
                )
                Text(
                    text = "도움이 됐어요",
                    fontSize = 11.sp,
                    color = Color(0xFF444D53)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(67.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "0",
                    fontSize = 28.sp
                )
                Text(
                    text = "즐겨찾기",
                    fontSize = 11.sp,
                    color = Color(0xFF444D53)
                )
            }
        }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 27.dp)
                .padding(top=21.dp)
                .height(48.dp)
                .width(306.dp)
                .border(
                    width = 0.5.dp,
                    color = Color(0xFF02AFFE),
                    shape = RoundedCornerShape(4.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "자세히 보기",
                fontSize = 14.sp,
                fontWeight = Bold,
                color = Color(0xFF02AFFE),
            )
        }
        Row(
             modifier = Modifier
                 .padding(start= 27.dp)
                 .height(30.dp)
                 .clickable { navController.navigate(Route.Favorite) },
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.like),
                contentDescription = "즐겨찾기",
                modifier = Modifier.size(30.dp)
            )
            Text(
                modifier = Modifier.padding(start = 19.dp),
                fontSize = 21.sp,
                text = "즐겨찾기 "
            )
        }
    }
}
