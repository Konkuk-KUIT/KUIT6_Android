package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun RecentRestaurantData(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "최근 본 맛짐",
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
            lineHeight = 20.sp
        )
        LazyRow {

        }
    }
}