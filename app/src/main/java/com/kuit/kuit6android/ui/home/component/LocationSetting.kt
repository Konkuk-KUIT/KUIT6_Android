package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
fun LocationSetting(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.width(306.dp)
    ) {
        var content by rememberSaveable { mutableStateOf("") }
        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_marker),
                contentDescription = "marker",
                modifier = modifier.size(24.dp)
            )
            Spacer(Modifier.width(12.dp))
            Text(
                text = "서울시 광진구 구의동",
                fontSize = 15.sp

            )
            Spacer(Modifier.width(9.dp))
            Icon(
                painter = painterResource(id = R.drawable.ic_accordion_view_button),
                contentDescription = "accordion button",
                modifier = modifier.size(16.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.img_bell),
            contentDescription = "notification",
            modifier = modifier.size(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun LocationSettingPreview(){
    LocationSetting()
}