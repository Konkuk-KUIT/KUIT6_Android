package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedButton
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun CartBottomBar(
    modifier: Modifier = Modifier,
    totalPrice: Int
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(CoupangEatsTheme.colors.gray100)
            .padding(vertical = 14.dp, horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(
                text = "${totalPrice.toDecimalFormat()}원",
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.head_02_B_20
            )
            Text(
                text = "주문 가능",
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.body_01_M_14
            )
        }

        CoupangEatsRoundedButton(
            backColor = CoupangEatsTheme.colors.mint,
            isOpened = true,
            modifier = Modifier
                .width(131.dp)
        )
    }
}

@Preview
@Composable
private fun CartBottomBarPreview() {
    CartBottomBar(totalPrice = 48500)
}