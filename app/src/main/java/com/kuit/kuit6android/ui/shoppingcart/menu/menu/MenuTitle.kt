package com.kuit.kuit6android.ui.shoppingcart.menu.menu

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun MenuTitle( name : String) {
    Text(
        name,
        style = CoupangEatsTheme.typography.head_03_SB_16
    )
}
