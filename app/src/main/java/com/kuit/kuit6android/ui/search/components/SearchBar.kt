package com.kuit.kuit6android.ui.search.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun SearchBar(text:String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(painter = painterResource(
            id = R.drawable.ic_search
        ),
            contentDescription = "뒤로가기 화살표",
        )
        Box(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(100.dp))
            .border(width = 0.5.dp,color = Color.LightGray, shape = RoundedCornerShape(100.dp))
        ){
            Text( text,
                modifier.padding(vertical = 12.dp, horizontal = 20.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Icon(
            painter = painterResource(
                id = R.drawable.ic_search
            ),
            contentDescription = "검색"
        )
    }

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
                    .clickable(onClick = {}),
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