package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderItemActions(
    isStoreOpen: Boolean,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedButton(
                onClick = { },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = CoupangEatsTheme.colors.white,
                    contentColor = if (isStoreOpen) CoupangEatsTheme.colors.black
                    else CoupangEatsTheme.colors.gray400
                ),
                border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300),
                enabled = isStoreOpen
            ) {
                Text(
                    text = "같은 메뉴 담기",
                    style = CoupangEatsTheme.typography.body_01_R_14
                )
            }

            Button(
                onClick = { },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CoupangEatsTheme.colors.mint
                ),
                enabled = isStoreOpen
            ) {
                Text(
                    "바로 주문",
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    color = CoupangEatsTheme.colors.black
                )
            }
        }

        // 오픈 전일 때 안내 문구
        if (!isStoreOpen) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "오픈 전 가게예요",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = CoupangEatsTheme.typography.body_02_R_12,
                color = CoupangEatsTheme.colors.gray400
            )
        }
    }
}