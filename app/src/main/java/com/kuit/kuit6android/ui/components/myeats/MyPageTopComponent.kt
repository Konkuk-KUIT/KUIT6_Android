package com.kuit.kuit6android.ui.components.myeats

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.model.User
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun MyPageTopComponent(user: User, modifier: Modifier = Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = user.name,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = Pretendard
        )
        Text(
            text = user.phone,
            fontSize = 13.sp,
            fontFamily = Pretendard,
            color = Color(0xFF444D53),
            modifier = Modifier.padding(top = 12.dp)
        )
        Row(
            modifier = Modifier.padding(top = 18.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = user.myReview.size.toString(),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = Pretendard,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "내가 남긴 리뷰",
                    fontSize = 11.sp,
                    fontFamily = Pretendard,
                    color = Color(0xFF444D53)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(start = 29.5.dp)
            ){
                Text(
                    text = user.myReview.size.toString(),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = Pretendard,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "도움이 됐어요",
                    fontSize = 11.sp,
                    fontFamily = Pretendard,
                    color = Color(0xFF444D53)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(start = 29.5.dp)
            ){
                Text(
                    text = user.myReview.size.toString(),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = Pretendard,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "도움이 됐어요",
                    fontSize = 11.sp,
                    fontFamily = Pretendard,
                    color = Color(0xFF444D53)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun MyPageTopComponentPreview(){
    MyPageTopComponent(
        user = User(
            name = "채민지",
            phone = "010-1234-5678",
            myReview = listOf(),
            helpCount = 0,
            favoriteStore = listOf()
        )
    )
}