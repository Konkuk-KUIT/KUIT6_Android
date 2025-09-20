package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MidBanner(modifier: Modifier = Modifier) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(
                top = 14.dp,
                bottom = 24.dp,
            ),
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .size(
                    width = 306.dp,
                    height = 77.dp
                )
                .background(
                    color = Color(color = 0xFF0C2F65),
                    shape = RoundedCornerShape(
                        size = 8.dp
                    )
                )
                .padding(
                    top = 21.dp,
                    bottom = 21.dp,
                    start = 81.dp,
                    end = 12.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(space = 18.dp)
        ) {
            Column(

                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "와우회원은 횟수 제한없이",
                    color = Color.White,
                    fontSize = 11.sp,
                    lineHeight = 13.sp
                )
                Text(
                    text = "매 주문 무료배달",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 18.sp
                )
            }
            Text(
                text = "주문하러 가기",
                modifier = Modifier
                    .size(
                        width = 84.dp,
                        height = 25.dp
                    )
                    .clickable(
                        onClick = {

                        }
                    )
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 4.dp)
                    )
                    .wrapContentSize(Alignment.Center),
                color = Color(color = 0xFF0C2F65),
                textAlign = TextAlign.Center,
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 13.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MidBannerPreview() {
    MidBanner()
}