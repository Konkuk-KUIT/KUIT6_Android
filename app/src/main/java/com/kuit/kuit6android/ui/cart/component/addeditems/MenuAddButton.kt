package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun MenuAddButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = CoupangEatsTheme.colors.white,
            contentColor = CoupangEatsTheme.colors.black
        ),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300),
        elevation = ButtonDefaults.buttonElevation(0.dp)
    ) {
        Text(
            text = "+ 메뉴 추가",
            style = CoupangEatsTheme.typography.head_03_B_16
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MenuAddButtonPreview() {
    KUIT6_ANDROIDTheme {
        MenuAddButton(onClick = {})
    }
}