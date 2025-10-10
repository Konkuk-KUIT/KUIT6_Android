package com.kuit.kuit6android.ui.shoppingcart.component.recommend

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

data class RecommendMenuData(
    val name: String,
    val price: String,
    val imageRes: Int
)

@Composable
fun RecommendMenuScreen(modifier: Modifier = Modifier) {
    val recommendList = listOf(
        RecommendMenuData("황금올리브치킨 핫크리스피", "24,500원", R.drawable.ic_chicken),
        RecommendMenuData("제로콜라", "2,000원", R.drawable.ic_koke),
        RecommendMenuData("BBQ 떡볶이", "8,000원", R.drawable.ic_tteok),
        RecommendMenuData("BBQ볼(5개)", "5,000원", R.drawable.ic_ball)
    )

    Column(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = CoupangEatsTheme.colors.gray200,
                shape = RoundedCornerShape(16.dp)
            )
            .background(CoupangEatsTheme.colors.white)
            .padding(vertical = 8.dp, horizontal = 12.dp)
    ) {
        recommendList.forEachIndexed { index, item ->
            RecommendMenu(
                name = item.name,
                price = item.price,
                imageResource = item.imageRes
            )
            // 항목 구분선
            if (index != recommendList.lastIndex) {
                Divider(
                    color = CoupangEatsTheme.colors.gray200,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 6.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecommendMenuScreenPreview() {
    RecommendMenuScreen()
}
