package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.shoppingcart.Cart
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ChargeComponent(cart: Cart, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .border(
                width = 1.dp,
                color = CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(20.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "메뉴 금액",
                style = CoupangEatsTheme.typography.body_02_SB_12
            )
            Text(
                text = "${cart.menu.sumOf { it.price }}원",
                style = CoupangEatsTheme.typography.body_02_SB_12
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
        ) {
            Text(
                text = "배달 팁",
                style = CoupangEatsTheme.typography.body_02_SB_12
            )
            Text(
                text = "0원",
                style = CoupangEatsTheme.typography.body_02_SB_12
            )
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = CoupangEatsTheme.colors.gray300,
            modifier = Modifier.padding(vertical = 20.dp)
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "결제예정금액",
                style = CoupangEatsTheme.typography.body_02_SB_12
            )
            Text(
                text = "${cart.menu.sumOf { it.price }}원",
                style = CoupangEatsTheme.typography.body_02_SB_12
            )
        }
    }
}