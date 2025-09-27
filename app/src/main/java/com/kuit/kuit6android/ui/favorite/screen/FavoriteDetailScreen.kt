package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RestaurantData
import java.text.DecimalFormat

@Composable
fun FavoriteDetailScreen(
    modifier: Modifier = Modifier,
    restaurantData: RestaurantData
) {
    Column {
        FavoriteDetailTopBar()
        Image(
            painter = painterResource(
                id = restaurantData.imageId
            ),
            contentDescription = "즐찾 세부정보"
        )
        Text(
            text = restaurantData.name
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.icon_star
                ),
                contentDescription = "Rating star",
                modifier = Modifier.size(
                    size = 15.dp
                )
            )
            Text(
                text = "${restaurantData.rating.toString()} (${
                    DecimalFormat("#,###").format(
                        restaurantData.reviewerCount
                    )
                })",
                fontSize = 12.sp,
                color = Color(
                    color = 0xFF575252
                )
            )
        }

    }
}