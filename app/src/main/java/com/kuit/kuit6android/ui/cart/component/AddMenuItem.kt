package com.kuit.kuit6android.ui.cart.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.extension.toDecimalFormat
import com.kuit.kuit6android.ui.cart.data.ShortMenuData
import com.kuit.kuit6android.ui.components.CoupangEatsRoundedImage
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun AddMenuItem(
    modifier: Modifier = Modifier,
    recommendMenuData: ShortMenuData,
    onPlus: () -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(CoupangEatsTheme.colors.white),
        verticalAlignment = Alignment.CenterVertically
    ) {
        CoupangEatsRoundedImage(imgId = recommendMenuData.imageId, borderYN = true)
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .weight(1f)
        ) {
            Text(
                text = recommendMenuData.menuName,
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.head_04_SB_14
            )
            Spacer(modifier = Modifier.padding(top = 5.dp))
            Text(
                text = "${recommendMenuData.menuPrice.toDecimalFormat()}원",
                color = CoupangEatsTheme.colors.black,
                style = CoupangEatsTheme.typography.body_02_R_12
            )
        }
        Button(
            onClick = onPlus,
            modifier = Modifier
                .size(30.dp),
            shape = RoundedCornerShape(27.dp),
            border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300),
            colors = ButtonDefaults.buttonColors(
                containerColor = CoupangEatsTheme.colors.white,
                contentColor = CoupangEatsTheme.colors.black
            ),
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_plus),
                contentDescription = "ic_plus",
                tint = CoupangEatsTheme.colors.black,
                modifier = Modifier
                    .size(15.dp)
            )
        }
    }
}

@Preview
@Composable
private fun AddMenuItemPreview() {
    AddMenuItem(
        modifier = Modifier.width(280.dp),
        recommendMenuData = ShortMenuData(
            "황금올리브치킨 핫크리스피",
            24500,
            R.drawable.img_bbq_h_o
        ),
        onPlus = {}
    )
}