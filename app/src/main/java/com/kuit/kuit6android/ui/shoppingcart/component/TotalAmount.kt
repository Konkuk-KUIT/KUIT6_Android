package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun TotalAmount(modifier: Modifier = Modifier) {
    Row{
        Column {
            Text(
                text= "메뉴 금액",
                style = CoupangEatsTheme.typography.body_02_SB_12,
                color= CoupangEatsTheme.colors.black
            )
            Text(
                text= "배달팁",
                style = CoupangEatsTheme.typography.body_02_SB_12,
                color= CoupangEatsTheme.colors.black
            )
        }
        Column {
            Text(
                text= "데이터 받아와서 더하자. ",
                style = CoupangEatsTheme.typography.body_02_SB_12,
                color= CoupangEatsTheme.colors.black
            )
            Text(
                text= "0원",
                style = CoupangEatsTheme.typography.body_02_SB_12,
                color= CoupangEatsTheme.colors.black
            )
        }
    }
    HorizontalDivider(
        color = CoupangEatsTheme.colors.gray300,
        thickness = 1.dp,
        modifier = Modifier.padding(vertical = 20.dp)
    )
    Row{
        Text(
            text = "결제예정금액",
            style = CoupangEatsTheme.typography.head_04_SB_14,
            color= CoupangEatsTheme.colors.black
        )
        Text(
            text = "여기도 더해서 넣자.. ",
            style = CoupangEatsTheme.typography.head_04_SB_14,
            color= CoupangEatsTheme.colors.black
        )

    }
}