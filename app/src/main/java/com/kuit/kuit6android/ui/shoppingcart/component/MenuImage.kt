package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MenuImage(imageId : Int) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = "bbq",
        modifier = Modifier
            .size(50.dp)
            .clip(RoundedCornerShape(10.dp))
    )
}