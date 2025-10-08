package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.RangeSliderState.Companion.Saver
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateMap
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedButton
import com.kuit.kuit6android.ui.orderhistory.data.CartMenuData
import com.kuit.kuit6android.ui.orderhistory.data.CartRecommendMenuData
import com.kuit.kuit6android.ui.orderhistory.data.OptionData
import com.kuit.kuit6android.ui.orderhistory.data.ReceiveMethod
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun CartPage(
    modifier: Modifier = Modifier
) {
    val menuList = listOf(
        CartMenuData(
            menuName = "BBQ 소스",
            orderPrice = 500,
            option = listOf(
                OptionData(
                    option = "소스 선택",
                    optionDetail = "BBQ양념치킨소스(25g)"
                )
            ),
            imageId = R.drawable.img_bbq_source
        ),
        CartMenuData(
            menuName = "황금올리브치킨",
            orderPrice = 24000,
            option = listOf(
                OptionData(
                    option = "음료 추가선택",
                    optionDetail = "서비스 음료 미제공"
                )
            ),
            imageId = R.drawable.img_bbq_golden
        ),
        CartMenuData(
            menuName = "[황.양.반] 황올 반+양념 반",
            orderPrice = 24000,
            option = listOf(
                OptionData(
                    option = "음료 추가선택",
                    optionDetail = "코카콜라"
                )
            ),
            imageId = R.drawable.img_bbq_half
        )
    )
    val recommendMenuList = listOf(
        CartRecommendMenuData(
            menuName = "황금올리브치킨 핫크리스피",
            price = 24500,
            imageId = R.drawable.img_bbq_golden
        ),
        CartRecommendMenuData(
            menuName = "제로콜라",
            price = 2000,
            imageId = R.drawable.img_cock
        ),
        CartRecommendMenuData(
            menuName = "BBQ 떡볶이",
            price = 8000,
            imageId = R.drawable.img_bbq_tteockbokki
        ),
        CartRecommendMenuData(
            menuName = "BBQ볼(5개)",
            price = 5000,
            imageId = R.drawable.img_bbq_ball
        )
    )

    var counts by rememberSaveable(menuList.size) {
        mutableStateOf(List(menuList.size) { 1 })
    }

    val totalPrice by remember(counts) {
        derivedStateOf {
            menuList.indices.sumOf { i -> counts[i] * menuList[i].orderPrice }
        }
    }

    Scaffold(
        containerColor = Color.White,
        modifier = Modifier.fillMaxSize().padding(top = 30.dp ,bottom = 45.dp),
        topBar = {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_back_arrow),
                    contentDescription = "back arrow",
                    tint = Color(0xFF666668),
                    modifier = modifier.size(24.dp)
                )
                Text(
                    text = "장바구니",
                    style = CoupangEatsTheme.typography.head_02_B_20,
                    color = CoupangEatsTheme.colors.black
                )
                Icon(
                    painter = painterResource(R.drawable.ic_person_add),
                    contentDescription = "person add",
                    tint = CoupangEatsTheme.colors.black,
                    modifier = modifier.size(24.dp)
                )
            }
        },
        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(CoupangEatsTheme.colors.gray100)
                    .padding(vertical = 14.dp, horizontal = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = totalPrice.toDecimalFormat() + "원",
                        style = CoupangEatsTheme.typography.head_02_B_20,
                        color = CoupangEatsTheme.colors.black
                    )
                    Spacer(Modifier.padding(bottom = 5.dp))
                    Text(
                        text = "주문 가능",
                        style = CoupangEatsTheme.typography.body_01_M_14,
                        color = CoupangEatsTheme.colors.black
                    )
                }
                CoupangEatsRoundedButton(
                    modifier = Modifier,
                    "바로 주문",
                    CoupangEatsTheme.colors.mint,
                    null
                )
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .padding(horizontal = 20.dp),
        ) {
            item {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 23.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_bbq),
                        contentDescription = "bbq",
                        modifier = modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(5.dp)),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "BBQ 건대점",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        color = CoupangEatsTheme.colors.black,
                        modifier = modifier.padding(start = 10.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.ic_arrow_right),
                        contentDescription = "arrow right",
                        modifier = modifier
                            .padding(start = 7.dp)
                            .size(16.dp)
                    )
                }
            }

            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .border(1.dp, CoupangEatsTheme.colors.gray300, RoundedCornerShape(20.dp))
                        .padding(top = 20.dp)
                ) {
                    menuList.forEachIndexed { index, menu ->
                        val key = menu.menuName

                        key(key){
                            CartMenuItem(
                                menuData = menu,
                                count = counts[index],
                                onCountChange = { newCount ->
                                    val next = counts.toMutableList()
                                    next[index] = newCount.coerceAtLeast(0)
                                    counts = next
                                }
                            )
                        }

                        if (index != menuList.lastIndex) {
                            HorizontalDivider(
                                modifier = Modifier
                                    .padding(top = 25.dp)
                                    .padding(horizontal = 20.dp),
                                thickness = 1.dp,
                                color = CoupangEatsTheme.colors.gray300
                            )
                        }
                    }
                    HorizontalDivider(
                        Modifier.padding(top = 25.dp),
                        1.dp,
                        CoupangEatsTheme.colors.gray300
                    )
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_add),
                            contentDescription = "add",
                            tint = CoupangEatsTheme.colors.black,
                            modifier = modifier
                                .size(20.dp)
                                .padding(end = 11.dp),

                            )
                        Text(
                            text = "메뉴 추가",
                            style = CoupangEatsTheme.typography.head_03_B_16,
                            color = CoupangEatsTheme.colors.black
                        )
                    }
                }
            }

            item {
                Spacer(Modifier.padding(top = 20.dp))
                Text(
                    text = "함께 먹으면 좋아요",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    color = CoupangEatsTheme.colors.black,
                    modifier = modifier.padding(bottom = 20.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .border(1.dp, CoupangEatsTheme.colors.gray300, RoundedCornerShape(20.dp))
                ) {
                    recommendMenuList.forEachIndexed { index, menu ->
                        // 각 아이템 패딩 주고 실제 컴포넌트 렌더
                        RecommendMenuItem(recommendMenu = menu)

                        if (index != recommendMenuList.lastIndex) {
                            HorizontalDivider(
                                thickness = 1.dp,
                                color = CoupangEatsTheme.colors.gray300
                            )
                        }
                    }
                }
            }

            item {
                var selected by rememberSaveable { mutableStateOf(ReceiveMethod.DELIVERY) }
                Spacer(Modifier.padding(bottom = 20.dp))
                Text(
                    text = "수령방법을 선택해주세요",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    color = CoupangEatsTheme.colors.black,
                    modifier = modifier.padding(bottom = 10.dp)
                )

                Spacer(Modifier.padding(bottom = 10.dp))
                ReceiveMethodItem(
                    Modifier,
                    isSelected = (selected == ReceiveMethod.DELIVERY),
                    "가게배달", 22, 37,
                    onClick = { selected = ReceiveMethod.DELIVERY })
                Spacer(Modifier.padding(bottom = 10.dp))
                ReceiveMethodItem(
                    Modifier,
                    isSelected = (selected == ReceiveMethod.PICKUP),
                    "픽업", 14, 24,
                    onClick = { selected = ReceiveMethod.PICKUP })
            }

            item {
                Spacer(Modifier.padding(top = 20.dp))
                Text(
                    text = "결제금액을 확인해주세요",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    color = CoupangEatsTheme.colors.black,
                    modifier = modifier.padding(bottom = 10.dp)
                )
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .border(1.dp, CoupangEatsTheme.colors.gray300, RoundedCornerShape(20.dp))
                        .padding(vertical = 20.dp)
                ) {
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "메뉴 금액",
                            style = CoupangEatsTheme.typography.body_02_SB_12,
                            color = CoupangEatsTheme.colors.black
                        )
                        Text(
                            text = totalPrice.toDecimalFormat() + "원",
                            style = CoupangEatsTheme.typography.body_02_SB_12,
                            color = CoupangEatsTheme.colors.black
                        )
                    }
                    Spacer(Modifier.padding(bottom = 10.dp))
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp)
                            .padding(bottom = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "배달팁",
                            style = CoupangEatsTheme.typography.body_02_SB_12,
                            color = CoupangEatsTheme.colors.black
                        )
                        Text(
                            text = "0원",
                            style = CoupangEatsTheme.typography.body_02_SB_12,
                            color = CoupangEatsTheme.colors.black
                        )
                    }
                    HorizontalDivider(
                        Modifier.padding(bottom = 15.dp),
                        1.dp,
                        CoupangEatsTheme.colors.gray300
                    )
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "결제예정금액",
                            style = CoupangEatsTheme.typography.head_04_SB_14,
                            color = CoupangEatsTheme.colors.black
                        )
                        Text(
                            text = totalPrice.toDecimalFormat() + "원",
                            style = CoupangEatsTheme.typography.head_04_SB_14,
                            color = CoupangEatsTheme.colors.black
                        )
                    }
                }
                Spacer(Modifier.padding(bottom = 50.dp))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun CartPagePreview() {
    CartPage()
}