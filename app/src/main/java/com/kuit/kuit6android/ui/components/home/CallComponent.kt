package com.kuit.kuit6android.ui.components.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun CallComponent(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.then(
            Modifier
                .size(width = 306.dp, height = 77.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(color = Color(0xFF0C2F65))
        )
    ) {
        Row(
            modifier = Modifier.padding(top = 21.dp, start = 81.dp)
        ) {
            Column {
                Text(
                    text = "와우회원은 횟수 제한없이",
                    fontSize = 11.sp,
                    fontFamily = Pretendard,
                    color = Color.White
                )
                Text(
                    text = "매 주문 무료 배달",
                    fontFamily = Pretendard,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
            Button(
                modifier = Modifier
                    .size(width = 84.dp, height = 25.dp)
                    .padding(start = 18.dp),
                shape = RoundedCornerShape(4.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFFEFFFF)),
                onClick = {}
            ) {
                Text(
                    text = "주문하러 가기",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard,
                    color = Color(0xFF0C2F65)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CallComponentPreview() {
    CallComponent()
}