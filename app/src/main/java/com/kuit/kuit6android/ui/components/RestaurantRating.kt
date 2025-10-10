package com.kuit.kuit6android.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import java.text.DecimalFormat

@Composable
fun RestaurantRating(
    restaurantRating: Double,
    restaurantReviewCnt: Int,
    arrangementSpace: Dp
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(space = arrangementSpace),
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
            text = "${restaurantRating.toString()} (${
                DecimalFormat("#,###").format(
                    restaurantReviewCnt
                )
            })",
            fontSize = 12.sp,
            color = Color(
                color = 0xFF575252
            )
        )
    }
}