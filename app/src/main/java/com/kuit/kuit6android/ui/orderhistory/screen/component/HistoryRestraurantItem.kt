package com.kuit.kuit6android.ui.orderhistory.screen.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.orderhistory.screen.HistoryRestraurantData
import com.kuit.kuit6android.ui.orderhistory.screen.MenuListData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.toDateFormat

@Composable
fun HistoryRestraurantItem(modifier: Modifier = Modifier, restraurantData: HistoryRestraurantData) {
    var isFavorite by rememberSaveable { mutableStateOf(restraurantData.isFavorite) }
    Column(
        modifier = Modifier
            .border(
                1.dp,
                color = CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = restraurantData.date.toDateFormat(),
                style = CoupangEatsTheme.typography.body_01_M_14,
                color = CoupangEatsTheme.colors.gray500
            )
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = CoupangEatsTheme.colors.gray200
                ),
                modifier = Modifier.height(28.dp)
            ) {
                Text(
                    text = "주문 상세",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.black
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 15.dp)
        ) {
            Image(
                painter = painterResource(restraurantData.RestrauntImg),
                contentDescription = "restraurant",
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(50.dp)
            )
            Text(
                restraurantData.restraurantName,
                modifier = modifier.padding(start = 10.dp)
            )
            Icon(
                painter = painterResource(R.drawable.outline_keyboard_arrow_right_24),
                contentDescription = "arrow",
                modifier = Modifier.padding(start = 5.dp)
            )
            Spacer(modifier.weight(1f))
            Icon(
                painter = painterResource(if (isFavorite) R.drawable.like else R.drawable.outline_favorite_24),
                contentDescription = "favorite",
                modifier = modifier
                    .size(30.dp)
                    .clickable { if (restraurantData.isClosed) isFavorite = !isFavorite },
                tint = Color.Unspecified
            )
        }
        restraurantData.menu.forEach {
            Column {
                Row {
                    Text(
                        text = it.menuName,
                        style = CoupangEatsTheme.typography.body_01_M_14,
                    )
                    Text(
                        text = "${it.menuCount}개",
                        style = CoupangEatsTheme.typography.body_01_M_14,
                        color = CoupangEatsTheme.colors.gray400,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
                Text(
                    text = "• ${it.menuDetail}",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.gray500
                )
            }
        }

        HorizontalDivider(
            thickness = 1.dp,
            modifier = Modifier.padding(top = 20.dp)
        )

        Row(
            modifier.padding(top = 20.dp)
        ) {
            Text(
                text = "결제금액",
                style = CoupangEatsTheme.typography.head_03_B_16
            )
            Spacer(modifier.weight(1f))
            Text(
                text = "${restraurantData.orderPrice}원",
                style = CoupangEatsTheme.typography.head_04_SB_14.copy(
                    textDecoration = TextDecoration.LineThrough
                ),
                color = CoupangEatsTheme.colors.gray400
            )
            Text(
                text = "${restraurantData.salePrice}원",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        Row(
            modifier = modifier
                .padding(top = 20.dp)
                .clip(RoundedCornerShape(20.dp))
                .background(CoupangEatsTheme.colors.lavender)
                .align(Alignment.End),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Icon(
                painter = painterResource(R.drawable.lighted),
                contentDescription = "lighted",
                modifier = Modifier.size(10.dp)
            )
            Text(
                text = "${restraurantData.orderPrice - restraurantData.salePrice}원 할인이 적용됐어요",
                modifier = Modifier.padding(start = 5.dp),
                style = CoupangEatsTheme.typography.body_02_SB_12,
                color = CoupangEatsTheme.colors.violet
            )
        }
        if (restraurantData.isClosed) {
            Box() {
                Text(
                    text = "같은 메뉴 담기"
                )
                Text(
                    text = "오픈 전 가게에요"
                )
            }
        } else {
            Row(
                modifier = Modifier.fillMaxWidth().padding(top = 34.dp, bottom = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Box(
                    modifier = Modifier
                        .width(130.dp)
                        .height(40.dp)
                        .border(
                            width = 1.dp,
                            shape = RoundedCornerShape(10.dp),
                            color = CoupangEatsTheme.colors.gray300,
                        )
                ) {
                    Text(
                        text = "같은 메뉴 담기",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                Box(
                    modifier = Modifier
                        .width(130.dp)
                        .height(40.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .background(CoupangEatsTheme.colors.mint)
                ) {
                    Text(
                        text = "바로 주문",
                        style = CoupangEatsTheme.typography.head_03_B_16,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun HistoryRestraurantItemPreview() {
    HistoryRestraurantItem(
        restraurantData = HistoryRestraurantData(
            date = "10-4-토",
            restraurantName = "홍콩반점",
            isFavorite = false,
            orderPrice = 10000,
            salePrice = 5000,
            menu = listOf(
                MenuListData(
                    menuName = "1인 세트",
                    menuCount = 1,
                    menuDetail = "떡볶이 1인분"
                )
            ),
            isClosed = false,
            RestrauntImg = R.drawable.storeexample
        )
    )
}