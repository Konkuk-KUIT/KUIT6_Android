package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun RegionSelectionRow(modifier: Modifier = Modifier) {
    var region by rememberSaveable { mutableStateOf("서울시 광진구 구의동") }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_marker),
            contentDescription = "search",
            modifier = modifier.size(24.dp),
            tint = Color(0xFFA4A4A6)
        )
        Text(
            text = region,
            fontSize = 15.sp,
            color = Color.Black,
            modifier = modifier.padding(start = 12.dp, end = 9.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_accordian_view_button),
            contentDescription = "search",
            modifier = modifier
                .padding(start = 3.dp, top = 3.dp )
                .size(10.dp),
            tint = Color(0xFF666668)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_alarm),
            contentDescription = "search",
            modifier = modifier
                .padding(2.5.dp)
                .padding(start = 96.dp)
                .size(19.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun RegionPreview() {
    RegionSelectionRow()
}