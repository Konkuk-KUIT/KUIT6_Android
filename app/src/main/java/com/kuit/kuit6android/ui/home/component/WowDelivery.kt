package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WowDelivery(modifier: Modifier = Modifier){
    Row(
        modifier = Modifier
            .width(306.dp)
            .height(77.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(
                color = Color(0xFF0C2F65)
            )
            .padding(start= 81.dp, end=12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column{
                Text(
                    text = "와우회원은 횟수 제한없이",
                    color = Color.White,
                    fontSize = 11.sp
                )

                Text(
                    text = "매 주문 무료배달",
                    color = Color.White,
                    fontSize = 15.sp
                )

        }
        Button(
            onClick= {},
            colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                contentColor = Color(0xFF0C2F65)
                    ),
            shape = RoundedCornerShape(size = 4.dp),
            contentPadding = PaddingValues(
                start = 11.dp,
                top = 6.dp,
                end = 11.dp,
                bottom = 6.dp
            )
        ) {
            Text(
                text = "주문하러 가기",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
private fun WowPreview() {
    WowDelivery()
}