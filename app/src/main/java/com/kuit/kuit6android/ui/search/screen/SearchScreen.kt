package com.kuit.kuit6android.ui.search.screen

import android.graphics.Paint
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
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
import androidx.navigation.Navigator
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.search.components.SearchBar

@Composable
fun SearchScreen(
    padding: PaddingValues,
    onNavigateToSSearchRoute: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .padding(
                padding
            )
            .background(Color.White)
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        SearchBar("검색어를 입력해주세요")

        Row(
            modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                painter = painterResource(
                    R.drawable.ic_back_arrow
                ),
                contentDescription = "뒤로가기 화살표",
            )
            Box(
                modifier = Modifier
                    .weight(weight = 1f)
                    //  .fillMaxWidth()
                    .clip(RoundedCornerShape(100.dp))
                    .border(
                        width = 0.5.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(100.dp)
                    )
            ) {
                Text(
                    text = "검색어를 입력해주세요",
                    modifier = Modifier.padding(vertical = 12.dp, horizontal = 20.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            }
            Icon(
                painter = painterResource(
                    R.drawable.ic_search
                ),
                contentDescription = "검색 돋보기",
                tint = Color.Black
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("인기 검색어", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Black)
            Text("오후 5:59 업데이트", fontSize = 16.sp, fontWeight = FontWeight.Light)
        }

        val foodRanking = listOf(
            "떡볶이", "치킨", "버거", "마라탕", "김밥", "초밥", "피자", "곱창", "샐러드", "닭발"
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(space = 20.dp)
        ) {
            itemsIndexed(foodRanking) { index, item ->
                Row(
                    modifier
                        .fillMaxWidth()
                        .clickable(onClick = {
                            onNavigateToSSearchRoute(item)
                        }),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text(
                        text = "${index + 1}",
                        color = if (index + 1 <= 3) Color.Blue else Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(text = "$item", fontSize = 16.sp, color = Color.Black)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SearchScreenPreview() {
    SearchScreen(padding = PaddingValues(), {})
}