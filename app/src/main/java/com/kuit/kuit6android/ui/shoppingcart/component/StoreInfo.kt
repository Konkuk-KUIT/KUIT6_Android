package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.data.ShoppingCartData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun StoreInfo(
    cartData: ShoppingCartData, // 데이터 받기
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Image(
            painter= painterResource(cartData.imageResId),
            contentDescription = "가게 정보 이미지",
            modifier= modifier.size(30.dp)
        )
        Spacer(modifier= modifier.width(10.dp))
        Text(
            text= cartData.restaurantName,
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = CoupangEatsTheme.colors.black
        )

        Spacer(modifier= modifier.width(7.dp))
        Image(
            painter= painterResource(R.drawable.arrow_big),
            contentDescription ="화살표",
            modifier= modifier.size(16.dp)

        )

    }
}
