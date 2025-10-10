package com.kuit.kuit6android.ui.shoppingcart.component.recommend

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.component.MenuImage

@Composable
fun RecommendMenu(
    name: String,
    price: String,
    imageResource: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        MenuImage(imageId = imageResource)

        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 12.dp)
        ) {
            RecommendMenuTitle(name)
            Spacer(modifier = Modifier.height(4.dp))
            RecommendMenuContent(price)
        }

        RecommendAddButton()
    }
}

@Preview(showBackground = true)
@Composable
private fun RecommendMenuPreview() {
    RecommendMenu(
        name = "황금올리브치킨 핫크리스피",
        price = "24,500원",
        imageResource = R.drawable.ic_chicken
    )
}
