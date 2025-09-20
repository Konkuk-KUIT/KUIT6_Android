package com.kuit.kuit6android.ui.home.component.recentrestaurant

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RecentRestaurantData

@Composable
fun RecentRestaurantRow(
    modifier: Modifier = Modifier
) {
    val restaurantList = listOf(
        RecentRestaurantData(
            imageId = R.drawable.restaurant,
            name = "아워떡볶이",
            time = 30,
            rating = 4.9,
            reviewerCount = 3849
        ),
        RecentRestaurantData(
            imageId = R.drawable.threestar,
            name = "모수",
            time = 60,
            rating = 3.3,
            reviewerCount = 192837
        ),
        RecentRestaurantData(
            imageId = R.drawable.yakurt,
            name = "야쿠르트",
            time = 3,
            rating = 4.8,
            reviewerCount = 129743
        ),
        RecentRestaurantData(
            imageId = R.drawable.fishbread,
            name = "붕어빵",
            time = 2,
            rating = 4.0,
            reviewerCount = 924385
        ),
        RecentRestaurantData(
            imageId = R.drawable.katsu,
            name = "경양식",
            time = 20,
            rating = 4.3,
            reviewerCount = 278
        ),
    )
    LazyRow(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(space = 21.dp)
    ) {
        items(items = restaurantList) {
            RecentRestaurantItem(
                recentRestaurantData = it
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecentRestaurantDataPreview() {
    RecentRestaurantRow()
}