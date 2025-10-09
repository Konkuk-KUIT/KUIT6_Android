package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.Menu
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun MenuComponent(menu: Menu, modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableIntStateOf(menu.count) }
    Column(
        modifier = modifier.padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = menu.name,
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
            modifier = Modifier.padding(top = 15.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {},
                modifier = Modifier.border(
                    width = 1.dp,
                    color = CoupangEatsTheme.colors.gray300,
                    shape = RoundedCornerShape(10.dp)
                ).width(67.dp).height(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = CoupangEatsTheme.colors.gray300
                ),
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    text = "옵션 변경",
                    style = CoupangEatsTheme.typography.caption_01_R_10,
                    color = CoupangEatsTheme.colors.black
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            QuantityControlButton(
                count = count,
                onIncrease = {count++},
                onDelete = {count = 0}
            )
        }
        HorizontalDivider(
            thickness = 1.dp,
            color = CoupangEatsTheme.colors.gray300,
            modifier = Modifier.padding(top = 25.dp, bottom = 20.dp)
        )
    }
}

@Composable
private fun QuantityControlButton(
    count: Int,
    onIncrease: () -> Unit,
    onDelete: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .border(1.dp, Color.LightGray, RoundedCornerShape(20.dp))
            .background(Color.White)
            .padding(horizontal = 10.dp, vertical = 6.dp)
            .height(IntrinsicSize.Min),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.outline_delete_24),
            contentDescription = "delete",
            modifier = Modifier
                .size(10.dp)
                .clickable { onDelete() },
            tint = Color.Black
        )

        Text(
            text = count.toString(),
            style = CoupangEatsTheme.typography.caption_01_R_10,
            color = CoupangEatsTheme.colors.black
        )

        Icon(
            painter = painterResource(R.drawable.outline_add_24),
            contentDescription = "add",
            modifier = Modifier
                .size(10.dp)
                .clickable { onIncrease() },
            tint = Color.Black
        )
    }
}

@Preview
@Composable
private fun MenuComponentPreview(){
    MenuComponent(
        menu = Menu(
            name = "떡볶이",
            price = 10000,
            count = 1,
            detail = "맛있는 떡볶이",
            img = R.drawable.storeexample
        )
    )
}