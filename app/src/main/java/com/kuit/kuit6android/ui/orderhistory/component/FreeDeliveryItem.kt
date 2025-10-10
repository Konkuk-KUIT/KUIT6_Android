package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun FreeDeliveryItem(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .border(
                1.dp,
                CoupangEatsTheme.colors.gray300,
                RoundedCornerShape(10.dp))
            .height(47.dp)
            .background(
                color = CoupangEatsTheme.colors.apricot,
                shape = RoundedCornerShape(12.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
        ){
        Icon(
            painter = painterResource(id = R.drawable.bill_acon), // 아이콘 리소스
            contentDescription = "영수증",
            modifier = Modifier
                .padding(start = 42.dp)
                .size(20.dp)
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text="지금 주문하면",
            style = CoupangEatsTheme.typography.head_04_SB_14,
            color = CoupangEatsTheme.colors.black
        )
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text="무료배달!",
            style = CoupangEatsTheme.typography.head_04_SB_14,
            color = CoupangEatsTheme.colors.blue
        )
        Icon(
            painter = painterResource(id = R.drawable.arrow_big), // 아이콘 리소스
            contentDescription = "화살표",
            modifier = Modifier
                .padding(start = 8.dp)
                .size(14.dp)
        )
    }
}
