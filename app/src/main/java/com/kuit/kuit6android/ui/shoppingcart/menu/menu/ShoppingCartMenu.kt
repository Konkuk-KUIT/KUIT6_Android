package com.kuit.kuit6android.ui.shoppingcart.menu.menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.component.MenuImage

@Composable
fun ShoppingCartMenu(
    modifier: Modifier = Modifier,
    menuTitle: String,
    menuPrice: String,
    menuSource: String,
    imageResource: Int
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
            ) {
                MenuTitle(menuTitle)
                Spacer(modifier = Modifier.height(15.dp))
                MenuContent(menuPrice)
                Spacer(modifier = Modifier.height(15.dp))
                MenuContent(menuSource)
            }

            Spacer(modifier = Modifier.width(12.dp))

            MenuImage(imageId = imageResource)
        }

        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            MenuOptionButton()
            Spacer(modifier = Modifier.width(31.dp))
            MenuCountChange()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ShoppingCartMenuPreview() {
    ShoppingCartMenu(
        modifier = Modifier,
        menuTitle = "황금올리브치킨",
        menuPrice = "가격 : 24,000원",
        menuSource = "음료 추가선택 : 서비스 음료 미제공",
        imageResource = R.drawable.ic_chicken
    )
}
