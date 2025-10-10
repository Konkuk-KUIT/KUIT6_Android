package com.kuit.kuit6android.ui.cart.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.kuit.kuit6android.ui.cart.component.CartTopAppBar
import com.kuit.kuit6android.ui.cart.component.GotoOrderRow
import com.kuit.kuit6android.ui.cart.component.PickupMethodCard
import com.kuit.kuit6android.ui.cart.component.RecommendCard
import com.kuit.kuit6android.ui.cart.component.StoreDetailRow
import com.kuit.kuit6android.ui.cart.component.TotalAmountCard
import com.kuit.kuit6android.ui.cart.component.addeditems.AddedItemsCard
import com.kuit.kuit6android.ui.cart.data.CartSampleData
import com.kuit.kuit6android.ui.cart.model.CartItem
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun CartScreen(
    padding: PaddingValues,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    // State Hoisting: rememberSaveable로 화면 회전 시에도 상태 유지
    var cartItems by rememberSaveable {
        mutableStateOf(value = CartSampleData.sampleStore.items)
    }

    val storeName = CartSampleData.sampleStore.name
    val recommendedItems = CartSampleData.recommendedItems

    // 총 금액 계산
    val totalMenuPrice = cartItems.sumOf { it.price * it.quantity }
    val deliveryFee = 0
    val totalAmount = totalMenuPrice + deliveryFee

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(paddingValues = padding)
    ) {
        //장바구니
        CartTopAppBar(
            onBackClick = { navController.popBackStack() },
            onProfileClick = { /* 프로필 클릭 */ }
        )

        LazyColumn(
            modifier = Modifier
                .weight(weight = 1f)
                .fillMaxWidth(),
            contentPadding = PaddingValues(vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(space = 8.dp)
        ) {
            // Store Detail Row
            item {
                StoreDetailRow(
                    storeName = storeName,
                    onStoreClick = { /* 가게 상세 */ }
                )
            }

            // Added Items Card
            item {
                AddedItemsCard(
                    items = cartItems,
                    onQuantityChange = { itemId, newQuantity ->
                        cartItems = cartItems.map { item ->
                            if (item.id == itemId) {
                                item.copy(quantity = newQuantity)
                            } else {
                                item
                            }
                        }
                    },
                    onOptionsClick = { /* 옵션 변경 */ },
                    onMenuAddClick = { /* 메뉴 추가 */ }
                )
            }

            // Recommend Card
            item {
                RecommendCard(
                    items = recommendedItems,
                    onAddClick = { recommendedItem ->
                        // 추천 메뉴를 장바구니에 추가
                        val newItem = CartItem(
                            id = cartItems.maxOfOrNull { it.id }?.plus(1) ?: 1,
                            name = recommendedItem.name,
                            price = recommendedItem.price,
                            quantity = 1
                        )
                        cartItems = cartItems + newItem
                    }
                )
            }

            // Pickup Method Card
            item {
                PickupMethodCard(
                    method = "가게배달",
                    estimatedTime = "22~37분 후 도착"
                )
            }

            // Total Amount Card
            item {
                TotalAmountCard(
                    menuPrice = totalMenuPrice,
                    deliveryFee = deliveryFee,
                    totalAmount = totalAmount
                )
            }
        }

        // Goto Order Row (Bottom Button)
        GotoOrderRow(
            totalAmount = totalAmount,
            onOrderClick = { /* 주문하기 */ }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CartScreenPreview() {
    KUIT6_ANDROIDTheme {
        CartScreen(
            padding = PaddingValues(0.dp),
            navController = rememberNavController()
        )
    }
}