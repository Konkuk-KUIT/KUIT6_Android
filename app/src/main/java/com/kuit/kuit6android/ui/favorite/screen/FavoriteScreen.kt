package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.padding(
            padding
        )
    ) {
        val restaurantList = listOf(
            RestaurantData(
                imageId = R.drawable.img_ourddeokbokki,
                name = "아워떡볶이",
                time = "30분",
                rate = 4.9f,
                reviewNum = 3849
            ),
            RestaurantData(
                imageId = R.drawable.img_konoha,
                name = "코노하 건대점",
                time = "25분",
                rate = 4.9f,
                reviewNum = 2744
            ),
            RestaurantData(
                imageId = R.drawable.img_twozzim,
                name = "두찜 건대점",
                time = "30분",
                rate = 4.7f,
                reviewNum = 795
            )
        )

        LazyColumn {

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FavoritePreview() {
    FavoriteScreen(PaddingValues())
}