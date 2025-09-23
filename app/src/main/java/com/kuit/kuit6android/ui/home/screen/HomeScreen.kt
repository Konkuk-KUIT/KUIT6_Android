package com.kuit.kuit6android.ui.home.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.model.Location
import com.kuit.kuit6android.ui.components.home.CallComponent
import com.kuit.kuit6android.ui.components.home.FoodCategoryViewComponent
import com.kuit.kuit6android.ui.components.home.PlaceComponent
import com.kuit.kuit6android.ui.components.home.SearchComponent
import com.kuit.kuit6android.ui.components.home.StoreLazyRowComponent
import com.kuit.kuit6android.ui.theme.NanumGothic
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun HomeScreen(
    padding: PaddingValues
) {
    var couponButtonClicked by rememberSaveable { mutableStateOf(false) }

    Column(modifier = Modifier.padding(top = 25.dp)) {
        Row(
            modifier = Modifier
                .background(color = Color(0xFF212B35))
                .fillMaxWidth()
                .height(42.dp),
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(R.drawable.star),
                contentDescription = "star",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(top = 13.dp, start = 15.dp)
                    .width(19.dp)
                    .height(16.dp)
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append("무료 배달 + 총 10000원 할인 ")
                    }
                    withStyle(SpanStyle(color = Color.White, fontSize = 12.sp)) {
                        append("적용 가능")
                    }
                },
                style = TextStyle(
                    platformStyle = PlatformTextStyle(includeFontPadding = false)
                ),
                fontFamily = NanumGothic,
                modifier = Modifier.padding(start = 5.dp, top = 15.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                modifier = Modifier
                    .padding(top = 8.dp, end = 15.dp)
                    .width(59.dp)
                    .height(26.dp),
                onClick = { couponButtonClicked = !couponButtonClicked },
                contentPadding = PaddingValues(0.dp),
                shape = RoundedCornerShape(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF02AFFE))
            ) {
                Text(
                    text = "쿠폰 받기",
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (couponButtonClicked) Color.Green else Color.White
                )
            }
        }

        PlaceComponent(
            Location(city = "서울시", town = "광진구", neighborhood = "구의동"),
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp, start = 27.dp)
        )

        SearchComponent(
            name = "채민지",
            storeName = "요아정",
            modifier = Modifier.padding(start = 49.dp, top = 31.dp)
        )

        FoodCategoryViewComponent(modifier = Modifier.fillMaxWidth().padding(start = 27.dp, top = 26.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 14.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            CallComponent()
        }
        Text(
            text = "최근 본 맛집",
            fontFamily = Pretendard,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
            modifier = Modifier.padding(start = 27.dp, top = 24.dp)
        )
        StoreLazyRowComponent(modifier = Modifier.padding(start = 27.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(padding = PaddingValues())

}