package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ChangeOptionButton(modifier: Modifier = Modifier,
                       onClick: () -> Unit = {}) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(CoupangEatsTheme.colors.white)
            .clickable { onClick() }
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(10.dp),
                color = CoupangEatsTheme.colors.gray300
            )
            .padding(vertical = 10.dp, horizontal = 11.55.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "옵션 변경",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.caption_01_R_10
        )
    }
}

@Preview
@Composable
private fun ChangeOptionButtonPreview() {
    ChangeOptionButton()
}