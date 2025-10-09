package com.kuit.kuit6android.ui.orderhistory.component

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
import androidx.compose.material3.Divider
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
import com.kuit.kuit6android.extension.toDateFormat
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedButton
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedImage
import com.kuit.kuit6android.ui.orderhistory.data.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.data.MenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun HistoryRestaurantItem(modifier: Modifier = Modifier, restaurantData: HistoryRestaurantData) {
    var isFavorite by rememberSaveable { mutableStateOf(restaurantData.isFavorite) }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .border(
                width = 1.dp,
                color = CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(20.dp)
            )
            .background(color = CoupangEatsTheme.colors.white)
            .padding(horizontal = 20.dp)
            .padding(vertical = 13.dp),
    ) {
        Row( // 날짜, 주문 상세
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = restaurantData.date.toDateFormat(),
                color = CoupangEatsTheme.colors.gray500,
                style = CoupangEatsTheme.typography.body_01_M_14
            ) // 10월 4일 (토)
            Box(
                modifier = Modifier
                    .background(
                        color = CoupangEatsTheme.colors.gray200,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .clip(shape = RoundedCornerShape(20.dp))
                    .padding(vertical = 8.dp)
                    .padding(horizontal = 6.77.dp),
            ) {
                Text(
                    text = "주문상세",
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.body_02_SB_12
                )
            }
        }

        Row(
            modifier = Modifier.padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CoupangEatsRoundedImage(
                imgId = restaurantData.imageId,
                menuName = restaurantData.restaurantName,
                borderYN = false
            )
            Text(
                text = restaurantData.restaurantName,
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.head_03_B_16,
                modifier = Modifier.padding(
                    start = 10.dp, end = 5.39.dp
                )
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_right),
                contentDescription = "ic_right",
                tint = CoupangEatsTheme.colors.black,
                modifier = Modifier.size(14.11.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = if (isFavorite) R.drawable.ic_filled_like else R.drawable.ic_blank_like),
                contentDescription = "heart icon",
                modifier = Modifier
                    .size(30.dp)
                    .clickable { isFavorite = !isFavorite }
                    .padding(end = 1.dp),
                tint = Color.Unspecified
            )
        }

        restaurantData.menu.forEach { menu ->
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(
                    text = menu.menuName,
                    color = CoupangEatsTheme.colors.black,
                    style = CoupangEatsTheme.typography.body_01_M_14
                )
                Text(
                    text = "${menu.menuCount}개",
                    color = CoupangEatsTheme.colors.gray400,
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    modifier = modifier.padding(start = 8.13.dp)
                )
            }
            Text(
                text = " · ${menu.menuDetail}",
                color = CoupangEatsTheme.colors.gray500,
                style = CoupangEatsTheme.typography.body_02_SB_12
            )
            Spacer(modifier = Modifier.height(15.dp))
        }

        Divider(
            color = CoupangEatsTheme.colors.gray300,
            thickness = 1.dp,
            modifier = modifier.padding(top = 5.dp)
        )

        Row(
            modifier = Modifier.padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "결제금액",
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.head_03_B_16,
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = restaurantData.orderPrice.toDecimalFormat() + "원",
                style = CoupangEatsTheme.typography.head_04_SB_14.copy(
                    color = CoupangEatsTheme.colors.gray400,
                    textDecoration = TextDecoration.LineThrough // 취소선
                )
            )
            Text(
                text = restaurantData.salePrice.toDecimalFormat() + "원",
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.head_03_B_16,
                modifier = Modifier.padding(start = 7.dp, end = 10.dp)
            )
        }

        Row(
            modifier = Modifier
                .align(Alignment.End)
                .background(
                    color = CoupangEatsTheme.colors.lavender,
                    shape = RoundedCornerShape(20.dp)
                )
                .clip(shape = RoundedCornerShape(20.dp))
                .padding(vertical = 8.dp)
                .padding(horizontal = 13.21.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_lightning),
                contentDescription = "lightening icon",
                tint = CoupangEatsTheme.colors.purple,
                modifier = Modifier
                    .size(10.dp)
                    .padding(start = 1.dp)
            )
            Spacer(modifier = Modifier.padding(end = 4.dp))
            Text(
                text = "${(restaurantData.orderPrice - restaurantData.salePrice).toDecimalFormat()}원 할인이 적용됐어요",
                color = CoupangEatsTheme.colors.purple,
                style = CoupangEatsTheme.typography.body_02_SB_12,
            )
        }
        if(restaurantData.isOpened){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 34.dp),
                horizontalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                CoupangEatsRoundedButton(
                    modifier = Modifier.weight(1f),
                    isOpened = restaurantData.isOpened,
                    backColor = CoupangEatsTheme.colors.white
                )
                CoupangEatsRoundedButton(
                    modifier = Modifier.weight(1f),
                    isOpened = restaurantData.isOpened,
                    backColor = CoupangEatsTheme.colors.mint
                )
            }
        } else {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                CoupangEatsRoundedButton(
                    modifier = Modifier.fillMaxWidth(),
                    isOpened = restaurantData.isOpened,
                    backColor = CoupangEatsTheme.colors.white
                )
            }}
    }

}

@Preview
@Composable
private fun HistoryRestaurantItemPreview() {
    HistoryRestaurantItem(
        modifier = Modifier.width(320.dp),
        restaurantData = HistoryRestaurantData(
            date = "10-4-토",
            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = true,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData("1인세트", 1, "떡볶이 1인분, 모듬튀김, 쥬시쿨", imageId = R.drawable.img_opoke)
            ),
            isOpened = true,
            imageId = R.drawable.img_opoke
        )
    )
}