package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun RecentMenu(modifier: Modifier = Modifier) {
    Text(
        text = "최근 본 맛집",
        fontSize = 17.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(Modifier.height(25.dp))

    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(21.dp)
    ) {
        item {
            Column(
                modifier = modifier.padding(end = 27.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.img_food),
                    contentDescription = "맛집 이미지",
                    modifier = modifier
                        .clip(RoundedCornerShape(8.dp))
                        .size(width = 230.dp, height = 129.dp)
                )
                Spacer(Modifier.height(5.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "아워떡볶이",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.width(145.dp))
                    Text(
                        text = "30분",
                        fontSize = 12.sp
                    )
                }

                Spacer(Modifier.height(10.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_star),
                        contentDescription = "찜",
                        modifier = modifier
                            .size(15.dp)
                    )
                    Text(
                        text = "4.9 (3,849)",
                        fontSize = 12.sp,
                        color = Color(0xFF575252)
                    )
                }
            }

        }

        item {
            Column(
                modifier = modifier
                    .padding(end = 27.dp)
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(R.drawable.img_food),
                    contentDescription = "맛집 이미지",
                    modifier = modifier
                        .clip(RoundedCornerShape(8.dp))
                        .size(width = 230.dp, height = 129.dp)
                )
                Spacer(Modifier.height(5.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "아워떡볶이",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(Modifier.width(145.dp))
                    Text(
                        text = "30분",
                        fontSize = 12.sp
                    )
                }

                Spacer(Modifier.height(10.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_star),
                        contentDescription = "찜",
                        modifier = modifier
                            .size(15.dp)
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

@Preview(showBackground = true)
@Composable
private fun RecentMenuPreview() {
    RecentMenu()
}