package com.kuit.kuit6android.ui.favorite.screen

import android.content.ClipData
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import androidx.navigation.NavHostController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    navController: NavHostController

) {
    Row(
        modifier = modifier.fillMaxWidth()
            .padding(top = 25.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Column {
            Box(modifier = Modifier
            ){
                Image(painter = painterResource
                    (
                    id = R.drawable.icon_24_back_grey,
                ),
                    contentDescription = "뒤로가기 화살표",
                    modifier.padding(start = 27.dp)
                        .size(24.dp)
                )
                Text( text = "즐겨찾기",
                    modifier.padding(start = 70.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal
                )
                Text(text = "수정",
                    modifier.padding(start = 290.dp),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF02AFFE)
                )
                Text(text = "총 1개",
                    modifier = modifier.padding(top = 107.dp, start = 27.dp),
                    fontSize = 20.sp
                )
            }
            Box(modifier = modifier.padding(top=24.dp)
                .fillMaxWidth()
                .height(8.dp)
                .background(Color(0xFFF7F8F8))
            )
            Box(
                modifier = modifier
                    .padding(all = 27.dp)
                    .clickable(onClick = {
                        navController.navigate(Route.FavoriteLook)
                    })
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_tukk2),
                    modifier = modifier
                        .width(306.dp)
                        .height(129.dp),
                    contentDescription = "tukk"
                )
                Row(
                    modifier = modifier.padding(top = 134.dp)
                ) {
                    Text(text = "아워 떡볶이",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.weight(1f)) // 남은 공간 밀어내기

                    Text(text = "30분",
                        fontSize = 12.sp
                    )
                }
                Row(
                    modifier = modifier.padding(top = 166.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_star),
                        modifier = modifier
                            .size(15.dp),
                        contentDescription = "star"
                    )
                    Text(
                        text = "4.9 (3,849)",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun FavoriteScreenPrev() {
    FavoriteScreen(
        PaddingValues(10.dp),
        navController = TODO(),
    )
}