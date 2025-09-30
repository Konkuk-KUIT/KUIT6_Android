package com.kuit.kuit6android.ui.detail.screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.kuit.kuit6android.R
import com.kuit.kuit6android.model.ImageResource
import com.kuit.kuit6android.model.Store
import com.kuit.kuit6android.model.factory.StoreFactory
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun DetailPage(store: Store){
    Log.d("DetailPage", store.toString())
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.outline_keyboard_backspace_24),
                contentDescription = "back",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(start = 27.dp).size(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.outline_favorite_24),
                contentDescription = "favorite",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(end = 27.dp).size(24.dp)
            )
        }
        when (val img = store.img) {
            is ImageResource.Resource -> Image(
                painter = painterResource(img.resId),
                contentScale = ContentScale.Crop,
                contentDescription = store.name,
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).height(149.dp)
            )

            is ImageResource.Url -> AsyncImage(
                model = img.url,
                contentDescription = store.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp).height(149.dp)
            )
        }

        Text(
            text = store.name,
            fontSize = 30.sp,
            fontFamily = Pretendard,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 20.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.lightingstar),
                contentScale = ContentScale.Crop,
                contentDescription = "lighted star",
                modifier = Modifier.size(width = 20.dp, height = 15.dp)
            )
            Text(
                text = "${store.star} (${store.commentCount})",
                fontSize = 12.sp,
                fontFamily = Pretendard,
                color = Color(0xFF575252),
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailPagePreview(){
    DetailPage(store = StoreFactory.getStoreList()[0])
}