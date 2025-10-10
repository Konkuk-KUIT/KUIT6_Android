package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedButton
import com.kuit.kuit6android.ui.shoppingcart.data.getShoppingCartTotalCost
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun BottomCartBar(modifier: Modifier = Modifier) {
    val menuCost = getShoppingCartTotalCost()
    val deliveryFee = 0
    val totalCost = menuCost + deliveryFee
 Row(
     modifier= modifier
         .fillMaxWidth()
         .height(71.dp)
         .background(color= CoupangEatsTheme.colors.gray100)
         .padding(start = 20.dp, top = 15.dp),
     horizontalArrangement = Arrangement.SpaceBetween
 ){
     Column{
         Text(
             "${totalCost}원",
             style = CoupangEatsTheme.typography.head_02_B_20,
             color = CoupangEatsTheme.colors.black
         )
         Text(
             "주문 가능",
             style = CoupangEatsTheme.typography.body_01_M_14,
             color = CoupangEatsTheme.colors.black
         )
     }
     CoupangEatsRoundedButton(
         modifier= modifier. padding(end=20.dp)
     )

 }
}

@Preview(showBackground = true)
@Composable
private fun Prdfksjdfk() {
    BottomCartBar()
}