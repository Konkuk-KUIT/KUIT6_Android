package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.layout.Arrangement
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
fun RestaurantInfo(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.mini_chicken),
            modifier = Modifier.size(30.dp).padding(start = 20.dp),
            contentDescription = "mini chicken icon"
        )
        Text(
            text = "BBQ 건대점",
            modifier = modifier.padding(start = 10.dp),
            style = CoupangEatsTheme.typography.head_03_B_16
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_rignt),
            modifier = modifier.size(16.dp).padding(start = 7.dp),
            contentDescription = "right point",
            tint = CoupangEatsTheme.colors.black
        )
    }
}

@Preview (showBackground = true)
@Composable
private fun RestaurantInfoPreview() {
    RestaurantInfo()
}