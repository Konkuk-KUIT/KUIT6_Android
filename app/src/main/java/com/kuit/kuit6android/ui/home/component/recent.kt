package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentComposer
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun recent(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(top = 451.dp)) {
        Text(
            text = "최근 본 맛집",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(start = 25.dp)
        )

        LazyRow(
            modifier = modifier.padding(start = 25.dp, top = 25.dp),
            horizontalArrangement = Arrangement.spacedBy(21.dp)
        ) {
            item {
                Column(
                    modifier = modifier.padding(end = 27.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.image),
                        contentDescription = "최근 식당",
                        modifier = modifier
                            .width(230.dp)
                            .height(129.dp)
                    )
                }

                Row(
                    modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "아워 떡볶이",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "30분",
                        fontSize = 12.sp
                    )
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Image(
                        painter = painterResource(R.drawable.star),
                        contentDescription = "찜",
                        modifier = modifier.size(15.dp)
                    )
                    Text(
                        text = "4.9 (3,849)",
                        fontSize = 12.sp,
                        color = Color(0xFF575252)
                    )
                }
            }
        }
    }
}

fun column(modifier: Modifier, function: () -> Unit) {}

@Preview
@Composable
private fun recentPreview() {
    recent()
}