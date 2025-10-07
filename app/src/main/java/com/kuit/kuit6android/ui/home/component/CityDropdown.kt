package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
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
fun CityDropdown(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ic_marker_1
            ),
            modifier = modifier.size(24.dp),
            contentDescription = "marker"
        )
        Text(
            text = "서울시 광진구 구의동",
            modifier = modifier.padding(
                start = 12.dp,
                end = 9.dp
            ),
            lineHeight = 18.sp
        )
        Image(
            painter = painterResource(
                id = R.drawable.accordion_view_button
            ),
            modifier = modifier.size(16.dp),
            contentDescription = "view_button"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CityDropdownPreview() {
    CityDropdown()
}