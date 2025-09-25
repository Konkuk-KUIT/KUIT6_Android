package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
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
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.RestaurantData
import java.text.DecimalFormat

@Composable
fun RestaurantItem(
    modifier: Modifier = Modifier,
    restaurantData: RestaurantData) {
    Column(
        modifier = modifier.size(
            width = 231.dp,
            height = 176.dp
        )
    ) {
        Image(
            painter = painterResource(
                id =restaurantData.imageId
            ),
            contentDescription = "식당",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .fillMaxWidth()
                .height(
                    height = 129.dp
                )
                .clip(RoundedCornerShape(8.dp))
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxWidth()
        ) {
            Text(
                text = restaurantData.name,
                fontSize = 14.sp,
                lineHeight = 17.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = restaurantData.time.toString() + "분",
                fontSize = 12.sp,
                lineHeight = 14.sp
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.star
                ),
                contentDescription = "별점",
                modifier = modifier.size(15.dp)
            )
            Text(
                text = "${restaurantData.rating.toString()} (${
                    DecimalFormat("#,###").format(
                        restaurantData.reviewCount
                    )
                })",
                fontSize = 12.sp,
                lineHeight = 14.sp
            )
        }
    }
}