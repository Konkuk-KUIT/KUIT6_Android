package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.UserInfo
import com.kuit.kuit6android.ui.myeats.components.InfoItem

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .padding(
                padding
            )
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(scrollState) // scroll
            .padding(top = 18.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val user = UserInfo("서아영", "010-****-****", 0, 0, 0)
        Text(
            text = user.name,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = modifier.fillMaxWidth(), // 화면 꽉 채우려고
            textAlign = TextAlign.Center
        )
        Text(
            text = user.phone,
            fontSize = 13.sp,
            fontWeight = FontWeight.Normal,
            modifier = modifier.fillMaxWidth(), // 화면 꽉 채우려고
            color = Color(0xFF444D53),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = modifier.padding(top = 6.dp),
            horizontalArrangement = Arrangement.spacedBy(29.5.dp),
        ) {
            InfoItem(user.reviewCount, "내가 남긴 리뷰")
            InfoItem(user.helpedCount, "도움이 됐어요")
            InfoItem(user.favoriteCount, "즐겨찾기")
        }

        OutlinedButton(
            modifier = modifier
                .padding(top = 9.dp)
                .size(width = 306.dp, height = 48.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color(0xFF02AFFE)
            ),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(0.5.dp, Color(0xFF02AFFE))
        ) {
            Text(text = "자세히 보기", fontSize = 11.sp, fontWeight = FontWeight.Bold)
        }

        Row(
            modifier = modifier
                .padding(top = 10.dp)
                .width(width = 306.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(19.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.img_like),
                contentDescription = "like",
                modifier = modifier
                    .size(30.dp)
            )
            Text(
                text = "즐겨찾기", fontSize = 21.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MyEatsPreview() {
    MyEatsScreen(PaddingValues())
}