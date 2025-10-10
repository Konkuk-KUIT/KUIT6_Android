package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.cart.model.CartItem
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme
import com.kuit.kuit6android.ui.theme.LocalCoupangEatsColors
import com.kuit.kuit6android.ui.theme.LocalCoupangEatsTypography
import com.kuit.kuit6android.ui.theme.defaultCoupangEatsColors
import com.kuit.kuit6android.ui.theme.defaultCoupangEatsTypography

@Composable
fun AddedItemRow(
    item: CartItem,
    onQuantityChange: (Int) -> Unit,
    onOptionsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top
        ) {
            Column(modifier = Modifier.weight(weight = 1f)) {
                Text(
                    text = item.name,
                    style = CoupangEatsTheme.typography.head_03_B_16,
                )
                Spacer(modifier = Modifier.height(height = 15.dp))
                Text(
                    text = "${String.format("%,d", item.price)}원",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.gray500
                )
                if (item.options.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(height = 15.dp))
                    Text(
                        text = item.options,
                        style = CoupangEatsTheme.typography.body_02_SB_12,
                        color = CoupangEatsTheme.colors.gray500
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = painterResource(id = R.drawable.bbqsauce),
                contentDescription = "bbq 치킨",
                modifier = Modifier
                    .size(size = 50.dp)
                    .clip(shape = RoundedCornerShape(size = 10.dp))
            )
        }

        Spacer(modifier = Modifier.height(height = 15.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 옵션 변경 버튼
            OptionButton(
                onOptionsClick = onOptionsClick
            )
            Spacer(modifier = Modifier.width(width = 31.dp))
            // 수량 조절 버튼
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                val quantity = item.quantity
                val onQuantityChange = onQuantityChange
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
    }
}

@Preview(showBackground = true)
@Composable
fun AddedItemRowPreview() {
    KUIT6_ANDROIDTheme {
        // CompositionLocalProvider 추가
        CompositionLocalProvider(
            LocalCoupangEatsColors provides defaultCoupangEatsColors,
            LocalCoupangEatsTypography provides defaultCoupangEatsTypography
        ) {
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
}