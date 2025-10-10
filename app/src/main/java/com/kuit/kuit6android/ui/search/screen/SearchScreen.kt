package com.kuit.kuit6android.ui.search.screen

import android.R.attr.padding
import androidx.benchmark.traceprocessor.Row
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
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.search.components.SearchBar


@Composable
fun SearchScreen(
    padding: PaddingValues,
    onNavigateSearchResult: (String)->Unit,
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
        SearchBar(
            "검색어를 입력해주세요"
              )
//        Row(
//            modifier = modifier.fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.spacedBy(10.dp)
//        ) {
//            Image(painter = painterResource(
//                id = R.drawable.ic_search
//            ),
//                contentDescription = "뒤로가기 화살표",
//            )
//            Box(modifier = Modifier
//                .weight(1f)
//                .fillMaxWidth()
//                .clip(shape = RoundedCornerShape(100.dp))
//                .border(width = 0.5.dp, color = Color.LightGray, shape = RoundedCornerShape(100.dp))
//            ){
//                Text("검색어를 입력해주세요",
//                    modifier.padding(vertical = 12.dp, horizontal = 20.dp),
//                    fontSize = 14.sp,
//                    fontWeight = FontWeight.Normal
//                )
//            }

//            Icon(
//                painter = painterResource(
//                    id = R.drawable.ic_search
//                ),
//                contentDescription = "검색"
//            )
//        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "인기 검색어", fontSize = 16.sp, fontWeight = FontWeight.Bold,color = Color.Black
            )
            Text(text = "오후 5:59 업데이트", fontSize = 16.sp, fontWeight = FontWeight.Light,color = Color.Black)
        }
        val foodRanking = listOf(
            "떡볶이","치킨","버거","마라탕","김밥","초밥","피자","곱창","샐러드","닭발"
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            itemsIndexed(foodRanking){ index,item ->
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .clickable(onClick = {
                            onNavigateSearchResult(item)
                        }),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    Text(
                        text = "${index+1}",
                        color = if(index+1<= 3) Color.Blue else Color.Black,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(text = "$item", color = Color.Black)
                }

            }
        }
    }
}

@Preview
@Composable
private fun SearchScreenPre() {
    SearchScreen(
        padding = PaddingValues(0.dp),
        onNavigateSearchResult = { keyword ->
            // 미리보기에서는 아무 동작 안 해도 OK
            println("검색어 클릭됨: $keyword")
        }
    )
}
