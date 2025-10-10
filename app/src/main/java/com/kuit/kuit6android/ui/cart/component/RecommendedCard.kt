// app/src/main/java/com/kuit/kuit6android/ui/cart/component/RecommendCard.kt
package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "함께 먹으면 좋아요",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )

            Spacer(modifier = Modifier.height(16.dp))

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

@Composable
fun RecommendedRow(
    item: RecommendedItem,
    onAddClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            // 이미지 영역
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        color = CoupangEatsTheme.colors.gray200,
                        shape = RoundedCornerShape(8.dp)
                    )
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    text = item.name,
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    color = CoupangEatsTheme.colors.black
                )
                Text(
                    text = "${String.format("%,d", item.price)}원",
                    style = CoupangEatsTheme.typography.body_02_R_12,
                    color = CoupangEatsTheme.colors.gray500
                )
            }
        }

        // Add 버튼
        RecommendedAddButton(onClick = onAddClick)
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendedRowPreview() {
    KUIT6_ANDROIDTheme {
        RecommendedRow(
            item = RecommendedItem(
                id = 1,
                name = "황금올리브치킨 핫크리스피",
                price = 24500
            ),
            onAddClick = {}
        )
    }
}

@Composable
fun RecommendedAddButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(32.dp)
            .background(
                color = CoupangEatsTheme.colors.white,
                shape = RoundedCornerShape(8.dp)
            ),
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = CoupangEatsTheme.colors.white
        )
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "추가",
            tint = CoupangEatsTheme.colors.black,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendedAddButtonPreview() {
    KUIT6_ANDROIDTheme {
        RecommendedAddButton(onClick = {})
    }
}