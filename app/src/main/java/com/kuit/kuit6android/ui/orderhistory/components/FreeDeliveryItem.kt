package com.kuit.kuit6android.ui.orderhistory.components

import com.kuit.kuit6android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun FreeDeliveryItem(modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(10.dp))
        .background(color = CoupangEatsTheme.colors.Apricot)
        .border(width = 1.dp, shape = RoundedCornerShape(10.dp),
            color = CoupangEatsTheme.colors.Gray300)
    ){
        Row(
            modifier = modifier
                .padding(vertical = 16.dp)
                .padding(horizontal = 42.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(painter = painterResource(id = R.drawable.ic_recipe),
                modifier = modifier.size(20.dp),
                contentDescription = "ic_recipe",
                tint = CoupangEatsTheme.colors.black
            )
            Text(
                text = "지금 주문하면",
                style = CoupangEatsTheme.typograahy.head_04_5B_14,
                modifier = modifier.padding(start = 8.dp, end = 4.dp)
            )
            Text(
                text = "무료배달!",
                style = CoupangEatsTheme.typograahy.head_04_5B_14,
                color = CoupangEatsTheme.colors.Blue,
                modifier = modifier.padding(end = 5.dp)
            )
            Icon(
                painter = painterResource(id=R.drawable.ic_right),
                modifier = modifier.size(14.dp),
                tint = CoupangEatsTheme.colors.black,
                contentDescription = "ic_right",

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FreeDeliveryItemPrev() {
    FreeDeliveryItem()
}