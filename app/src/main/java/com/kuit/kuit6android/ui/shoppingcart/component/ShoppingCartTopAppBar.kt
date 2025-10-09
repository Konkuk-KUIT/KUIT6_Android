package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingCartTopAppBar(modifier: Modifier = Modifier){
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
        Icon(
            painter = painterResource(R.drawable.outline_keyboard_backspace_24),
            modifier = Modifier.size(24.dp),
            contentDescription = "back"
        )
        Text(
            "장바구니",
            style = CoupangEatsTheme.typography.head_02_B_20
        )
        Icon(
            painter = painterResource(R.drawable.ic_my_eats),
            modifier = Modifier.size(24.dp),
            contentDescription = "my eats"
        )
    }
}

@Preview
@Composable
private fun ShoppingCartTopAppBarPreview(){
    ShoppingCartTopAppBar()
}