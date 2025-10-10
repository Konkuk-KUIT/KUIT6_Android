package com.kuit.kuit6android.ui.cart.component.recommended

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun RecommendedAddButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(
                size = 30.dp
            )
            .border(
                width = 1.dp,
                color = CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(size = 27.dp)
            )
//            .clip(
//                shape = RoundedCornerShape(size = 27.dp)
//            )
            .clickable(
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = R.drawable.recommended_add),
            contentDescription = "추가",
            modifier = Modifier
                .size(size = 15.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RecommendedAddButtonPreview() {
    RecommendedAddButton(onClick = {})
}