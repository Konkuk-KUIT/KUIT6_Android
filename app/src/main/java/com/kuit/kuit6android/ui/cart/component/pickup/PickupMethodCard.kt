package com.kuit.kuit6android.ui.cart.component.pickup

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

enum class PickupMethod {
    DELIVERY,
    PICKUP
}

@Composable
fun PickupMethodCard(
    modifier: Modifier = Modifier
) {
    var selectedMethod by remember { mutableStateOf(PickupMethod.DELIVERY) }

    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(size = 20.dp),
        colors = CardDefaults.cardColors(
            containerColor = CoupangEatsTheme.colors.white
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(space = 10.dp)
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            PickupRow(
                method = "가게배달",
                estimatedTime = "22~37분 후 도착",
                isSelected = selectedMethod == PickupMethod.DELIVERY,
                onClick = { selectedMethod = PickupMethod.DELIVERY }
            )

            PickupRow(
                method = "픽업",
                estimatedTime = "22~37분 후 픽업",
                isSelected = selectedMethod == PickupMethod.PICKUP,
                onClick = { selectedMethod = PickupMethod.PICKUP }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PickupMethodCardPreview() {
    KUIT6_ANDROIDTheme {
        PickupMethodCard()
    }
}