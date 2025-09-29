package com.kuit.kuit6android.ui.myeats.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun InfoItem(count: Int, string: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .background(Color.White),
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = modifier.size(width = 67.dp, height = 33.dp),
            text = "$count",
            fontWeight = FontWeight.SemiBold,
            fontSize = 28.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text(
            text = string,
            fontWeight = FontWeight.Normal,
            fontSize = 11.sp,
            color = Color(0xFF444D53),
            textAlign = TextAlign.Center,
            modifier = modifier.width(67.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun InfoItemPreview() {
    InfoItem(0, "내가 남긴 리뷰")
}