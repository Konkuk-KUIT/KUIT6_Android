package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.components.RestaurantRating

@Composable
fun FavoriteDetailScreen(
    modifier: Modifier = Modifier,
    detail: Route.FavoriteDetail
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier.height(
                height = 20.dp
            )
        )

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
            contentDescription = "즐찾 세부정보",
            modifier = modifier.fillMaxWidth()
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

        RestaurantRating(
            arrangementSpace = 10.dp,
            restaurantRating = detail.restaurantRating,
            restaurantReviewCnt = detail.restaurantReviewerCount
        )

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