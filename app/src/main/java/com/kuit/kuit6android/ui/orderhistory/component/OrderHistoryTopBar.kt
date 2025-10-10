package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun OrderHistoryTopBar(
    modifier: Modifier = Modifier,
    onCartClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 25.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "주문내역",
            style = CoupangEatsTheme.typography.head_02_B_20,
            fontWeight = CoupangEatsTheme.typography.head_02_B_20.fontWeight
        )

        IconButton(onClick = onCartClick) {
            Icon(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "장바구니",
                tint = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OrderHistoryTopBarPreview() {
    KUIT6_ANDROIDTheme {
        OrderHistoryTopBar()
    }
}