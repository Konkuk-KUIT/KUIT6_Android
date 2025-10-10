package com.kuit.kuit6android.ui.shoppingcart.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.shoppingcart.component.MarketMenuBox
import com.kuit.kuit6android.ui.shoppingcart.component.ShoppingCartBar
import com.kuit.kuit6android.ui.shoppingcart.component.SideMenuRecommend
import com.kuit.kuit6android.ui.shoppingcart.component.StoreInfo
import com.kuit.kuit6android.ui.shoppingcart.component.TakeoutOrPickup
import com.kuit.kuit6android.ui.shoppingcart.component.TotalAmount
import com.kuit.kuit6android.ui.shoppingcart.data.getShoppingCartData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun ShoppingCartScreen(modifier: Modifier = Modifier) {
    val shoppingCartList = getShoppingCartData()

    Column(){
        ShoppingCartBar()

        LazyColumn {
            shoppingCartList.forEach { cartData ->
                item {
                    StoreInfo(cartData = cartData)
                }


                items(cartData.itemList.size) { index ->
                    MarketMenuBox(
                        cartData = cartData,
                        item = cartData.itemList[index]
                    )
                }


                item {
                    Text(
                        text = "함께 먹으면 좋아요",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        color = CoupangEatsTheme.colors.black
                    )
                }

                items(cartData.recommendList.size) { index ->
                    SideMenuRecommend(
                        recommend = cartData.recommendList[index]
                    )
                }


                item {
                    Text(
                        text = "수령방법을 선택해주세요",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        color = CoupangEatsTheme.colors.black
                    )
                }
                item { TakeoutOrPickup() }


                item {
                    Text(
                        text = "결제금액을 확인해주세요",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        color = CoupangEatsTheme.colors.black
                    )
                }
                item { TotalAmount() }


                item {
                    androidx.compose.material3.Divider(
                        thickness = 1.dp,
                        color = CoupangEatsTheme.colors.gray100
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun ShoppingCartPreview() {
    ShoppingCartScreen()
}