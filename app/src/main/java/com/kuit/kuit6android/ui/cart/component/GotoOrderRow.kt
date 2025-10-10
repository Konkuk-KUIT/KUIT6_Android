package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun GotoOrderRow(
    totalAmount: Int,
    onOrderClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        color = CoupangEatsTheme.colors.white,
        shadowElevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            // 금액과 주문 가능 텍스트
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    text = "${String.format("%,d", totalAmount)}원",
                    style = CoupangEatsTheme.typography.head_01_B_24,
                    color = CoupangEatsTheme.colors.black
                )
                Text(
                    text = "주문 가능",
                    style = CoupangEatsTheme.typography.body_02_R_12,
                    color = CoupangEatsTheme.colors.gray500
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // 주문 버튼
            OrderButton(onClick = onOrderClick)
        }
    }
}

@Composable
fun OrderButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = CoupangEatsTheme.colors.mint
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            text = "배달 주문",
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GotoOrderRowPreview() {
    KUIT6_ANDROIDTheme {
        GotoOrderRow(
            totalAmount = 48500,
            onOrderClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OrderButtonPreview() {
    KUIT6_ANDROIDTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            OrderButton(onClick = {})
        }
    }
}