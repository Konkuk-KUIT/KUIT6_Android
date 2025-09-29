package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.model.User
import com.kuit.kuit6android.ui.components.myeats.MyPageTopComponent
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    user: User = User(
        name = "채민지",
        phone = "010-1234-5678",
        myReview = listOf(),
        helpCount = 0,
        favoriteStore = listOf()
    ),
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        contentAlignment = Alignment.TopCenter
    ){
        Column {
            MyPageTopComponent(user = user, modifier = Modifier.align(Alignment.CenterHorizontally))
            Box(
                modifier = Modifier
                    .padding(top = 21.dp)
                    .size(width = 306.dp, height = 48.dp)
                    .border(
                        width = 0.5.dp,
                        color = Color(0xFF02AFFE),
                        shape = RoundedCornerShape(4.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "자세히 보기",
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = Pretendard,
                    color = Color(0xFF02AFFE)
                )
            }
            Row(
                modifier = Modifier.padding(top = 22.dp, start = 27.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.outline_favorite_24),
                    contentDescription = "favorite",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(30.dp)
                )
                Text(
                    text = "즐겨찾기",
                    fontSize = 21.sp,
                    fontFamily = Pretendard,
                    modifier = Modifier.padding(19.dp)
                )
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
private fun MyEatsScreenPreview() {
    MyEatsScreen(padding = PaddingValues())
}