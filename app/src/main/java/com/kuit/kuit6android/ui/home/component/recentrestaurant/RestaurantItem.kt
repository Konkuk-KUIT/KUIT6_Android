package com.kuit.kuit6android.ui.home.component.recentrestaurant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.ui.components.RestaurantRating
import com.kuit.kuit6android.ui.home.data.RestaurantData

@Composable
fun RestaurantItem(
    modifier: Modifier = Modifier,
    restaurantData: RestaurantData
) {
    Column(
//        modifier = modifier.size(
//            width = 231.dp,
//            height = 176.dp
//        )
        modifier = modifier
    ) {
        Image(
            painter = painterResource(
                id = restaurantData.imageId
            ),
            contentDescription = "Recent restaurant",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(
                    height = 129.dp
                )
                .clip(RoundedCornerShape(8.dp))
        )

        Spacer(
            modifier = Modifier.height(
                height = 5.dp
            )
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = restaurantData.name,
                fontSize = 14.sp,
                lineHeight = 17.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = restaurantData.time.toString() + "분",
                fontSize = 12.sp,
                lineHeight = 14.sp
            )
        }

        Spacer(
            modifier = Modifier.weight(
                weight = 1.0f
            )
        )

        RestaurantRating(
            arrangementSpace = 5.dp,
            restaurantReviewCnt = restaurantData.reviewerCount,
            restaurantRating = restaurantData.rating
        )
    }
}