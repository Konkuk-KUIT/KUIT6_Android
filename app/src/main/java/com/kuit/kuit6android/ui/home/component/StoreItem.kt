package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun StoreItem(modifier: Modifier = Modifier, width: Int, height: Int, storeData: StoreData) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(

        ) {
            // 음식점 이미지
            Image(
                painter = painterResource(storeData.imageId),
                contentDescription = storeData.name,
                modifier = modifier
                    .clip(RoundedCornerShape(8.dp))
                    .size(height = height.dp, width = width.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(5.dp))

            // 음식점 이름, 배달 시간 담은 Row
            Row(
                // 너비 정해주고 -> Arrangement.SpaceBetween 하면 각각 끝에 배치 가능
                modifier = modifier.width(width.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = storeData.name,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Text(
                    text = "${storeData.deliveryTime}분",
                    fontSize = 12.sp,
                    color = Color.Black
                )
            }

            Spacer(Modifier.height(10.dp))
            // 별점, 리뷰 수를 담은 Row
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.img_star),
                    contentDescription = "별점",
                    modifier = modifier
                        .size(15.dp)
                )
                Text(
                    text = "${storeData.score}" +  " (" + storeData.reviewCount + ")",
                    fontSize = 12.sp,
                    color = Color(0xFF575252)
                )
            }

        }
    }
}