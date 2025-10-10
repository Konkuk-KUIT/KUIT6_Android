package com.kuit.kuit6android.ui.orderhistory.screen.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.navigation.LocalNavController
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderHistoryTopAppBar(modifier: Modifier = Modifier){
    val navController = LocalNavController.current
    Row (
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            text = "주문 내역",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_02_B_20
        )
        Icon(
            painter = painterResource(R.drawable.cart),
            contentDescription = "cart",
            modifier = Modifier.size(30.dp).clickable{
                navController.navigate(Route.ShoppingCart)
            },
            tint = CoupangEatsTheme.colors.black
        )
    }
}