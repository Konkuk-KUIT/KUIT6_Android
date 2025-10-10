package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun PickupMethodCard(
    method: String,
    estimatedTime: String,
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
                text = "수령방법을 선택해주세요",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )

            Spacer(modifier = Modifier.height(12.dp))

            PickupRow(
                method = method,
                estimatedTime = estimatedTime
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PickupMethodCardPreview() {
    KUIT6_ANDROIDTheme {
        PickupMethodCard(
            method = "가게배달",
            estimatedTime = "22~37분 후 도착"
        )
    }
}

@Composable
fun PickupRow(
    method: String,
    estimatedTime: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = CoupangEatsTheme.colors.gray100,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(16.dp)
    ) {
        Text(
            text = method,
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = CoupangEatsTheme.colors.black
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = estimatedTime,
            style = CoupangEatsTheme.typography.body_02_R_12,
            color = CoupangEatsTheme.colors.gray500
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PickupRowPreview() {
    KUIT6_ANDROIDTheme {
        PickupRow(
            method = "가게배달",
            estimatedTime = "22~37분 후 도착"
        )
    }
}