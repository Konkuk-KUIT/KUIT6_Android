package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyEatsNums(modifier: Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        val myEatsNums = mapOf(
            "내가 남긴 리뷰" to 0,
            "도움이 됐어요" to 0,
            "즐겨찾기" to 0
        )
        myEatsNums.forEach {
            Column(
                modifier = Modifier.weight(weight = 1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(space = 14.dp)
            ) {
                Text(
                    text = "${it.value}",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 28.sp
                )
                Text(
                    text = it.key,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}