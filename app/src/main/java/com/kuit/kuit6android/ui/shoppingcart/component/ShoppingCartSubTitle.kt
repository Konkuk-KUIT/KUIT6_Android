package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingCarSubTitle(content : String) {
    Text(
        content,
        style = CoupangEatsTheme.typography.head_03_SB_16,
    )
}