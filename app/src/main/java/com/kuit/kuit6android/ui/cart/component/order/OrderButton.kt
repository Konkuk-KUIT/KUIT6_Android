package com.kuit.kuit6android.ui.cart.component.order

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun OrderButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = CoupangEatsTheme.colors.mint
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            text = "배달 주문",
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OrderButtonPreview() {
    KUIT6_ANDROIDTheme {
        Column(modifier = Modifier.padding(16.dp)) {
            OrderButton(onClick = {})
        }
    }
}