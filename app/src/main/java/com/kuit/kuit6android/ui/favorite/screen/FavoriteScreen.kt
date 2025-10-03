package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.favorite.component.StoreItem
import com.kuit.kuit6android.ui.favorite.component.favoriteStores

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    navController : NavController,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(padding)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 27.dp, end = 27.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.back_grey),
                contentDescription = "뒤로가기",
                modifier = Modifier.size(24.dp)
                    .clickable {
                        navController.navigate(Route.MyEats) {
                            popUpTo(Route.Favorite) { inclusive = true }
                        }
                    }
            )

            Text(
                "즐겨찾기",
                modifier = Modifier.padding(start = 27.dp),
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.weight(1f)) // 남는 공간 밀어내기

            Text(
                "수정",
                fontSize = 20.sp,
                color = Color(0xFF02AFFE)
            )
        }
        Spacer(modifier = Modifier.height(58.dp))
        // 개수 텍스트
        Text(
            text = "총 ${favoriteStores.size}개",
            modifier = Modifier.padding(start = 27.dp, top = 16.dp),
            fontSize = 20.sp
        )

        // 즐겨찾기 리스트
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(favoriteStores) { store ->
                StoreItem(
                    store = store,
                    onClick = {
                        navController.navigate(Route.StoreDetail(store.name))
                    }
                )
            }
        }
    }
}
