package com.kuit.kuit6android.ui.search.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun SearchBar(
    text: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier.fillMaxWidth().padding(horizontal = 27.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.ic_back_arrow),
            contentDescription = "뒤로가기 화살표"
        )
        Box(
            modifier = Modifier
                .weight(1f) // 나머지 제외한 영역 차지
                .clip(RoundedCornerShape(100.dp))
                .border(
                    width = 0.5.dp,
                    color = Color.LightGray,
                    shape = RoundedCornerShape(100.dp)
                )
        ) {
            Text(
                text = text,
                modifier = modifier.padding(vertical = 12.dp, horizontal = 20.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Icon(
            painter = painterResource(R.drawable.ic_search),
            contentDescription = "검색",
            tint = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    SearchBar("검색어를 입력해주세요")
}