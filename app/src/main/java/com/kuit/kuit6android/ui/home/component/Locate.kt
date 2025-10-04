package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun Locate(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.padding(start = 27.dp, end = 27.dp, top = 20.dp).fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_marker1),
                contentDescription = "위치 사진",
                modifier = Modifier.size(24.dp)
            )
            Text(
                "서울시 광진구 구의동", fontSize = 15.sp,
                modifier = Modifier.padding(start = 12.dp, end =
                9.dp), lineHeight = 18.sp
            )
            Image(
                painter = painterResource(id = R.drawable.accordion_view_button),
                contentDescription = "화살표 사진",
                modifier = Modifier.size(16.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.bell),
            contentDescription = "종 사진",
            modifier = Modifier.size(24.dp).padding(end = 0.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun LocatePreview() {
    Locate()
}