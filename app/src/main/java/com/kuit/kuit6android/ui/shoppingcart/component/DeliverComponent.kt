package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun DeliverComponent(title : String, time : String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier.border(
            width = 1.dp,
            color = CoupangEatsTheme.colors.gray300,
            shape = RoundedCornerShape(20.dp)
        ).fillMaxWidth().padding(20.dp)
    ) {
        Text(
            text = title,
            style = CoupangEatsTheme.typography.head_03_B_16
        )
        Text(
            text = time,
            style = CoupangEatsTheme.typography.head_04_SB_14,
            modifier = Modifier.padding(top = 9.dp)
        )
    }
}