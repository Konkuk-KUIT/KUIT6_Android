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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

@Composable
fun RecentMenu(modifier: Modifier = Modifier) {
    val storeList = listOf(
        StoreData(
            imageId = R.drawable.img_food,
            name = "아워떡볶이",
            deliveryTime = "30",
            score = "4.9",
            reviewCount = "3,849"
        ),
        StoreData(
            imageId = R.drawable.img_soup,
            name = "값찌개",
            deliveryTime = "41",
            score = "4.1",
            reviewCount = "1,544"
        ),
        StoreData(
            imageId = R.drawable.img_bhc,
            name = "BHC 건대점",
            deliveryTime = "50",
            score = "4.3",
            reviewCount = "4,549"
        )
    )

    Text(
        text = "최근 본 맛집",
        fontSize = 17.sp,
        fontWeight = FontWeight.Bold
    )
    Spacer(Modifier.height(25.dp))


    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(21.dp)
    ) {
        items(storeList) { store ->
            StoreItem(storeData = store)
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun RecentMenuPreview() {
    RecentMenu()
}