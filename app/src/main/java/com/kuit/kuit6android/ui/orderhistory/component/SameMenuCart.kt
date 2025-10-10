package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun SameMenuCart(modifier: Modifier = Modifier) {
Row(
    modifier= modifier
        .width(131.dp)
        .height(43.dp)
        .border(width = 1.dp, color= CoupangEatsTheme.colors.gray300,
            shape = RoundedCornerShape(10.dp)
        ),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Center
){
    Text("같은 메뉴 담기",
        style = CoupangEatsTheme.typography.head_03_B_16,
        color= CoupangEatsTheme.colors.black)
}
}