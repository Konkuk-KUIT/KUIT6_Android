package com.kuit.kuit6android.ui.components.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.kuit.kuit6android.R
import com.kuit.kuit6android.model.ImageResource
import com.kuit.kuit6android.model.factory.StoreFactory
import com.kuit.kuit6android.ui.theme.Pretendard

@Composable
fun StoreLazyRowComponent(modifier: Modifier = Modifier) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(21.dp), modifier = modifier) {
        items(StoreFactory.getStoreList()) { store ->
            Column {
                when (val img = store.img) {
                    is ImageResource.Resource -> Image(
                        painter = painterResource(img.resId),
                        contentScale = ContentScale.Crop,
                        contentDescription = store.name,
                        modifier = Modifier.size(width = 230.dp, height = 129.dp)
                    )

                    is ImageResource.Url -> AsyncImage(
                        model = img.url,
                        contentDescription = store.name,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(width = 230.dp, height = 129.dp)
                    )
                }
                Row(
                    modifier = Modifier.width(230.dp).padding(top = 5.dp),
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
                Row (
                    modifier = Modifier.padding(top = 10.dp)
                ){
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
    }
}

@Preview
@Composable
private fun StoreLazyRowComponentPreview() {
    StoreLazyRowComponent()
}