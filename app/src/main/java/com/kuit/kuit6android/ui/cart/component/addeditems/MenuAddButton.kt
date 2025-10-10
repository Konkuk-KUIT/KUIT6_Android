package com.kuit.kuit6android.ui.cart.component.addeditems

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "+ 메뉴 추가",
            style = CoupangEatsTheme.typography.head_03_B_16,
            modifier = modifier.clickable(
                onClick = onClick
            )
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