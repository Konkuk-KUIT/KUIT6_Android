package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
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
fun FavoriteDetailTopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(
                id = R.drawable.ic_back_arrow2
            ),
            contentDescription = "뒤로가기 화살표",
            modifier = modifier.clickable(
                onClick = {
                    println("즐겨찾기 세부 정보에서 뒤로가기 클릭")
                }
            )
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
            color = Color(color = 0xFF02AFFE),
            modifier = modifier.clickable(
                onClick = {
                    println("즐겨찾기 수정 클릭")
                }
            )
        )
    }
}