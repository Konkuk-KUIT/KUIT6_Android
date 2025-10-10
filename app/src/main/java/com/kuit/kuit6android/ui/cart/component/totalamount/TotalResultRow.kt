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
fun TotalResultRow(
    totalAmount: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "결제예정금액",
            style = CoupangEatsTheme.typography.head_04_SB_14,
            color = CoupangEatsTheme.colors.black
        )
        Text(
            text = "${String.format("%,d", totalAmount)}원",
            style = CoupangEatsTheme.typography.head_04_SB_14,
            color = CoupangEatsTheme.colors.black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TotalResultRowPreview() {
    KUIT6_ANDROIDTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            TotalResultRow(
                totalAmount = 48500
            )
        }
    }
}