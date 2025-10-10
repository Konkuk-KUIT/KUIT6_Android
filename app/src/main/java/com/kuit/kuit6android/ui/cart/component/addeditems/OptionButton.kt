package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun OptionButton(
    quantity: Int,
    onQuantityChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // 마이너스 버튼
        IconButton(
            onClick = {
                if (quantity > 1) {
                    onQuantityChange(quantity - 1)
                }
            },
            modifier = Modifier
                .size(32.dp)
                .background(
                    color = CoupangEatsTheme.colors.gray200,
                    shape = RoundedCornerShape(8.dp)
                ),
            enabled = quantity > 1
        ) {
            Text(
                text = "−",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = if (quantity > 1) CoupangEatsTheme.colors.black
                else CoupangEatsTheme.colors.gray400
            )
        }

        // 수량
        Text(
            text = quantity.toString(),
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = CoupangEatsTheme.colors.black,
            modifier = Modifier.widthIn(min = 20.dp)
        )

        // 플러스 버튼
        IconButton(
            onClick = {
                onQuantityChange(quantity + 1)
            },
            modifier = Modifier
                .size(32.dp)
                .background(
                    color = CoupangEatsTheme.colors.mint,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            Text(
                text = "+",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OptionButtonPreview() {
    KUIT6_ANDROIDTheme {
        Row(modifier = Modifier.padding(16.dp)) {
            OptionButton(
                quantity = 2,
                onQuantityChange = {}
            )
        }
    }
}