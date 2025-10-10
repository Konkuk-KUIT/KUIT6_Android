package com.kuit.kuit6android.ui.cart.component.recommended

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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