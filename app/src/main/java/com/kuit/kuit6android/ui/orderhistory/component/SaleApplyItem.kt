package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.traceEventEnd
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun SaleApplyItem (
    modifier : Modifier = Modifier,
    saleAmount : String
){
    Row (
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(color = CoupangEatsTheme.colors.lavender)
            .padding(vertical = 8.dp)
            .padding(start = 13.dp, end = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Icon(
            painter = painterResource(R.drawable.ic_thunder),
            contentDescription = "thunder",
            tint = CoupangEatsTheme.colors.purple,
            modifier = modifier.size(11.dp).padding(end = 3.dp)
        )
        Text(
            text = saleAmount + "원 할인이 적용됐어요",
            style = CoupangEatsTheme.typography.body_02_SB_12,
            color = CoupangEatsTheme.colors.purple
        )
    }
}

@Preview
@Composable
private fun SaleApplyItemPreview(){
    SaleApplyItem(Modifier,"4,000")
}