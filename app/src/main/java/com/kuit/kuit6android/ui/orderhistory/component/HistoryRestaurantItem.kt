package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDateFormat
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.orderhistory.HistoryRestaurantData
import com.kuit.kuit6android.ui.orderhistory.MenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun HistoryRestaurantItem(modifier: Modifier = Modifier,restaurantData: HistoryRestaurantData) {
    var isFavorite by rememberSaveable { mutableStateOf(restaurantData.isFavorite) }

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
                text = restaurantData.date.toDateFormat(),
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
        Row {

        }
    }

    Icon(painter = painterResource(id = if(isFavorite) R.drawable.fill_like else R.drawable.empty_like), contentDescription = "heart icon",modifier = modifier.size(30.dp).clickable{isFavorite = !isFavorite}, tint = Color.Unspecified)
    println(restaurantData.orderPrice.toDecimalFormat())
    println(restaurantData.date.toDateFormat())
}

@Preview
@Composable
private fun HistoryRestaurantItemPreview() {
    HistoryRestaurantItem(
        restaurantData = HistoryRestaurantData(
            date = "10-4-토",
            isFavorite = true,
            restaurantName = "신전떡볶이 중곡역점",
            orderPrice = 10000,
            salePrice = 2000,
            menu = listOf(
                MenuData("1인세트",1,"떡볶이 1인분, 모듬튀김, 쥬시쿨")
            ),
            isClosed = true,
        )
    )
}