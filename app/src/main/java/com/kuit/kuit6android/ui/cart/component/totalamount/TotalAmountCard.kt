package com.kuit.kuit6android.ui.cart.component.totalamount

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
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
            .fillMaxWidth(),
        shape = RoundedCornerShape(size = 20.dp),
        colors = CardDefaults.cardColors(
            containerColor = CoupangEatsTheme.colors.white
        ),
        border = BorderStroke(
            width = 1.dp,
            color = CoupangEatsTheme.colors.gray300
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Spacer(modifier = Modifier.height(16.dp))

            // 메뉴 금액
            DetailedTotalRow(
                menuAmount = menuPrice,
                deliverAmount = deliveryFee
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
        HorizontalDivider(color = CoupangEatsTheme.colors.gray300)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
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