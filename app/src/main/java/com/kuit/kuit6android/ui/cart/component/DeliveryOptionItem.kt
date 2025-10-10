package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun DeliveryOptionItem(
    modifier: Modifier = Modifier,
    optionString: String,
    timeString: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val s = if (optionString.trim() == "픽업") "픽업" else "도착"
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(CoupangEatsTheme.colors.white)
            .border(
                width = 1.dp,
                color = if (isSelected)
                    CoupangEatsTheme.colors.black
                else
                    CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(20.dp)
            )
            .clickable { onClick() }
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = optionString,
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_03_B_16
        )
        Text(
            text = "${timeString}분 후 ${s}",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_04_SB_14
        )
    }
}

@Preview
@Composable
private fun DeliveryOptionItemPreview() {
    Column {
        DeliveryOptionItem(
            optionString = "픽업",
            timeString = "22~37",
            isSelected = true,
            onClick = {}
        )
        DeliveryOptionItem(
            optionString = "가게배달",
            timeString = "22~37",
            isSelected = false,
            onClick = {}
        )
    }
}