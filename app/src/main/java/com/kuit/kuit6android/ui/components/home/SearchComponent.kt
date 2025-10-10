package com.kuit.kuit6android.ui.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun SearchComponent(name: String, storeName : String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.outline_search_24),
            contentDescription = "search",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(20.dp)
        )
        Text(
            text = "${name}님, $storeName 어때요?",
            fontFamily = Pretendard,
            fontSize = 15.sp,
            color = Color(0xFF98A0AB),
            modifier = Modifier.padding(start = 19.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchComponentPreview(){
    SearchComponent(name = "채민지", storeName = "요아정")
}