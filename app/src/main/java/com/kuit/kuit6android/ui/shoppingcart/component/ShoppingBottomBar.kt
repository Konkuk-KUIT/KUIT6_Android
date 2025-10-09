package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.shoppingcart.Cart
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingBottomBar(cart: Cart, modifier: Modifier = Modifier){
    Row(
        modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(
                color = CoupangEatsTheme.colors.gray100
            ).padding(horizontal = 20.dp).padding(vertical = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column {
            Text(
                text = "${cart.menu.sumOf { it.price }}원",
                style = CoupangEatsTheme.typography.head_02_B_20
            )
            Text(
                text = "주문 가능",
                style = CoupangEatsTheme.typography.body_01_M_14,
                modifier = Modifier.padding(top = 5.dp)
            )
        }

        Button(
            onClick = {},
            modifier = Modifier.height(43.dp).width(130.dp).align(Alignment.CenterVertically),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = CoupangEatsTheme.colors.mint
            )
        ) {
            Text(
                text = "바로 주문",
                style = CoupangEatsTheme.typography.head_03_B_16
            )
        }
    }
}