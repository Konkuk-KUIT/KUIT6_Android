package com.kuit.kuit6android.ui.components.favorite

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun TopBarComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.then(modifier).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(R.drawable.outline_keyboard_backspace_24),
                contentDescription = "back",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = "즐겨찾기",
                fontSize = 20.sp,
                fontFamily = Pretendard,
                modifier = Modifier.padding(start = 12.dp)
            )
        }

        Text(
            text = "수정",
            fontSize = 20.sp,
            fontFamily = Pretendard,
            color = Color(0xFF02AFF2)
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun TopBarComponentPreview(){
    TopBarComponent()
}