package com.kuit.kuit6android.ui.orderhistory.screen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme
import com.kuit.kuit6android.ui.theme.defaultCoupangEatsColors

@Composable
fun OrderHistoryDropdownItem(text : String, modifier: Modifier = Modifier){
    Button(
        shape = RoundedCornerShape(20.dp),
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = CoupangEatsTheme.colors.white,
        ),
        border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300)
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                style = CoupangEatsTheme.typography.body_02_R_12,
                color = CoupangEatsTheme.colors.black
            )
            Icon(
                modifier = Modifier.padding(start = 3.dp).size(12.dp),
                painter = painterResource(R.drawable.outline_keyboard_arrow_down_24),
                contentDescription = "dropdown",
                tint = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview
@Composable
private fun OrderHistoryDropdownItemPreview(){
    OrderHistoryDropdownItem("주소")
}