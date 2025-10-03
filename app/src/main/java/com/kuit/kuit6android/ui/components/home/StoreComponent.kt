package com.kuit.kuit6android.ui.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.kuit.kuit6android.R
import com.kuit.kuit6android.model.ImageResource
import com.kuit.kuit6android.model.Store
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun StoreComponent(store: Store, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Column {
        when (val img = store.img) {
            is ImageResource.Resource -> Image(
                painter = painterResource(img.resId),
                contentScale = ContentScale.Crop,
                contentDescription = store.name,
                modifier = modifier.clickable { onClick() }
            )

            is ImageResource.Url -> AsyncImage(
                model = img.url,
                contentDescription = store.name,
                contentScale = ContentScale.Crop,
                modifier = modifier.clickable { onClick() }
            )
        }
        Row(
            modifier = Modifier
                .width(230.dp)
                .padding(top = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = store.name,
                fontWeight = FontWeight.SemiBold,
                fontFamily = Pretendard,
                fontSize = 14.sp
            )
            Text(
                text = store.time,
                fontFamily = Pretendard,
                fontSize = 12.sp
            )
        }
        Row(
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.lightingstar),
                contentScale = ContentScale.Crop,
                contentDescription = "lighted star",
                modifier = Modifier.size(15.dp)
            )
            Text(
                text = store.star.toString(),
                fontSize = 12.sp,
                fontFamily = Pretendard,
                modifier = Modifier.padding(end = 5.dp)
            )
            Text(
                text = "(${store.commentCount})",
                fontSize = 12.sp,
                fontFamily = Pretendard
            )
        }
    }
}