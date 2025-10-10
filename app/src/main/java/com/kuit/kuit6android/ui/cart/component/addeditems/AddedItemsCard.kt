package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.cart.model.CartItem
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun AddedItemsCard(
    items: List<CartItem>,
    onQuantityChange: (Int, Int) -> Unit,
    onOptionsClick: (CartItem) -> Unit,
    onMenuAddClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = CoupangEatsTheme.colors.white
        ),
        shape = RoundedCornerShape(size = 20.dp),
        border = BorderStroke(
            width = 1.dp,
            color = CoupangEatsTheme.colors.gray300
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
//                .padding(16.dp)
        ) {
            items.forEachIndexed { index, item ->
                AddedItemRow(
                    item = item,
                    onQuantityChange = { newQuantity ->
                        onQuantityChange(item.id, newQuantity)
                    },
                    onOptionsClick = { onOptionsClick(item) }
                )

                if (index < items.size - 1) {
                    Spacer(modifier = Modifier.height(height = 5.dp))
                    HorizontalDivider(
                        thickness = 1.dp,
                        color = CoupangEatsTheme.colors.gray300,
                        modifier = modifier.padding(horizontal = 20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(height = 5.dp))
            HorizontalDivider(
                thickness = 1.dp,
                color = CoupangEatsTheme.colors.gray300,
            )

            // 메뉴 추가 버튼
            MenuAddButton(onClick = onMenuAddClick)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddedItemsCardPreview() {
    KUIT6_ANDROIDTheme {
        AddedItemsCard(
            items = listOf(
                CartItem(
                    id = 1,
                    name = "BBQ 소스",
                    price = 500,
                    quantity = 1,
                    options = "소스 선택 : BBQ허니갈릭소스(무료)"
                ),
                CartItem(
                    id = 2,
                    name = "황금올리브치킨",
                    price = 24000,
                    quantity = 2,
                    options = "옵션 추가(선택) : 칠리 마요소스"
                )
            ),
            onQuantityChange = { _, _ -> },
            onOptionsClick = {},
            onMenuAddClick = {}
        )
    }
}