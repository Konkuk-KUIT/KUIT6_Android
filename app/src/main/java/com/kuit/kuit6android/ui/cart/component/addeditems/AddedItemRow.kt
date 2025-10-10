package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
                .fillMaxWidth(),
//                .padding(end = 20.dp),
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
                modifier = modifier
                    .border(
                        width = 1.dp,
                        color = CoupangEatsTheme.colors.gray300,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .padding(all = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(space = 22.dp)
            ) {
                val quantity = item.quantity

                // 쓰레기통 버튼
                Icon(
                    painter = painterResource(id = R.drawable.ic_delete),
                    contentDescription = "감소",
                    tint = CoupangEatsTheme.colors.gray400,
                    modifier = Modifier
                        .size(size = 10.dp)
                        .clickable {
                            if (quantity > 1) {
                                onQuantityChange(quantity - 1)
                            }
                        }
                )

                // 수량
                Text(
                    text = quantity.toString(),
                    style = CoupangEatsTheme.typography.body_01_M_14,
                )

                // 플러스 버튼
                Icon(
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = "증가",
                    tint = CoupangEatsTheme.colors.black,
                    modifier = Modifier
                        .size(size = 10.dp)
                        .clickable { onQuantityChange(quantity + 1) }
                )
            }
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