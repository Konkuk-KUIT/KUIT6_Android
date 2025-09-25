package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun RestaurantRow(modifier: Modifier = Modifier) {
    val restaurantList = listOf(
        RestaurantData(
            imageId = R.drawable.salmon,
            name = "건대 연어 덮밥",
            time = 30,
            rating = 4.8,
            reviewCount = 3800
        ),
        RestaurantData(
            imageId = R.drawable.gomi,
            name = "고미 돈까스",
            time = 30,
            rating = 4.3,
            reviewCount = 5700
        ),
        RestaurantData(
            imageId = R.drawable.burritopia,
            name = "부리또피아",
            time = 30,
            rating = 4.7,
            reviewCount = 2700
        ),
        RestaurantData(
            imageId = R.drawable.burgerry,
            name = "버거리",
            time = 40,
            rating = 4.5,
            reviewCount = 7700
        ),
        RestaurantData(
            imageId = R.drawable.jejunoodle,
            name = "제주곤이칼국수",
            time = 45,
            rating = 4.8,
            reviewCount = 4000
        ),
    )
    LazyRow(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(space = 21.dp)
    ) {
        items(items = restaurantList) {
            RestaurantItem(
                restaurantData = it
            )
        }
    }
}