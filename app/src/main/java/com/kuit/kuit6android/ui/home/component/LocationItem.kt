package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun LocationItem(modifier: Modifier = Modifier) {
    var location by rememberSaveable { mutableStateOf("서울시 광진구 구의동") }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier= modifier
            .fillMaxWidth()
    )
    {
        Icon(
        painter = painterResource(id = R.drawable.ic_marker),
        "location",
        modifier = modifier
            .size(24.dp)
    )
        Text(
            text= location,
            fontSize= 15.sp,
            modifier = Modifier
                .padding(start=12.dp)
        )
        Icon(
            painter = painterResource(id= R.drawable.acco_button),
            contentDescription = "accodian_button",
            modifier = Modifier
                .padding(start=9.dp)
                .size(16.dp)
        )
        Spacer(modifier = Modifier.weight(1f))

        Icon(
            painter = painterResource(id= R.drawable.bell),
            contentDescription = "bell",
            modifier= Modifier
                .padding(end=27.dp)
                .size(24.dp)

        )

    }
}

@Preview(showBackground = true)
@Composable
private fun LocationPreview() {
    LocationItem()
}