package com.kuit.kuit6android.ui.shoppingcart.component.deliver

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun DeliveryMethod(method : String, time : String) {
    Column (
        modifier = Modifier.padding(20.dp)
    ){
        Text(method,
            style = CoupangEatsTheme.typography.head_03_B_16
            )
        Spacer(modifier = Modifier.width(9.dp))
        Text(time,
            style = CoupangEatsTheme.typography.head_04_SB_14)
    }
}