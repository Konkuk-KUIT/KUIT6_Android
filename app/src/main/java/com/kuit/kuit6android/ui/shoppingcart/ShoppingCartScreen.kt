package com.kuit.kuit6android.ui.shoppingcart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.component.ChargeComponent
import com.kuit.kuit6android.ui.shoppingcart.component.DeliverComponent
import com.kuit.kuit6android.ui.shoppingcart.component.MenuComponent
import com.kuit.kuit6android.ui.shoppingcart.component.ShoppingBottomBar
import com.kuit.kuit6android.ui.shoppingcart.component.ShoppingCartMenu
import com.kuit.kuit6android.ui.shoppingcart.component.ShoppingCartTopAppBar
import com.kuit.kuit6android.ui.shoppingcart.component.SuggestMenuList
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingCartScreen(
    padding: PaddingValues = PaddingValues(),
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            ShoppingCartTopAppBar(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(bottom = 20.dp)
            )
        },
        bottomBar = {
            ShoppingBottomBar(
                cart = Cart(
                    img = R.drawable.storeexample,
                    name = "홍콩반점",
                    menu = listOf(
                        Menu(
                            name = "떡볶이",
                            price = 10000,
                            count = 1,
                            detail = "맛있는 떡볶이",
                            img = R.drawable.storeexample
                        ),
                        Menu(
                            name = "떡볶이",
                            price = 10000,
                            count = 1,
                            detail = "맛있는 떡볶이",
                            img = R.drawable.storeexample
                        )
                    )
                ),
                modifier = Modifier.navigationBarsPadding()
            )
        },
        modifier = modifier
    ) { innerPadding ->

        // 👇 LazyColumn이 bottomBar 높이만큼 패딩을 가지도록 함
        LazyColumn(
            contentPadding = PaddingValues(
                start = 20.dp,
                end = 20.dp,
                top = innerPadding.calculateTopPadding(),
                bottom = innerPadding.calculateBottomPadding() + 20.dp
            )
        ) {
            item {
                ShoppingCartMenu(
                    cart = Cart(
                        img = R.drawable.storeexample,
                        name = "홍콩반점",
                        menu = listOf(
                            Menu(
                                name = "떡볶이",
                                price = 10000,
                                count = 1,
                                detail = "맛있는 떡볶이",
                                img = R.drawable.storeexample
                            ),
                            Menu(
                                name = "떡볶이",
                                price = 10000,
                                count = 1,
                                detail = "맛있는 떡볶이",
                                img = R.drawable.storeexample
                            )
                        )
                    )
                )
            }

            item {
                Text(
                    text = "함께 먹으면 좋아요",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    modifier = Modifier.padding(vertical = 20.dp)
                )
            }

            item {
                SuggestMenuList(
                    menuList = listOf(
                        Menu(
                            name = "떡볶이",
                            price = 10000,
                            count = 1,
                            detail = "맛있는 떡볶이",
                            img = R.drawable.storeexample
                        ),
                        Menu(
                            name = "떡볶이",
                            price = 10000,
                            count = 1,
                            detail = "맛있는 떡볶이",
                            img = R.drawable.storeexample
                        )
                    )
                )
            }

            item {
                Text(
                    text = "수령 방법을 선택해주세요",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    modifier = Modifier.padding(vertical = 20.dp)
                )
            }

            item {
                DeliverComponent(
                    title = "가게 배달",
                    time = "22~37분 후 도착"
                )
            }

            item {
                DeliverComponent(
                    title = "픽업",
                    time = "14~24분 후 픽업",
                    modifier = Modifier.padding(top = 10.dp)
                )
            }

            item {
                Text(
                    text = "결제 금액을 확인해주세요",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    modifier = Modifier.padding(vertical = 20.dp)
                )
            }

            item {
                ChargeComponent(
                    cart = Cart(
                        img = R.drawable.storeexample,
                        name = "홍콩반점",
                        menu = listOf(
                            Menu(
                                name = "떡볶이",
                                price = 10000,
                                count = 1,
                                detail = "맛있는 떡볶이",
                                img = R.drawable.storeexample
                            )
                        )
                    )
                )
            }
        }
    }
}



@Preview
@Composable
private fun ShoppingCartScreenPreview(){
    ShoppingCartScreen()
}
