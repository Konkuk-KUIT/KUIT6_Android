package com.kuit.kuit6android.ui.favorite.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.favorite.data.StoreData

@Composable
fun StoreItem(store: StoreData, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .width(306.dp)
            .clickable { onClick() }

    ) {
        Image(
        painter = painterResource(id = store.imageResId),
        contentDescription = "${store.name} 이미지",
        modifier = Modifier
            .fillMaxWidth()
            .height(129.dp)
            .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
    )
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 27.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = store.name,
                fontSize= 14.sp,
                fontWeight = Bold)
            Text(text = "${store.delitime}분",
                fontSize= 12.sp)
        }
        Spacer(modifier = Modifier.height(9.dp))
       Row(
           modifier = Modifier
               .fillMaxWidth()
               .padding(horizontal = 27.dp),
           verticalAlignment = Alignment.CenterVertically
       ){
           Image(
            painter=painterResource(R.drawable.icon_star),
               contentDescription = "별점 이미지",
               modifier = Modifier
                   .width(20.dp)
                   .height(15.dp)
           )
           Text("4.9(1264)",
               fontSize=12.sp
           )
       }
    }
}
