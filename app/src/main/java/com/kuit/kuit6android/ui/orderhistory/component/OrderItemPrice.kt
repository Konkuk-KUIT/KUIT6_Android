package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun OrderItemPrice(
    originalPrice: Int,
    finalPrice: Int,
    couponDiscount: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        // 결제 금액
        Row(
            modifier = Modifier.padding(start = 20.dp, end = 28.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "결제금액",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
            Spacer(modifier = Modifier.weight(1f))
            if (originalPrice != finalPrice) {
                Text(
                    text = "${String.format("%,d", originalPrice)}원",
                    style = CoupangEatsTheme.typography.body_01_R_14,
                    color = CoupangEatsTheme.colors.gray400,
                    textDecoration = TextDecoration.LineThrough
                )
                Spacer(modifier = Modifier.width(4.dp))
            }
            Text(
                text = "${String.format("%,d", finalPrice)}원",
                style = CoupangEatsTheme.typography.head_02_B_20
            )
        }

        // 쿠폰 할인 정보
        if (couponDiscount > 0) {
            Spacer(modifier = Modifier.height(8.dp))
            Surface(
                shape = RoundedCornerShape(4.dp),
                color = CoupangEatsTheme.colors.lavender
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_dialog_info),
                        contentDescription = null,
                        modifier = Modifier.size(12.dp),
                        tint = CoupangEatsTheme.colors.purple
                    )
                    Text(
                        text = "${String.format("%,d", couponDiscount)}원 할인이 적용됐어요",
                        style = CoupangEatsTheme.typography.body_02_R_12,
                        color = CoupangEatsTheme.colors.purple
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderItemPricePreview() {
    KUIT6_ANDROIDTheme {
        OrderItemPrice(
            originalPrice = 10000,
            finalPrice = 8500,
            couponDiscount = 1500
        )
    }
}