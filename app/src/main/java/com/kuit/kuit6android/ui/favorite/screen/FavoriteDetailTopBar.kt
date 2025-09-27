package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R

@Composable
fun FavoriteDetailTopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = 27.dp
            ),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(
                id = R.drawable.ic_back_arrow2
            ),
            contentDescription = "뒤로가기 화살표",
            modifier = modifier.clickable(
                onClick = {
                    println("즐겨찾기에서 뒤로가기 클릭")
                }
            )
        )
        Icon(
            painter = painterResource(
                id = R.drawable.like2
            ),
            contentDescription = "좋아요",
            modifier = modifier.clickable(
                onClick = {
                    println("즐겨찾기에서 좋아요 클릭")
                }
            )
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun FavoriteDetailTopBarPreview() {
    FavoriteDetailTopBar()
}