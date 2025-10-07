package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kuit.kuit6android.ui.home.component.recentrestaurant.MockData

@Composable
fun FavoriteHeader(
    modifier: Modifier,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 27.dp
            )
    ) {
        Spacer(
            modifier = Modifier.height(
                height = 20.dp
            )
        )
        FavoriteTopBar(
            modifier,
            navController = navController
        )

        Spacer(
            modifier = Modifier.height(
                height = 58.dp
            )
        )

        Text(
            text = "총 ${MockData.restaurantList.size}개",
            fontSize = 20.sp
        )

        Spacer(
            modifier = Modifier.height(
                height = 24.dp
            )
        )
    }
}