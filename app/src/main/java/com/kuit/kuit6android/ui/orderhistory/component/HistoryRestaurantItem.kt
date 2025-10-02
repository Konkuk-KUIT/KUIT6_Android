package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
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
fun HistoryRestaurantItem(
    modifier: Modifier = Modifier,
    restaurantData: HistoryRestaurantData
) {
    val restaurantList = listOf(
        HistoryRestaurantData(
            date = "10-4-토",
            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = false,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData(
                    "1인세트", 1, "떡볶이 1인분, 모듬튀김, 쥬시쿨"
                )
            ),
            isOpened = false,
            imageId = R.drawable.img_sinjeon
        ),
        HistoryRestaurantData(
            date = "10-3-금",
            restaurantName = "처갓집양념치킨 중곡역점",
            isFavorite = false,
            orderPrice = 24000,
            salePrice = 20000,
            menu = listOf(
                MenuData(
                    "슈프림양념치킨", 1, "뼈, 토핑떡사리"
                )
            ),
            isOpened = false,
            imageId = R.drawable.img_cheogajip
        ),
        HistoryRestaurantData(
            date = "9-27-토",
            restaurantName = "동대문엽기떡볶이 건대점",
            isFavorite = true,
            orderPrice = 20700,
            salePrice = 18500,
            menu = listOf(
                MenuData(
                    "실속세트", 1, "반반, [엽기] 덜매운맛"
                )
            ),
            isOpened = true,
            imageId = R.drawable.img_yeoptteok
        ),
        HistoryRestaurantData(
            date = "9-22-수",
            restaurantName = "피자나라치킨공주 건대점",
            isFavorite = false,
            orderPrice = 18000,
            salePrice = 16500,
            menu = listOf(
                MenuData(
                    "2인세트", 1, "콤비네이션, 콜라"
                )
            ),
            isOpened = false,
            imageId = R.drawable.img_pizza
        )
    )

    var isFavorite by rememberSaveable { mutableStateOf(restaurantData.isFavorite) }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .border(
                1.dp,
                color = CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(top = 13.dp, bottom = 20.dp)
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = restaurantData.date.toDateFormat(),
                style = CoupangEatsTheme.typography.body_01_M_14,
                color = CoupangEatsTheme.colors.gray500
            )
            Button(
                shape = RoundedCornerShape(20.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = CoupangEatsTheme.colors.gray200)
            ) {
                Text(
                    text = "주문상세",
                    style = CoupangEatsTheme.typography.body_02_SB_12,
                    color = CoupangEatsTheme.colors.black
                )
            }
        }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 23.dp, bottom = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                modifier = modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(restaurantData.imageId),
                    contentDescription = "restaurant image",
                    modifier = modifier
                        .padding(end = 10.dp)
                        .size(50.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = restaurantData.restaurantName,
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    color = CoupangEatsTheme.colors.black,
                    modifier = modifier.padding(end = 5.dp)
                )
                Icon(
                    painter = painterResource(R.drawable.ic_arrow_right),
                    contentDescription = "arrow right",
                    tint = CoupangEatsTheme.colors.black,
                    modifier = modifier.size(14.dp)
                )
            }
            Icon(
                painter = painterResource(if (isFavorite) R.drawable.ic_filled_heart else R.drawable.ic_blank_heart),
                contentDescription = "heart icon",
                modifier = modifier
                    .size(30.dp)
                    .clickable { isFavorite = !isFavorite },
                tint = Color.Unspecified
            )
        }

        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = modifier.padding(bottom = 5.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = restaurantData.menu.firstOrNull()?.menuName ?: "",
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    color = CoupangEatsTheme.colors.black
                )
                Text(
                    text = "${restaurantData.menu.firstOrNull()?.menuCount ?: ""}개",
                    style = CoupangEatsTheme.typography.body_01_M_14,
                    color = CoupangEatsTheme.colors.gray400
                )
            }
            Text(
                text = "⦁  ${restaurantData.menu.firstOrNull()?.menuDetail ?: ""}",
                style = CoupangEatsTheme.typography.body_02_SB_12,
                color = CoupangEatsTheme.colors.gray500,
                modifier = modifier.padding(start = 5.dp)
            )
        }

        HorizontalDivider(thickness = 1.dp, color = CoupangEatsTheme.colors.gray300)

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "결제금액",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = restaurantData.orderPrice.toDecimalFormat() + "원",
                    style = CoupangEatsTheme.typography.head_04_SB_14,
                    color = CoupangEatsTheme.colors.gray400,
                    textDecoration = TextDecoration.LineThrough
                )
                Text(
                    text = restaurantData.salePrice.toDecimalFormat() + "원",
                    style = CoupangEatsTheme.typography.head_03_B_16,
                    color = CoupangEatsTheme.colors.black
                )
            }
        }

        SaleApplyItem(
            Modifier.align(Alignment.End),
            (restaurantData.orderPrice - restaurantData.salePrice).toDecimalFormat()
        )

        if (restaurantData.isOpened) {
            Row(
                modifier = modifier.padding(top = 34.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CoupangEatsRoundedButton(Modifier, "바로 주문", CoupangEatsTheme.colors.mint, null)
                CoupangEatsRoundedButton(
                    Modifier,
                    "같은 메뉴 담기",
                    CoupangEatsTheme.colors.white,
                    CoupangEatsTheme.colors.gray300
                )
            }
        } else {
            Button(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                shape = RoundedCornerShape(10.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = CoupangEatsTheme.colors.white
                ),
                contentPadding = PaddingValues(vertical = 12.dp),
                border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(5.dp),
                ) {
                    Text(
                        text = "같은 메뉴 담기",
                        style = CoupangEatsTheme.typography.head_02_B_20,
                        color = CoupangEatsTheme.colors.gray300
                    )
                    Text(
                        text = "오픈 전 가게예요",
                        style = CoupangEatsTheme.typography.head_05_B_10,
                        color = CoupangEatsTheme.colors.gray300
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun HistoryRestaurantItemPreview() {
    HistoryRestaurantItem(
        Modifier,
        restaurantData = HistoryRestaurantData(
            date = "10-4-토",
            restaurantName = "신전떡볶이 중곡역점",
            isFavorite = true,
            orderPrice = 10000,
            salePrice = 8500,
            menu = listOf(
                MenuData(
                    "1인세트", 1, "떡볶이 1인분, 모듬튀김, 쥬시쿨"
                )
            ),
            isOpened = false,
            imageId = R.drawable.img_sinjeon
        )
    )
}