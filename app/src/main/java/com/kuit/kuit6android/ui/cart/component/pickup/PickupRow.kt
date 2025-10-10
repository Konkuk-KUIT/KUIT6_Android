package com.kuit.kuit6android.ui.cart.component.pickup

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun PickupRow(
    method: String,
    estimatedTime: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = if (isSelected) CoupangEatsTheme.colors.black else CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(size = 20.dp)
            )
            .clickable(onClick = onClick)
            .padding(all = 20.dp)
    ) {
        Text(
            text = method,
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = CoupangEatsTheme.colors.black
        )
        Spacer(modifier = Modifier.height(height = 9.dp))
        Text(
            text = estimatedTime,
            style = CoupangEatsTheme.typography.head_04_SB_14,
            color = CoupangEatsTheme.colors.black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PickupRowPreview() {
    KUIT6_ANDROIDTheme {
        PickupRow(
            method = "가게배달",
            estimatedTime = "22~37분 후 도착",
            isSelected = true,
            onClick = {}
        )
    }
}