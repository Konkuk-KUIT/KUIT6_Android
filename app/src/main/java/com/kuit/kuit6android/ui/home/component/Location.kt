package com.kuit.kuit6android.ui.home.component

import android.location.Location
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Icon
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
    Row(
        modifier = modifier
            .padding(horizontal = 27.dp)
            .width(306.dp)
            .height(24.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.marker),
            contentDescription = "search icon",
            modifier = modifier
                .size(24.dp)
        )

        Text(
            text = "서울시 광진구 구의동",
            color = Color.Black,
            fontSize = 15.sp,
            modifier = modifier.padding(start = 12.dp)
        )
        Icon(
            painter = painterResource(R.drawable.viewbutton),
            contentDescription = "view Icon",
            modifier = modifier
                .padding(start = 9.dp)
                .size(16.dp)
        )
        Icon(
            painter = painterResource(R.drawable.bell),
            contentDescription = "bell",
            modifier = modifier
                .padding(start = 96.dp)
                .size(24.dp)
        )
    }
}


@Preview
@Composable
private fun LocationPreview() {
    Location()
}