package com.kuit.kuit6android.ui.shoppingcart.menu.menu

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun MenuContent( value : String) {
    Text(
        value,
        style = CoupangEatsTheme.typography.body_02_SB_12,
        color = CoupangEatsTheme.colors.gray500
    )
}

