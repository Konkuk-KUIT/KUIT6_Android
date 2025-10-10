package com.kuit.kuit6android.ui.shoppingcart.component.recommend

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun RecommendMenuContent( value : String) {
    Text(
        value,
        style = CoupangEatsTheme.typography.body_02_R_12,
    )
}

