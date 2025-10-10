package com.kuit.kuit6android.ui.shoppingcart.menu.menu

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun MenuCountChange(
    count: Int = 1,
    onIncrease: () -> Unit = {},
    onDecrease: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        color = CoupangEatsTheme.colors.white,
        shadowElevation = 0.dp,
        tonalElevation = 0.dp,
        border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray200)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(40.dp)
                .padding(horizontal = 8.dp)
        ) {
            IconButton(onClick = onDecrease, modifier = Modifier.size(24.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_trash),
                    contentDescription = "decrease",
                    tint = CoupangEatsTheme.colors.black
                )
            }

            Text(
                text = count.toString(),
                style = CoupangEatsTheme.typography.body_02_R_12,
                color = CoupangEatsTheme.colors.black,
                modifier = Modifier.padding(horizontal = 6.dp)
            )

            IconButton(onClick = onIncrease, modifier = Modifier.size(24.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = "increase",
                    tint = CoupangEatsTheme.colors.black
                )
            }
        }
    }
}
