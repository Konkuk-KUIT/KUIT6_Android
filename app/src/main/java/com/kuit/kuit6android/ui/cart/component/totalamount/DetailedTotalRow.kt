package com.kuit.kuit6android.ui.cart.component.totalamount

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun DetailedTotalRow(
    modifier: Modifier = Modifier,
    menuAmount: Int,
    deliverAmount: Int
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(space = 10.dp)
    ) {

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "메뉴 금액",
                style = CoupangEatsTheme.typography.body_02_SB_12,
            )
            Text(
                text = "${String.format("%,d", menuAmount)}원",
                style = CoupangEatsTheme.typography.body_02_SB_12,
            )
        }
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "배달팁",
                style = CoupangEatsTheme.typography.body_02_SB_12,
            )
            Text(
                text = "${String.format("%,d", deliverAmount)}원",
                style = CoupangEatsTheme.typography.body_02_SB_12,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailedTotalRowPreview() {
    KUIT6_ANDROIDTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            DetailedTotalRow(
                menuAmount = 48500,
                deliverAmount = 3000
            )
        }
    }
}