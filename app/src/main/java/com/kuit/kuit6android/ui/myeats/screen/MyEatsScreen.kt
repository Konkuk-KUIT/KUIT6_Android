package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    Column(
        modifier = Modifier.padding(
            top = 18.dp
        )
    ) {
        Box(
            modifier = modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Text(
                "안현지",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "010-****-****",
                modifier = modifier.padding(top = 63.dp ),
                fontSize = 13.sp,
            )
        }

        Row(
            modifier = modifier.padding(top = 18.dp)
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("0", fontSize = 28.sp, fontWeight = FontWeight.Bold )
                    Text(text = "내가 남긴 리뷰"
                    , fontSize = 11.sp)
                }
            }
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("0", fontSize = 28.sp, fontWeight = FontWeight.Bold )
                    Text(text = "도움이 됐어요"
                        , fontSize = 11.sp)
                }
            }
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text("0", fontSize = 28.sp, fontWeight = FontWeight.Bold )
                    Text(text = "즐겨찾기"
                        , fontSize = 11.sp)
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        //테두리 있는 버튼
        OutlinedButton(
            onClick = { },
                    modifier = Modifier
                        .padding(start = 27.dp)
                .width(306.dp)
                .height(48.dp),
                    shape = RoundedCornerShape(8.dp),
            border = BorderStroke(1.dp, Color(0xFF02AFFE)),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF02AFFE))
        ) {
            Text("자세히 보기", fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(22.dp))

        Row(
            modifier = modifier.padding(start = 27.dp)
                .clickable(onClick = {
                    navController.navigate(Route.Favorite)
                })
        ) {
            Image(painter = painterResource(id = R.drawable.ic_favorite),
                contentDescription = "하트",
                modifier.size(30.dp))
            Text(text = "즐겨찾기",
                modifier = modifier.padding(start =19.dp),
                fontSize = 21.sp
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun EatsPreV() {
    MyEatsScreen(
        PaddingValues(0.dp),
        navController = TODO(),
    )
}