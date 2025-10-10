package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.cart.model.CartItem
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun AddedItemRow(
    item: CartItem,
    onQuantityChange: (Int) -> Unit,
    onOptionsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = item.name,
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    color = CoupangEatsTheme.colors.black
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "${String.format("%,d", item.price)}원",
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    color = CoupangEatsTheme.colors.black
                )
                if (item.options.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = item.options,
                        style = CoupangEatsTheme.typography.body_02_R_12,
                        color = CoupangEatsTheme.colors.gray500
                    )
                }
            }

            // 이미지 영역 (실제로는 Image 컴포저블 사용)
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .background(
                        color = CoupangEatsTheme.colors.gray200,
                        shape = RoundedCornerShape(8.dp)
                    )
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 옵션 변경 버튼
            OutlinedButton(
                onClick = onOptionsClick,
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = CoupangEatsTheme.colors.white,
                    contentColor = CoupangEatsTheme.colors.black
                ),
                border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300),
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(
                    text = "옵션변경",
                    style = CoupangEatsTheme.typography.body_02_R_12
                )
            }

            // 수량 조절 버튼
            OptionButton(
                quantity = item.quantity,
                onQuantityChange = onQuantityChange
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddedItemRowPreview() {
    KUIT6_ANDROIDTheme {
        AddedItemRow(
            item = CartItem(
                id = 1,
                name = "황금올리브치킨",
                price = 24000,
                quantity = 1,
                options = "옵션 추가(선택) : 세라노 칠리 마요소스"
            ),
            onQuantityChange = {},
            onOptionsClick = {}
        )
    }
}