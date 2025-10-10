package com.kuit.kuit6android.ui.shoppingcart.menu.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.data.CartMenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingCartMenuScreen(modifier: Modifier = Modifier) {
    val menuList = listOf(
        CartMenuData(
            title = "BBQ 소스",
            price = "가격 : 500원",
            source = "소스 선택 : BBQ 칠리소스 2개",
            imageRes = R.drawable.ic_bbq
        ),
        CartMenuData(
            title = "황금올리브치킨",
            price = "가격 : 24,000원",
            source = "음료 추가선택 : 서비스 음료 미제공",
            imageRes = R.drawable.ic_chicken
        ),
        CartMenuData(
            title = "[황.양.반] 황올 반+양념 반",
            price = "가격 : 24,000원",
            source = "음료 추가선택 : 코카콜라",
            imageRes = R.drawable.ic_yangnyumchicken
        )
    )

    Column(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = CoupangEatsTheme.colors.gray200,
                shape = RoundedCornerShape(16.dp)
            )
            .background(CoupangEatsTheme.colors.white)
            .padding(vertical = 12.dp, horizontal = 12.dp)
    ) {
        // 메뉴 아이템들
        menuList.forEach { item ->
            ShoppingCartMenu(
                modifier = Modifier,
                menuTitle = item.title,
                menuPrice = item.price,
                menuSource = item.source,
                imageResource = item.imageRes
            )
            Spacer(modifier = Modifier.height(12.dp))
        }

        // 메뉴 추가 버튼
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = CoupangEatsTheme.colors.gray200,
                        shape = RoundedCornerShape(24.dp)
                    )
                    .background(
                        color = CoupangEatsTheme.colors.white,
                        shape = RoundedCornerShape(24.dp)
                    )
                    .padding(horizontal = 20.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = "add",
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "메뉴 추가",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.head_03_B_16
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ShoppingCartMenuListPreview() {
    ShoppingCartMenuScreen()
}
