package com.kuit.kuit6android.ui.shoppingcart.component

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.data.ItemNameData
import com.kuit.kuit6android.ui.shoppingcart.data.ShoppingCartData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun MarketMenuBox(modifier: Modifier = Modifier,
                  cartData: ShoppingCartData, // ✅ 전체 가게 데이터 받기
                  item: ItemNameData,
                  quantity: Int,
                  onQuantityChange: (Int) -> Unit) {
    Column() {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top=20.dp, start = 20.dp, end=20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Text(
                    "${item.name}",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    color = CoupangEatsTheme.colors.black
                )
                Spacer(modifier = modifier.height(15.dp))
                Text(
                    "가격 ${item.cost}원",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.gray500
                )
                Spacer(modifier = modifier.height(15.dp))
                Text(
                    "${item.extra}",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.gray500
                )
            }
            Image(
                painter = painterResource(id = item.imageResId),
                contentDescription = "메뉴사진",
                modifier = modifier
                    .size(50.dp)
            )

        }
        Spacer(modifier = modifier.height(15.dp))
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically) {
            Row(
                modifier = modifier
                    .width(67.dp)
                    .height(30.dp)
                    .border(
                        width = 1.dp,
                        color = CoupangEatsTheme.colors.gray300,
                        shape = RoundedCornerShape(10.dp)
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "옵션 변경",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.gray500
                )
            }

            Spacer(modifier = modifier.width(31.dp))
            Row(
                modifier = modifier
                    .width(89.dp)
                    .height(30.dp)
                    .border(
                        width = 1.dp,
                        color = CoupangEatsTheme.colors.gray300,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(horizontal = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.trashcan),
                    contentDescription = "제거",
                    modifier = modifier
                        .size(10.dp)
                        .clickable {
                            if (quantity > 1) onQuantityChange(quantity - 1)
                        }
                )
                Text(
                    text = quantity.toString(),
                    style = CoupangEatsTheme.typography.caption_01_R_10,
                    color = CoupangEatsTheme.colors.black
                )

                Image(
                    painter = painterResource(R.drawable.plus_icon),
                    contentDescription = "추가",
                    modifier = modifier
                        .size(10.dp)
                        .clickable { onQuantityChange(quantity + 1) }
                )
            }

        }
    }
}

