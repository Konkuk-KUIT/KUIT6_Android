package com.kuit.kuit6android.ui.home.component

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GoOrderItem(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(Color(0xFF0C2F65), shape = RoundedCornerShape(size = 8.dp))
            .size(width = 306.dp, height = 77.dp)
            .padding(all = 12.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = modifier.padding(start = 69.dp, top = 9.dp, bottom = 9.dp)
            ) {
                Text(
                    text = "와우회원은 횟수 제한없이", // 글자 간 간격 패딩으로 주니까 글씨 잘려서 안 줌.
                    color = Color.White,
                    fontSize = 11.sp
                )
                Text(
                    text = "매 주문 무료배달",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Button(
                modifier = modifier
                    .padding(start = 18.dp)
                    .size(width = 84.dp, height = 25.dp),
                onClick = {},
                contentPadding = PaddingValues(0.dp), // 내부 패딩을 0으로 만들어줌.
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF0C2F65)
                ),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(text = "주문하러 가기", fontSize = 11.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun OrderPreview() {
    GoOrderItem()
}