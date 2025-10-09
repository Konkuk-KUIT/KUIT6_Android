package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

@Composable
fun OrderItemInfo(
    storeName: String,
    menuName: String,
    menuCount: String,
    deliveryInfo: String,
    isFavorite: Boolean,
    imageRes: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        // 1행: 사진, 가게명+화살표, 하트
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            //사진
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = "음식 이미지",
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(10.dp))

            //가게명
            Text(
                text = storeName,
                style = CoupangEatsTheme.typography.head_03_B_16
            )

            Spacer(modifier = Modifier.width(5.dp))
            //화살표
            Icon(
                painter = painterResource(id = R.drawable.rightarrow),
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                tint = CoupangEatsTheme.colors.black
            )

            Spacer(modifier = Modifier.weight(1f))
            //하트
            Icon(
                imageVector = if (isFavorite) Icons.Default.Favorite
                else Icons.Default.FavoriteBorder,
                contentDescription = "찜하기",
                modifier = Modifier.size(24.dp),
                tint = if (isFavorite) Color.Red
                else CoupangEatsTheme.colors.gray400
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row {
            // 메뉴명
            Text(
                text = menuName,
                style = CoupangEatsTheme.typography.body_01_M_14,
                color = CoupangEatsTheme.colors.black,
                fontWeight = CoupangEatsTheme.typography.body_01_M_14.fontWeight
            )
            Spacer(modifier = Modifier.width(4.dp))
            // 메뉴 개수
            Text(
                text = menuCount,
                style = CoupangEatsTheme.typography.body_01_M_14,
                color = CoupangEatsTheme.colors.gray400
            )
        }

        // 3행: 배달정보
        Text(
            text = "\u2022 $deliveryInfo",
            style = CoupangEatsTheme.typography.body_02_SB_12,
            color = CoupangEatsTheme.colors.gray500,
            fontWeight = CoupangEatsTheme.typography.body_02_SB_12.fontWeight
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OrderItemInfoPreview() {
    KUIT6_ANDROIDTheme {
        OrderItemInfo(
            storeName = "처갓집양념치킨 중곡역점",
            menuName = "슈프림양념치킨",
            menuCount = "1개",
            deliveryInfo = "뼈, 토핑떡사리",
            isFavorite = false,
            imageRes = R.drawable.wifehousechicken
        )
    }
}