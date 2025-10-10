package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.OutlinedButton
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
fun OrderItemActions(
    isStoreOpen: Boolean,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        if (isStoreOpen) {
            // 가게 오픈 시: 두 개 버튼
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                OutlinedButton(
                    onClick = { },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = CoupangEatsTheme.colors.white,
                        contentColor = CoupangEatsTheme.colors.black
                    ),
                    border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300),
                    shape = RoundedCornerShape(size = 10.dp)
                ) {
                    Text(
                        text = "같은 메뉴 담기",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        fontWeight = CoupangEatsTheme.typography.head_03_B_16.fontWeight
                    )
                }

                Button(
                    onClick = { },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = CoupangEatsTheme.colors.mint
                    ),
                    shape = RoundedCornerShape(size = 10.dp)
                ) {
                    Text(
                        "바로 주문",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        fontWeight = CoupangEatsTheme.typography.head_03_B_16.fontWeight,
                        color = Color.Black
                    )
                }
            }
        } else {
            // 가게 오픈 전: 하나의 버튼만
            OutlinedButton(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = CoupangEatsTheme.colors.white,
                    contentColor = CoupangEatsTheme.colors.gray400
                ),
                border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300),
                enabled = false,
                shape = RoundedCornerShape(size = 10.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "같은 메뉴 담기",
                        style = CoupangEatsTheme.typography.body_01_R_14
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "오픈 전 가게예요",
                        style = CoupangEatsTheme.typography.body_02_R_12,
                        color = CoupangEatsTheme.colors.gray400
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "가게 오픈")
@Composable
fun OrderItemActionsOpenPreview() {
    KUIT6_ANDROIDTheme {
        OrderItemActions(
            isStoreOpen = true,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true, name = "가게 오픈 전")
@Composable
fun OrderItemActionsClosedPreview() {
    KUIT6_ANDROIDTheme {
        OrderItemActions(
            isStoreOpen = false,
            modifier = Modifier.padding(16.dp)
        )
    }
}