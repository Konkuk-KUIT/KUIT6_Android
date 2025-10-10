package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OptionButton(
    onOptionsClick: () -> Unit
) {
    OutlinedButton(
        onClick = onOptionsClick,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = CoupangEatsTheme.colors.white,
            contentColor = CoupangEatsTheme.colors.black
        ),
        border = BorderStroke(width = 1.dp, color = CoupangEatsTheme.colors.gray300),
        shape = RoundedCornerShape(size = 10.dp),
        contentPadding = PaddingValues(horizontal = 11.dp, vertical = 10.dp)
    ) {
        Text(
            text = "옵션 변경",
            style = CoupangEatsTheme.typography.caption_01_R_10
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OptionButtonPreview() {
    OptionButton { }
}