package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderItemHeader(
    date: String,
    status: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = date,
            style = CoupangEatsTheme.typography.body_01_M_14,
            color = CoupangEatsTheme.colors.gray500,
            fontWeight = CoupangEatsTheme.typography.body_01_M_14.fontWeight,
        )
        Surface(
            shape = RoundedCornerShape(size = 20.dp),
            color = CoupangEatsTheme.colors.gray200
        ) {
            Text(
                text = "주문상세",
                modifier = Modifier.padding(horizontal = 6.dp, vertical = 8.dp),
                style = CoupangEatsTheme.typography.body_02_SB_12,
                color = CoupangEatsTheme.colors.black,
                fontWeight = CoupangEatsTheme.typography.body_02_SB_12.fontWeight
            )
        }
    }
}