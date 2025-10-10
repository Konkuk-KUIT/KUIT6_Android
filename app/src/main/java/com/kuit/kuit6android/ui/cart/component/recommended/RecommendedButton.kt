package com.kuit.kuit6android.ui.cart.component.recommended

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun RecommendedAddButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
            .size(32.dp)
            .background(
                color = CoupangEatsTheme.colors.white,
                shape = RoundedCornerShape(8.dp)
            ),
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = CoupangEatsTheme.colors.white
        )
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "추가",
            tint = CoupangEatsTheme.colors.black,
            modifier = Modifier.size(20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendedAddButtonPreview() {
    KUIT6_ANDROIDTheme {
        RecommendedAddButton(onClick = {})
    }
}