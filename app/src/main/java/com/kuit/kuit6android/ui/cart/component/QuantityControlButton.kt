package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun QuantityControlButton(
    modifier: Modifier = Modifier,
    count: Int,
    onIncrease: () -> Unit,
) {
    Row (
        modifier = Modifier
            .width(89.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(CoupangEatsTheme.colors.white)
            .border(1.dp, CoupangEatsTheme.colors.gray300, RoundedCornerShape(10.dp))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Icon(
            painter = painterResource(id = R.drawable.ic_trash),
            contentDescription = "ic_trash",
            tint = CoupangEatsTheme.colors.black,
            modifier = Modifier.size(10.dp)
        )

        Text(
            text = "${count.toDecimalFormat()}",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.caption_01_R_10
        )

        Icon(
            painter = painterResource(id = R.drawable.ic_plus),
            contentDescription = "ic_plus",
            tint = CoupangEatsTheme.colors.black,
            modifier = Modifier.size(10.dp)
                .clickable{ onIncrease() }
        )
    }
}

@Preview
@Composable
private fun QuantityControlButtonPreview() {
    QuantityControlButton(count = 1, onIncrease = {})
}