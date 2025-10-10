package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun FavofiteLook(text:String,modifier: Modifier = Modifier) {
    Column(
    ) {
        Row(){
            Image(
                painter = painterResource(id = R.drawable.icon_24_back_grey),
                contentDescription = "back_grey",
                modifier = modifier.padding(top = 27.dp, start = 18.dp)
                    .size(20.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_favorite),
                contentDescription = "heart",
                modifier = modifier.padding(top = 27.dp, start = 250.dp)
                    .size(20.dp)
                )
        }
        Box(
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_tukk2),
                contentDescription = "tukk2",
                modifier = modifier.fillMaxWidth()
            )
            Text(text = "아워떡볶이", fontSize = 23.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.padding(top = 60.dp),
            )
            Row(
                modifier = modifier.padding(top = 166.dp)
            ) {
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

@Preview(showBackground = true)
@Composable
private fun FavoritePreV() {
    FavofiteLook("아워떡볶이")

}