package com.kuit.kuit6android.ui.shoppingcart.menu.menu

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun MenuOptionButton(
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 8.dp),
        border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray200),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = CoupangEatsTheme.colors.white,
            contentColor = CoupangEatsTheme.colors.black
        )
    ) {
        Text(
            text = "옵션 변경",
            style = CoupangEatsTheme.typography.body_02_R_12
        )
    }
}
