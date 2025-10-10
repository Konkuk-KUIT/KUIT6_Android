package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun ShoppingCartBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(R.drawable.back_grey),
            contentDescription = "뒤로 가기",
            modifier= modifier.size(24.dp)
        )
        Text(
            "장바구니",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_02_B_20
        )
        Image(
            painter = painterResource(R.drawable.personadd),
            contentDescription = "사람추가",
            modifier= modifier.size(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ShoppingCartPreview() {
    ShoppingCartBar()
}