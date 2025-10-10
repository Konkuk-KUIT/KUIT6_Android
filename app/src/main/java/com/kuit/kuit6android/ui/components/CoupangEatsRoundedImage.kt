package com.kuit.kuit6android.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun CoupangEatsRoundedImage(
    modifier: Modifier = Modifier,
    imgId: Int,
    menuName: String = "menu image",
    borderYN: Boolean
) {
    val baseModifier = modifier
        .size(50.dp)
        .clip(RoundedCornerShape(10.dp))

    val finalModifier = if (borderYN) {
        baseModifier.border(
            width = 1.dp,
            color = CoupangEatsTheme.colors.gray200,
            shape = RoundedCornerShape(10.dp)
        )
    } else {
        baseModifier
    }

    Image(
        painter = painterResource(id = imgId),
        contentDescription = menuName,
        modifier = finalModifier,
        contentScale = ContentScale.Crop,
    )
}

@Preview
@Composable
private fun CoupangEatsRoundedImagePreview() {
    CoupangEatsRoundedImage(imgId = R.drawable.img_opoke, borderYN = true)
}