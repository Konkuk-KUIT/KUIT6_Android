package com.kuit.kuit6android.ui.home.component.recentrestaurant

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RecentRestaurantRow(
    modifier: Modifier = Modifier
) {

    LazyRow(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(space = 21.dp)
    ) {
        items(items = MockData.restaurantList) {
            RestaurantItem(
                restaurantData = it
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecentRestaurantDataPreview() {
    RecentRestaurantRow()
}