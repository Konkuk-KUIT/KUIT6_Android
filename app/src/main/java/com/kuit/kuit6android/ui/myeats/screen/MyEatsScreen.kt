package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.search.screen.SearchScreen

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    onNavigateToFavorite: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .padding(
                padding
            )
            .fillMaxWidth()
            .background(Color.White)
            .padding(top = 18.dp),
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text(
                text = "권태우",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "010-****-****",
                fontSize = 13.sp,
                color = Color.Black
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(
                30.dp,
                Alignment.CenterHorizontally
            ),
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 18.dp)
        ) {
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
                    color = Color.Black
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
                    color = Color.Black
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
                    color = Color.Black
                )
            }
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 21.dp, start = 27.dp, end = 27.dp)
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
        Row(
            modifier = modifier
                .clickable{onNavigateToFavorite()}
                .padding(top = 10.dp, start = 27.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.like),
                contentDescription = "like",
                modifier = modifier
                    .size(30.dp)
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
private fun MyEatsScreenPreview() {
    MyEatsScreen(PaddingValues())
}
