// app/src/main/java/com/kuit/kuit6android/ui/cart/component/RecommendCard.kt
package com.kuit.kuit6android.ui.cart.component.recommended

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.cart.model.RecommendedItem
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun RecommendCard(
    items: List<RecommendedItem>,
    onAddClick: (RecommendedItem) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = CoupangEatsTheme.colors.white
        ),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(
            width = 1.dp,
            color = CoupangEatsTheme.colors.gray300
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            items.forEachIndexed { index, item ->
                RecommendedRow(
                    item = item,
                    onAddClick = { onAddClick(item) }
                )
                if (index < items.size - 1) {
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendCardPreview() {
    KUIT6_ANDROIDTheme {
        RecommendCard(
            items = listOf(
                RecommendedItem(
                    id = 1,
                    name = "황금올리브치킨 핫크리스피",
                    price = 24500
                ),
                RecommendedItem(
                    id = 2,
                    name = "치즈볼",
                    price = 2000
                ),
                RecommendedItem(
                    id = 3,
                    name = "BBQ 먹태어",
                    price = 6000
                )
            ),
            onAddClick = {}
        )
    }
}