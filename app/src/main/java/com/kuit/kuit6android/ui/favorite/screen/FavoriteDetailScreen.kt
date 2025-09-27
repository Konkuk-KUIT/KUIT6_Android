package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route
import java.text.DecimalFormat

@Composable
fun FavoriteDetailScreen(
    modifier: Modifier = Modifier,
    detail: Route.FavoriteDetail
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FavoriteDetailTopBar()

        Spacer(
            modifier = Modifier.height(
                height = 20.dp
            )
        )


        Image(
            painter = painterResource(
                id = detail.restaurantImageId
            ),
            contentDescription = "즐찾 세부정보"
        )
        Spacer(
            modifier = Modifier.height(
                height = 25.dp
            )
        )
        Text(
            text = detail.restaurantName,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(
            modifier = Modifier.height(
                height = 8.dp
            )
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
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
                text = "${detail.restaurantRating.toString()} (${
                    DecimalFormat("#,###").format(
                        detail.restaurantReviewerCount
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

@Preview(showBackground = true)
@Composable
private fun FavoriteDetailScreenPreview() {
    val mockDetail = Route.FavoriteDetail(
        restaurantName = "아워떡볶이",
        restaurantRating = 4.9,
        restaurantReviewerCount = 3849,
        restaurantImageId = R.drawable.restaurant
    )

    FavoriteDetailScreen(
        detail = mockDetail
    )
}