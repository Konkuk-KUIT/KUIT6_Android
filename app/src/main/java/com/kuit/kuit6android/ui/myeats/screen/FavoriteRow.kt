package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route

//nested
@Composable
fun FavoriteRow(
    modifier: Modifier,
    onNavigateToFavorite: (Route) -> Unit
) {
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
                        Route.FavoriteToMyEats
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