package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun TotalAmountCard(
    menuPrice: Int,
    deliveryFee: Int,
    totalAmount: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = CoupangEatsTheme.colors.white
        ),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "결제금액을 확인해주세요",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 메뉴 금액
            DetailedTotalRow(
                label = "메뉴 금액",
                amount = menuPrice
            )

            Spacer(modifier = Modifier.height(8.dp))

            // 배달비
            DetailedTotalRow(
                label = "배달비",
                amount = deliveryFee
            )

            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider(color = CoupangEatsTheme.colors.gray300)
            Spacer(modifier = Modifier.height(16.dp))

            // 결제예정금액
            TotalResultRow(
                totalAmount = totalAmount
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TotalAmountCardPreview() {
    KUIT6_ANDROIDTheme {
        TotalAmountCard(
            menuPrice = 48500,
            deliveryFee = 0,
            totalAmount = 48500
        )
    }
}

@Composable
fun DetailedTotalRow(
    label: String,
    amount: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = CoupangEatsTheme.typography.body_01_R_14,
            color = CoupangEatsTheme.colors.gray500
        )
        Text(
            text = "${String.format("%,d", amount)}원",
            style = CoupangEatsTheme.typography.body_01_R_14,
            color = CoupangEatsTheme.colors.black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailedTotalRowPreview() {
    KUIT6_ANDROIDTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            DetailedTotalRow(
                label = "메뉴 금액",
                amount = 48500
            )
        }
    }
}

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
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = CoupangEatsTheme.colors.black
        )
        Text(
            text = "${String.format("%,d", totalAmount)}원",
            style = CoupangEatsTheme.typography.head_02_B_20,
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