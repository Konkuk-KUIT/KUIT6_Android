package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.home.component.recentrestaurant.MockData
import com.kuit.kuit6android.ui.home.component.recentrestaurant.RestaurantItem
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    onNavigateToDetailPage: (RestaurantData) -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        FavoriteHeader(modifier)

        Row(
            modifier = modifier
                .fillMaxWidth()
                .height(
                    height = 8.dp
                )
                .background(
                    color = Color(
                        color = 0xFFF7F8F8
                    )
                )
        ) {}

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    vertical = 27.dp
                ),
            verticalArrangement = Arrangement.spacedBy(
                space = 20.dp
            ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(
                items = MockData.restaurantList
            ) {
                RestaurantItem(
                    modifier = modifier
                        .size(
                            width = 306.dp,
                            height = 176.dp
                        )
                        .clickable(
                            onClick = {
                                onNavigateToDetailPage(it)
                            }
                        ),
                    restaurantData = it
                )
            }
        }
    }
}

