package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.cart.data.MenuData
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedImage
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun CartMenuItem(
    modifier: Modifier = Modifier,
    cartMenuData: MenuData,
    onIncrease: () -> Unit,
) {
    Column(
        modifier = modifier
            .background(CoupangEatsTheme.colors.white)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = cartMenuData.menuName,
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.head_03_B_16
                )
                Spacer(modifier = Modifier.padding(top = 15.dp))
                Text(
                    text = "가격 : ${cartMenuData.menuPrice.toDecimalFormat()}원",
                    color = CoupangEatsTheme.colors.gray500,
                    style = CoupangEatsTheme.typography.body_02_SB_12
                )
            }
            CoupangEatsRoundedImage(
                imgId = cartMenuData.imageId,
                menuName = cartMenuData.menuName,
                borderYN = true
            )
        }

        cartMenuData.menuOptions.forEach { option ->
            Text(
                text = option,
                color = CoupangEatsTheme.colors.gray500,
                style = CoupangEatsTheme.typography.body_02_SB_12,
                modifier = Modifier.padding(top = 8.dp)
            )
        }

        Spacer(modifier = Modifier.padding(top = 15.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            ChangeOptionButton()
            Spacer(modifier = Modifier.padding(start = 31.dp))
            QuantityControlButton(
                onIncrease = onIncrease,
                count = cartMenuData.menuCount
            )
        }

        Spacer(modifier = Modifier.padding(top = 25.dp))
    }
}

@Preview
@Composable
private fun CartMenuItemPreview() {
    CartMenuItem(
        modifier = Modifier.width(280.dp),
        cartMenuData = MenuData(
            "BBQ 소스",
            500,
            1,
            listOf("소스 선택 : BBQ양념치킨소스(25g)"),
            R.drawable.img_bbq_sauce
        ),
        onIncrease = {}
    )
}