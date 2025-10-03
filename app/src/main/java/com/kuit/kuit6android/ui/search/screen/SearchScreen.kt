package com.kuit.kuit6android.ui.search.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.ui.components.search.SearchBar


@Composable
fun SearchScreen(
    padding: PaddingValues,
    onNavigateToSearchResult: (String) -> Unit,
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
        SearchBar("검색어를 입력해주세요. ")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top =25.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text("인기 검색어", fontSize = 16.sp, fontWeight= FontWeight.Bold, color = Color.Black)
            Text("오후 5:59 업데이트", fontSize = 16.sp, fontWeight= FontWeight.Light, color = Color.Black)
        }

        val foodRanking = listOf(
            "떡볶이", "치킨", "버거", "마라탕", "김밥", "초밥", "피자", "곱창", "샐러드", "닭발"
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(space=20.dp)
        ){
            itemsIndexed(foodRanking){ index, item ->
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .clickable(onClick={
                            onNavigateToSearchResult(item)
                        }),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    Text("${index + 1}",
                        color = if(index + 1 <= 3 ) Color.Blue else Color.Black,
                        fontSize =16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(item,fontSize=16.sp, color = Color.Black)
                }

            }
        }
    }
}