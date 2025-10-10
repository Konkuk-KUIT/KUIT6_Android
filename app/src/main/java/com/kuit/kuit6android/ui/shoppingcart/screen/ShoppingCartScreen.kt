import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.shoppingcart.component.BottomCartBar
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

    Column {
        ShoppingCartBar()

        LazyColumn {
            shoppingCartList.forEach { cartData ->

                item {
                    StoreInfo(cartData = cartData)
                }

                itemsIndexed(cartData.itemList) { index, item ->
                    var quantity by rememberSaveable(cartData.restaurantName + index) { mutableStateOf(1) }

                    MarketMenuBox(
                        cartData = cartData,
                        item = item,
                        quantity = quantity,
                        onQuantityChange = { newQty -> quantity = newQty }
                    )
                }

                item {
                    Text(
                        text = "함께 먹으면 좋아요",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        color = CoupangEatsTheme.colors.black,
                        modifier = modifier.padding(start = 20.dp)
                    )
                }

                itemsIndexed(cartData.recommendList) { _, recommend ->
                    SideMenuRecommend(recommend = recommend)
                }

                item {
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "수령방법을 선택해주세요",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        color = CoupangEatsTheme.colors.black,
                        modifier = modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    TakeoutOrPickup()
                }

                item {
                    Spacer(modifier = Modifier.height(30.dp))
                    Text(
                        text = "결제금액을 확인해주세요",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        color = CoupangEatsTheme.colors.black,
                        modifier = modifier.padding(start = 20.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    TotalAmount()
                }

                item {
                    Spacer(modifier = Modifier.height(66.dp))
                    BottomCartBar()
                }
            }
        }
    }
}



