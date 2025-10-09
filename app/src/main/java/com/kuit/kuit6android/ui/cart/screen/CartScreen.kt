package com.kuit.kuit6android.ui.cart.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CartScreen(
    modifier: Modifier = Modifier,
    padding: PaddingValues,
    onBackClick: (() -> Unit)? = null
) {
    Text("cart")
}