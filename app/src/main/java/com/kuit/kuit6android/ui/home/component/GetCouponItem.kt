package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun GetCouponItem(modifier: Modifier = Modifier) {
    var isWhite by remember { mutableStateOf(true) }
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color(0xFF212B3D))
            .padding(horizontal = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        item {
            Image(
                painter = painterResource(id = R.drawable.img_twinkle),
                contentDescription = "img_twinkle",
                modifier = modifier.size(19.dp, 16.dp)
            )
        }
        item {
            Text(
                text = "무료배달 + 총 10,000원 할인",
                modifier = modifier.padding(start = 5.dp),
                color = Color(0xFFFDFFFF),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }
        item {
            Text(
                text = "적용 가능",
                modifier = modifier.padding(start = 2.dp, end = 43.dp),
                color = Color(0xFFFDFFFF),
                fontSize = 12.sp
            )
        }
        item {
            Button(
                modifier = modifier
                    .padding(top = 5.dp, end = 7.dp, bottom = 8.dp, start = 9.dp),
                onClick = {
                    isWhite = !isWhite
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF02AFFE),
                    contentColor = if (isWhite) Color.White else Color.Black
                ),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(text = "쿠폰 받기", fontSize = 11.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CouponPreview() {
    GetCouponItem()
}