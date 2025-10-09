package com.kuit.kuit6android.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
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
fun CoupangEatsRoundedButton(
    modifier: Modifier = Modifier,
    isOpened: Boolean,
    backColor: Color,
    onClick: () -> Unit = {},
) {

    var topP = 12.dp
    var bottomP = 10.dp

    if (isOpened) {
        topP = 13.5.dp
        bottomP = 13.5.dp
    }
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(10.dp))
            .background(backColor)
            .then(
                if (isOpened)
                    Modifier.clickable { onClick() }
                else
                    Modifier
            )
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(10.dp),
                color = if (backColor == CoupangEatsTheme.colors.white)
                    CoupangEatsTheme.colors.gray300
                else
                    Color.Transparent
            )
            .padding(top = topP, bottom = bottomP),
        contentAlignment = Alignment.Center
    ) {
        if (isOpened) {
            Text(
                text = if (backColor == CoupangEatsTheme.colors.white)
                    "같은 메뉴 담기"
                else "바로 주문",
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.head_03_B_16
            )
        } else {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "같은 메뉴 담기",
                    color = CoupangEatsTheme.colors.gray300,
                    style = CoupangEatsTheme.typography.head_02_B_20
                )
                Text(
                    text = "오픈 전 가게예요",
                    color = CoupangEatsTheme.colors.gray300,
                    style = CoupangEatsTheme.typography.head_05_B_10
                )
            }
        }
    }
}

@Preview
@Composable
private fun CoupangEatsRoundedButtonPreview() {
    Column {
        CoupangEatsRoundedButton(isOpened = false, backColor = CoupangEatsTheme.colors.white)
        CoupangEatsRoundedButton(isOpened = true, backColor = CoupangEatsTheme.colors.white)
        CoupangEatsRoundedButton(isOpened = true, backColor = CoupangEatsTheme.colors.mint)
    }
}