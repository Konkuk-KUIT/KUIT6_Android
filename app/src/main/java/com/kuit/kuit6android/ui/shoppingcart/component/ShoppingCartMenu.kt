package com.kuit.kuit6android.ui.shoppingcart.component

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.Cart
import com.kuit.kuit6android.ui.shoppingcart.Menu
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingCartMenu(cart: Cart, modifier: Modifier = Modifier){
    Column(
    ) {
        Row(
            modifier = Modifier.padding(bottom = 15.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(cart.img),
                contentDescription = "menu",
                modifier = Modifier.size(30.dp)
            )
            Text(
                text = cart.name,
                style = CoupangEatsTheme.typography.head_03_B_16,
                modifier = Modifier.padding(start = 10.dp)
            )
            Icon(
                painter = painterResource(R.drawable.outline_keyboard_arrow_right_24),
                contentDescription = "right",
                modifier = Modifier.padding(start = 7.dp).size(16.dp)
            )
        }

        Column(
            modifier = Modifier.border(
                width = 1.dp,
                color = CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(20.dp)
            )
        ) {
            cart.menu.forEach {
                MenuComponent(menu = it)
            }
        }

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = CoupangEatsTheme.colors.white
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_add_24),
                contentDescription = "add",
                modifier = Modifier.size(20.dp),
                tint = CoupangEatsTheme.colors.black
            )
            Text(
                text = "메뉴 추가",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview
@Composable
private fun ShoppingCartMenuPreview(){
    ShoppingCartMenu(
        cart = Cart(
            img = R.drawable.storeexample,
            name = "홍콩반점",
            menu = listOf(
                Menu(
                    name = "떡볶이",
                    price = 10000,
                    count = 1,
                    detail = "맛있는 떡볶이",
                    img = R.drawable.storeexample
                )
            )
        )
    )
}