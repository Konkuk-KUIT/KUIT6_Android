package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDateFormat
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedButton
import com.kuit.kuit6android.ui.orderhistory.data.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.data.MenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun HistoryRestaurantItem(modifier: Modifier = Modifier, restaurantData: HistoryRestaurantData) {
    var isFavorite by rememberSaveable { mutableStateOf(restaurantData.isFavorite) }

    Column(
        modifier = modifier
            .width(320.dp)
            .height(354.dp)
            .fillMaxWidth()
            .border(width=1.dp, color= CoupangEatsTheme.colors.gray300, shape= RoundedCornerShape(10.dp))
            .padding(start=20.dp, top= 20.dp, end=20.dp, bottom= 18.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = restaurantData.date,
                style = CoupangEatsTheme.typography.body_01_M_14,
                color = CoupangEatsTheme.colors.gray500
            )
            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(CoupangEatsTheme.colors.gray200)
                    .padding(vertical = 8.dp, horizontal = 6.77.dp)
            ) {
                Text(
                    "주문상세",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.black
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(top = 23.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = restaurantData.imageResId),
                "가게 이미지",
                modifier = Modifier
                    .size(50.dp)
            )
            Spacer(modifier = Modifier.width(10.25.dp))
            Text(
                text = restaurantData.restaurantName,       // 예: "신전떡볶이 중곡역점"
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )

            Spacer(modifier = Modifier.width(5.14.dp))
            Icon(
                painter = painterResource(R.drawable.arrow_big),
                "화살표",
                modifier = Modifier
                    .size(14.11.dp)
            )
            Spacer(modifier = Modifier.width(38.66.dp))
            Icon(
                painter = painterResource(
                    id = if (isFavorite) R.drawable.icon_filled_heart else R.drawable.icon_blacked_like
                ),
                contentDescription = "heart",
                modifier = modifier.size(30.dp)
                    .clickable { isFavorite = !isFavorite },
                tint = Color.Unspecified
            )
        }

        Spacer(Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            restaurantData.menu.forEach { m ->
                Text(
                    text = "${m.menuName}",          // 예: "1인세트 x1"
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    color = CoupangEatsTheme.colors.black
                )
                Text(
                    text = "${m.menuCount}개",          // 예: "1인세트 x1"
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    color = CoupangEatsTheme.colors.gray400
                )
            }
        }

        Spacer(Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            restaurantData.menu.forEach { m ->
                Text(
                    text = "- ${m.menuDetail}",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.gray500
                )
            }
        }

        Spacer(Modifier.height(17.dp))
        HorizontalDivider(
            thickness = 1.dp,
            color = Color.LightGray
        )

        Spacer(Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "결제 금액",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
            Text(
                text = "${restaurantData.orderPrice.toDecimalFormat()}원",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.gray400
            )
            Text(
                text = "${restaurantData.salePrice.toDecimalFormat()}원",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
        }

        Spacer(modifier= modifier.height(20.dp))
        if (restaurantData.salePrice < restaurantData.orderPrice) {
            Row(
                modifier= modifier
                    .align(Alignment.End)
                    .height(28.dp)
                    .width(174.73.dp)
                    .clip(shape= RoundedCornerShape(20.dp))
                    .background(color= CoupangEatsTheme.colors.laverder)
                    .padding(start=14.22.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.vector),
                    contentDescription = "번개모양",
                    modifier = modifier
                        .width(10.16.dp)
                        .height(10.dp)
                )
                Spacer(modifier= modifier.width(4.06.dp))
                Text(
                    text = "${
                        (restaurantData.orderPrice - restaurantData.salePrice).coerceAtLeast(0)
                            .toDecimalFormat()
                    }원 할인이 적용됐어요",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.purple
                )
            }
        }

        // 8) 하단 정보 컬럼 (필요한 추가 라인들 넣기)
        Spacer(Modifier.height(8.dp))
        if (isFavorite) {
            Spacer(Modifier.height(8.dp))
            Row(
            ){
                SameMenuCart()
                Spacer(modifier=modifier.width(18.dp))
                CoupangEatsRoundedButton()
            }
        }
        else {
            Spacer(Modifier.height(8.dp))
            Column(
                modifier = modifier
                    .width(279.37.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .border(1.dp, color = CoupangEatsTheme.colors.gray300),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "같은 메뉴 담기",
                    style = CoupangEatsTheme.typography.head_02_B_20,
                    color = CoupangEatsTheme.colors.gray300
                )

                Text(
                    "오픈 전 담기",
                    style = CoupangEatsTheme.typography.head_05_B_10,
                    color = CoupangEatsTheme.colors.gray300
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HistoryRestaurantItemPreview() {
    HistoryRestaurantItem(
        restaurantData = HistoryRestaurantData(
            date = "10-4-토".toDateFormat(),
            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = true,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData("1인세트", 1, "떡볶이 1인분, 모둠튀김, 쥬시쿨")
            ),
            isClosed = true,
            imageResId = R.drawable.historyimg1,
            )
    )
}
