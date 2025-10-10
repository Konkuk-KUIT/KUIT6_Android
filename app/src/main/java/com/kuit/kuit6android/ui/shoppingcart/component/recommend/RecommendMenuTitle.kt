package com.kuit.kuit6android.ui.shoppingcart.component.recommend

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun RecommendMenuTitle( name : String) {
    Text(
        name,
        style = CoupangEatsTheme.typography.head_04_SB_14
    )
}
