package com.kuit.kuit6android.ui.home.component

import android.R.attr.fontWeight
import android.R.attr.shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R


@Composable
fun RecentMatjib(modifier: Modifier = Modifier) {
    LazyRow (
        modifier = modifier
            .padding(start = 25.dp,top = 24.dp)
            .background(color = Color.White)
            .fillMaxWidth()
    ){
        item {
            Column {
                Text(
                    text = "최근 본 맛집",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.img_tukk),
                            modifier = modifier
                                .padding(top = 25.dp)
                                .width(230.dp)
                                .height(129.dp),
                    contentDescription = "tukk"
                )
                Row{
                    Text(
                        text = "아워떡볶이",
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                    Text(
                        text = "30분",
                        fontSize = 12.sp,
                        color = Color.Black,
                        modifier = modifier.padding(start = 145.dp)
                    )
                }
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.img_star),
                        modifier = modifier
                            .size(15.dp),
                        contentDescription = "star"
                    )
                    Text(
                        text = "4.9 (3,849)",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }
        }
        item {
            Column(
                modifier = modifier.padding(start = 21.dp,top=20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_mukk),
                        modifier = modifier
                            .padding(top = 25.dp)
                            .width(230.dp)
                            .height(129.dp),
                        contentDescription = "tukk"
                    )
                    Row{
                        Text(
                            text = "밥 맛집",
                            fontSize = 14.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "30분",
                            fontSize = 12.sp,
                            color = Color.Black,
                            modifier = modifier.padding(start = 145.dp)
                        )
                    }
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.img_star),
                            modifier = modifier
                                .size(15.dp),
                            contentDescription = "star"
                        )
                        Text(
                            text = "4.9 (3,849)",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }

            }

        }

    }


@Preview
@Composable
private fun RecentPreview() {
    RecentMatjib()
}