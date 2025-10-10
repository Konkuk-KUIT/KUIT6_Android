package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
fun CartTopBar(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_back),
            modifier = Modifier.size(24.dp),
            contentDescription = "back icon"
        )
        Text(
            text = "장바구니",
            style = CoupangEatsTheme.typography.head_02_B_20
        )
        Icon(
            painter = painterResource(R.drawable.add_friend),
            modifier = Modifier.size(24.dp),
            contentDescription = "my eats"
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CartTopBarPreview() {
    CartTopBar()
}