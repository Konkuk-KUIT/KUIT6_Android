package com.kuit.kuit6android.ui.myeats.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.Route

@Composable
fun FavoriteButton(navController: NavHostController) {
    Row(
        modifier = Modifier
            .padding(start = 27.dp)
            .height(30.dp)
            .clickable { navController.navigate(Route.Favorite) }, // 클릭 시 라우트 이동
        verticalAlignment = Alignment.CenterVertically // 이미지와 텍스트 세로 중앙
    ) {
        Image(
            painter = painterResource(id = R.drawable.like),
            contentDescription = "즐겨찾기",
            modifier = Modifier.size(30.dp)
        )
        Text(
            text = "즐겨찾기",
            fontSize = 21.sp,
            modifier = Modifier.padding(start = 19.dp)
        )
    }
}
