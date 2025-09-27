package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun FavoriteDetailScreen(
    modifier: Modifier = Modifier,
    restaurantData: RestaurantData
) {
    Column {
        FavoriteDetailTopBar()

    }
}