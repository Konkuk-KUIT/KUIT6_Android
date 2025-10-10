package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun CartTopAppBar(
    onBackClick: () -> Unit,
    onProfileClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(CoupangEatsTheme.colors.white)
            .padding(horizontal = 8.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onBackClick) {
            Icon(
                painter = painterResource(id = R.drawable.icon_24_back_grey),
                contentDescription = "뒤로가기",
                modifier = modifier.size(size = 24.dp)
            )
        }

        Text(
            text = "장바구니",
            style = CoupangEatsTheme.typography.head_02_B_20,
            color = CoupangEatsTheme.colors.black
        )

        IconButton(onClick = onProfileClick) {
            Icon(
                painter = painterResource(id = R.drawable.personadd),
                contentDescription = "프로필",
                modifier = modifier.size(size = 24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartTopAppBarPreview() {
    KUIT6_ANDROIDTheme {
        CartTopAppBar(
            onBackClick = {},
            onProfileClick = {}
        )
    }
}