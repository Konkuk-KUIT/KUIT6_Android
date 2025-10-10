package com.kuit.kuit6android.ui.cart.component

import android.R
import android.view.Menu
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.cart.data.CartMenuDetail
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun CartDetail(menu: CartMenuDetail, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(horizontal = 40.dp, vertical = 10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = menu.menu,
                    style = CoupangEatsTheme.typography.head_03_B_16
                )
                Text(
                    text = "가격 :${menu.price}원",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.gray500,
                    modifier = Modifier.padding(top = 15.dp)
                )
            }
            Image(
                painter = painterResource(menu.img),
                contentDescription = "menu",
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
        }
        Text(
            text = menu.detail,
            style = CoupangEatsTheme.typography.body_02_SB_12,
            color = CoupangEatsTheme.colors.gray500,
            modifier = Modifier.padding(top = 8.dp)
        )
        Row(
            modifier = Modifier
                .padding(top = 15.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = modifier
                    .padding(start = 113.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(
                        width = 1.dp, shape = RoundedCornerShape(size = 10.dp),
                        color = CoupangEatsTheme.colors.gray300
                    )
            ) {
                Text(
                    text = "옵션 변경",
                    style = CoupangEatsTheme.typography.caption_01_R_10,
                    color = CoupangEatsTheme.colors.black
                )
            }
            Box(
                modifier = modifier
                    .padding(start = 31.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(
                        width = 1.dp, shape = RoundedCornerShape(size = 10.dp),
                        color = CoupangEatsTheme.colors.gray300
                    )
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_delete),
                    modifier = modifier.size(10.dp),
                    contentDescription = "trash",
                    tint = CoupangEatsTheme.colors.black
                )
                Text(
                    text = "1",
                    style = CoupangEatsTheme.typography.caption_01_R_10,
                    color = CoupangEatsTheme.colors.black
                )
            }
        }
    }
}
