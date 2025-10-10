package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun StoreDetailRow(
    storeName: String,
    onStoreClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onStoreClick)
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.bbq),
            contentDescription = "가게 상세",
            modifier = modifier.size(size = 30.dp)
        )
        Spacer(modifier = Modifier.width(width = 10.dp))
        Text(
            text = storeName,
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = CoupangEatsTheme.colors.black
        )
        Spacer(modifier = Modifier.width(width = 7.dp))
        Image(
            painter = painterResource(id = R.drawable.rightarrow),
            contentDescription = "가게 상세",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StoreDetailRowPreview() {
    KUIT6_ANDROIDTheme {
        StoreDetailRow(
            storeName = "BBQ 건대점",
            onStoreClick = {}
        )
    }
}