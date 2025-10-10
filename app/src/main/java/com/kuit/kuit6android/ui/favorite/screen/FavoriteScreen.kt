package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier.padding(
            padding
        )
    ) {
        Text("Favorite Screen")
    }
}

@Preview(showBackground = true)
@Composable
private fun FavoriteScreenPreview() {
    FavoriteScreen(padding = PaddingValues())
}