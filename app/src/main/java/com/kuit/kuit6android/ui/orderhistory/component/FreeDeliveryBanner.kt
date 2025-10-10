package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun FreeDeliveryBanner(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = CoupangEatsTheme.colors.apricot
        ),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    vertical = 13.dp,
                    horizontal = 42.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.food_delivery_ticket_invoice),
                contentDescription = null,
                tint = CoupangEatsTheme.colors.black
            )
            Spacer(Modifier.width(width = 3.dp))
            Text(
                "지금 주문하면 ",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black,
                fontWeight = CoupangEatsTheme.typography.head_04_SB_14.fontWeight
            )
            Text(
                "무료배달!",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = Color.Blue,
                fontWeight = CoupangEatsTheme.typography.head_04_SB_14.fontWeight
            )
            Icon(
                painter = painterResource(id = R.drawable.rightarrow),
                contentDescription = null,
                tint = CoupangEatsTheme.colors.black
            )
        }
    }
}