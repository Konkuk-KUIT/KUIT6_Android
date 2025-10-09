package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import com.kuit.kuit6android.ui.shoppingcart.Menu
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun SuggestMenu(menu: Menu, modifier: Modifier = Modifier){
    Row(
        modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Row {
            Image(
                painter = painterResource(menu.img),
                contentDescription = "menu",
                modifier = Modifier.size(50.dp)
            )
            Column(
                modifier = Modifier.padding(start = 8.dp)
            ){
                Text(
                    text = menu.name,
                    style = CoupangEatsTheme.typography.head_04_SB_14
                )
                Text(
                    text = "${menu.price}원",
                    style = CoupangEatsTheme.typography.body_02_R_12,
                    modifier = Modifier.padding(top = 5.dp)
                )
            }
        }

        Button(
            onClick = {},
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = CoupangEatsTheme.colors.gray300
                )
                .size(30.dp),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = CoupangEatsTheme.colors.white
            ),
            contentPadding = PaddingValues(0.dp),

        ) {
            Icon(
                painter = painterResource(R.drawable.outline_add_24),
                contentDescription = "add",
                modifier = Modifier.size(15.dp),
                tint = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview
@Composable
private fun SuggestMenuPreview(){
    SuggestMenu(
        menu = Menu(
            name = "떡볶이",
            price = 10000,
            count = 1,
            detail = "맛있는 떡볶이",
            img = R.drawable.storeexample
        )
    )
}