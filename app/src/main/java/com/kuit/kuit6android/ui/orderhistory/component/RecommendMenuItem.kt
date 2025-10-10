package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.orderhistory.data.CartRecommendMenuData
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun RecommendMenuItem(
    modifier: Modifier = Modifier,
    recommendMenu: CartRecommendMenuData
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(recommendMenu.imageId),
            contentDescription = "menu image",
            modifier = modifier
                .clip(RoundedCornerShape(10.dp))
                .size(50.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = modifier.weight(1f).padding(start = 8.dp)
        ) {
            Text(
                text = recommendMenu.menuName,
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black
            )
            Spacer(Modifier.padding(bottom = 5.dp))
            Text(
                text = recommendMenu.price.toDecimalFormat() + "원",
                style = CoupangEatsTheme.typography.body_02_R_12,
                color = CoupangEatsTheme.colors.black
            )
        }
        Column(
            modifier = modifier
                .size(30.dp)
                .clip(RoundedCornerShape(15.dp))
                .border(1.dp, CoupangEatsTheme.colors.gray300, RoundedCornerShape(15.dp)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_add),
                contentDescription = "add",
                modifier = modifier.size(15.dp),
                tint = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecommendMenuItemPreview() {
    RecommendMenuItem(
        Modifier, CartRecommendMenuData(
            menuName = "황금올리브치킨 핫크리스피",
            price = 24500,
            imageId = R.drawable.img_bbq_golden
        )
    )
}