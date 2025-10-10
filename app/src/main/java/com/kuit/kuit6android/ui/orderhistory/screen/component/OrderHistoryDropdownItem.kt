package com.kuit.kuit6android.ui.orderhistory.screen.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderHistoryDropdownItem(modifier: Modifier = Modifier, category: String) {
    Button(
        shape = RoundedCornerShape(20.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(containerColor = CoupangEatsTheme.colors.white),
        border = BorderStroke(1.dp, CoupangEatsTheme.colors.gray300)
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "주소",
                style = CoupangEatsTheme.typography.body_02_R_12,
                color = CoupangEatsTheme.colors.black
            )
            Icon(
                modifier = modifier
                    .padding(start = 3.dp)
                    .size(16.dp),
                painter = painterResource(id = R.drawable.ic_drop_down),
                contentDescription = "dropdown icon",
                tint = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OrderHistoryDropdownItemPreview() {
    OrderHistoryDropdownItem(
        category = "주소"
    )
}