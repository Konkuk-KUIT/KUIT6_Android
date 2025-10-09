package com.kuit.kuit6android.ui.orderhistory.screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun FreeDeliveryItem(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(
                CoupangEatsTheme.colors.apricot
            )
            .border(
                1.dp,
                shape = RoundedCornerShape(10.dp),
                color = CoupangEatsTheme.colors.gray300
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 42.dp)
                .padding(vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.vector),
                contentDescription = "recipt",
                modifier = Modifier.size(20.dp),
                tint = CoupangEatsTheme.colors.black
            )
            Text(
                text = "지금 주문하면 ",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black,
                modifier = Modifier.padding(start = 8.dp, end = 4.dp)
            )
            Text(
                text = "무료 배달",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.blue
            )
            Icon(
                painter = painterResource(R.drawable.outline_keyboard_arrow_right_24),
                contentDescription = "right",
                modifier = Modifier.size(14.dp),
                tint = CoupangEatsTheme.colors.black
            )
        }
    }
}