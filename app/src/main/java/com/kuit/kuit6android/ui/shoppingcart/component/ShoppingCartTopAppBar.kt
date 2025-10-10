package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingCartTopAppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "back",
            modifier = Modifier.size(30.dp),
            tint = CoupangEatsTheme.colors.black
        )

        Box(
            modifier = Modifier
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "장바구니",
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.head_02_B_20,
            )
        }

        Icon(
            painter = painterResource(id = R.drawable.ic_person),
            contentDescription = "person",
            modifier = Modifier.size(30.dp),
            tint = CoupangEatsTheme.colors.black
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ShoppingCartTopAppBarPreview() {
    ShoppingCartTopAppBar()
}
