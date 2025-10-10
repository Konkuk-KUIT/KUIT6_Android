package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun CartTopBar(
    modifier: Modifier = Modifier,
    onBackClick: (() -> Unit)? = null
) {
    Row(
        modifier
            .background(CoupangEatsTheme.colors.white)
            .padding(vertical = 20.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(
                R.drawable.ic_back_arrow
            ),
            contentDescription = "뒤로가기 화살표",
            modifier = Modifier
                .size(24.dp)
                .clickable { onBackClick?.invoke() },
            tint = CoupangEatsTheme.colors.gray500

        )
        Text(
            text = "장바구니",
            color = CoupangEatsTheme.colors.black,
            style = CoupangEatsTheme.typography.head_02_B_20
        )
        Icon(
            painter = painterResource(R.drawable.ic_person_add),
            contentDescription = "person add",
            modifier = Modifier
                .size(24.dp),
            tint = Color(0xFF231F20)
        )
    }
}

@Preview
@Composable
private fun CartTopBarPreview() {
    CartTopBar()
}