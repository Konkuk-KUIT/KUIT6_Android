package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.shoppingcart.data.getShoppingCartTotalCost
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun TotalAmount(modifier: Modifier = Modifier) {

    val menuCost = getShoppingCartTotalCost()
    val deliveryFee = 0
    val totalCost = menuCost + deliveryFee

    Column (
        modifier= modifier
            .padding(horizontal=20.dp)
            .border(width=1.dp, color= CoupangEatsTheme.colors.gray300, shape = RoundedCornerShape(20.dp))
            .padding(top= 20.dp, start = 20.dp, end= 20.dp, bottom = 16.dp )

    ){
        Row (
            modifier= modifier
                .fillMaxWidth(),
            horizontalArrangement= Arrangement.SpaceBetween)
        {
            Column {
                Text(
                    text = "메뉴 금액",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.black
                )
                Spacer(modifier= modifier.height(10.dp))
                Text(
                    text = "배달팁",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.black
                )
            }
            Column {
                Text(
                    text = "${menuCost}원",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.black
                )
                Spacer(modifier= modifier.height(10.dp))
                Text(
                    text = "${deliveryFee}원",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.black
                )
            }
        }
        HorizontalDivider(
            color = CoupangEatsTheme.colors.gray300,
            thickness = 1.dp,
            modifier = Modifier.padding(vertical = 20.dp)
        )
        Row (
            modifier= modifier.fillMaxWidth(),
            horizontalArrangement= Arrangement.SpaceBetween)
        {
            Text(
                text = "결제예정금액",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black
            )
            Text(
                text = "${totalCost}원",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun hahahahPriview() {
    TotalAmount()
}