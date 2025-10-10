package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun FreeDeliveryItem(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(47.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(CoupangEatsTheme.colors.apricot)
            .border(1.dp, CoupangEatsTheme.colors.gray300, shape = RoundedCornerShape(10.dp))
            .padding(vertical = 14.dp)
    ){
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(start = 42.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                painter = painterResource(R.drawable.ic_receipt),
                contentDescription = "receipt",
                tint = CoupangEatsTheme.colors.black,
                modifier = modifier.size(20.dp)
            )
            Text(
                text = "지금 주문하면",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black,
                modifier = modifier.padding(start = 8.dp, end = 4.dp)
            )
            Text(
                text = "무료배달!",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.blue,
                modifier = modifier.padding(end = 5.dp)
            )
            Icon(
                painter = painterResource(R.drawable.ic_arrow_right),
                contentDescription = "arrow_right",
                tint = CoupangEatsTheme.colors.black,
                modifier = modifier.size(14.dp)
            )
        }

    }
}

@Preview
@Composable
private fun FreeDeliveryItemPreview(){
    FreeDeliveryItem()
}