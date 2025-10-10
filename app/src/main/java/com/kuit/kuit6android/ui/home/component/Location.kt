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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun Location(modifier: Modifier = Modifier) {
    LazyRow (
        modifier = modifier
            .background(color = Color(0xFFFDFFFF))
            .padding(top=20.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically

    ){
        item {
            Image(
                modifier = modifier
                    .padding(start = 27.dp)
                    .size(24.dp),
                painter = painterResource(R.drawable.img_marker),
                contentDescription = "vector"
            )
        }
        item {
            Text(
                text = "서울시 광진구 구의동",
                modifier = modifier.padding(start = 12.dp),
                fontSize = 15.sp,
                color = Color(0xFF000000)
            )

        }
        item {
            Button(
                modifier = modifier
                    .padding(start = 1.dp),
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor =  Color(0xFFFDFFFF))
            ) {
                Image(
                    modifier = modifier
                        .size(16.dp),
                    painter = painterResource(R.drawable.img_viewbutton),
                    contentDescription = "viewbutton"
                )
            }
        }
        item{
            Button(
                modifier = modifier
                    .padding(start = 50.dp),
                onClick = { },
                colors = ButtonDefaults.buttonColors(containerColor =  Color(0xFFFDFFFF))
            ) {
                Image(
                    modifier = modifier
                        .size(24.dp),
                    painter = painterResource(id = R.drawable.img_bell),
                    contentDescription = "bell"
                )
            }
        }
    }
}

@Preview
@Composable
private fun LocationPreview() {
    Location()
}