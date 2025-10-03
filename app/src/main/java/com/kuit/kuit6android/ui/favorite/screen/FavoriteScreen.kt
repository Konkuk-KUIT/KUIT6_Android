package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.ui.favorite.components.FavoriteBar
import com.kuit.kuit6android.ui.favorite.components.FavoriteItemCard
import com.kuit.kuit6android.ui.favorite.components.FavoriteStore

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    onBack: () -> Unit,
    favorites: List<FavoriteStore>,
    onStoreClick: (FavoriteStore) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(padding)
            .fillMaxSize()
            .background(Color.White)
    ) {
        FavoriteBar(onBack = onBack)

        Text(
            text = "총 ${favorites.size}개",
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 27.dp)
        )

        Divider(color = Color(0xFFECECEC))

        LazyColumn(
            contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(favorites) { store ->
                FavoriteItemCard(store = store, onClick = { onStoreClick(store) })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FavoriteScreenPreview() {
    FavoriteScreen(
        padding = PaddingValues(0.dp),
        onBack = {},
        favorites = listOf(
            FavoriteStore("아워떡볶이", 4.9, 3849, 30),
        ),
        onStoreClick = {}
    )
}
