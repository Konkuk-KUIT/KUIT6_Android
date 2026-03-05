package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route

@Composable
fun MyEatsScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    onNavigateToFavorite: (Route) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                paddingValues = padding
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(
            modifier = Modifier.height(
                height = 18.dp
            )
        )

        Text(
            text = "정일혁",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(
            modifier = Modifier.height(
                height = 12.dp
            )
        )

        val phoneNum = "01012345678"
        Text(
            text = "${phoneNum.substring(0, 3)}-${phoneNum.substring(3, 7)}-${
                phoneNum.substring(
                    7,
                    11
                )
            }",
            fontWeight = FontWeight.Normal,
            color = Color(
                color = 0xFF444D53
            ),
            fontSize = 13.sp
        )

        Spacer(
            modifier = Modifier.height(
                height = 18.dp
            )
        )

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val myEatsNums = mapOf(
                "내가 남긴 리뷰" to 0,
                "도움이 됐어요" to 0,
                "즐겨찾기" to 0
            )
            myEatsNums.forEach {
                Column(
                    modifier = Modifier.weight(weight = 1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(space = 14.dp)
                ) {
                    Text(
                        text = "${it.value}",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 28.sp
                    )
                    Text(
                        text = it.key,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }

        Spacer(
            modifier = Modifier.height(
                height = 21.dp
            )
        )


        Button(
            onClick = {
                println("자세히 보기 클릭")
            },
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 27.dp),
            shape = RoundedCornerShape(size = 4.dp),
            border = BorderStroke(
                width = 0.5.dp,
                color = Color(color = 0xFF02AFFE)
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            ),
        ) {
            Text(
                text = "자세히 보기",
                fontSize = 14.sp,
                color = Color(color = 0xFF02AFFE),
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(
            modifier = Modifier.height(
                height = 22.dp
            )
        )
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    start = 32.dp,
                    end = 211.dp
                )
                .clickable(
                    onClick = {
                        onNavigateToFavorite(
                            Route.Favorite
                        )
                    }
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(
                    id = R.drawable.like
                ),
                contentDescription = "즐겨찾기",
                modifier = modifier.size(
                    width = 19.98.dp,
                    height = 18.01.dp
                )
            )
            Text(
                text = "즐겨찾기",
                fontSize = 21.sp,
                fontWeight = FontWeight.Normal
            )
        }
    }
}
//
//@Preview(showBackground = true)
//@Composable
//private fun MyEatsScreenPreview() {
//    MyEatsScreen(
//        padding = PaddingValues()
//    )
//}