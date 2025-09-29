package com.kuit.kuit6android.ui.favorite.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.model.User
import com.kuit.kuit6android.model.factory.StoreFactory
import com.kuit.kuit6android.ui.components.favorite.StoreListComponent
import com.kuit.kuit6android.ui.components.favorite.TopBarComponent
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun FavoriteScreen(
    padding: PaddingValues,
    modifier: Modifier = Modifier,
    user: User = User(
        name = "채민지",
        phone = "010-1234-5678",
        myReview = listOf(),
        helpCount = 0,
        favoriteStore = StoreFactory.getStoreList()
    )
) {
    Column(
        modifier = Modifier
            .then(modifier)
            .padding(padding)
    ) {
        TopBarComponent(modifier = Modifier.padding(horizontal = 27.dp))
        Text(
            text = "총 ${user.favoriteStore.size}개",
            fontSize = 20.sp,
            fontFamily = Pretendard,
            modifier = Modifier.padding(top = 58.dp, start = 27.dp)
        )
        HorizontalDivider(
            thickness = 8.dp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF7F8F8))
                .padding(top = 24.dp)
        )

        StoreListComponent(
            user.favoriteStore, modifier = Modifier
                .padding(top = 27.dp)
                .align(
                    Alignment.CenterHorizontally
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FavoriteScreenPreview() {
    FavoriteScreen(padding = PaddingValues())
}