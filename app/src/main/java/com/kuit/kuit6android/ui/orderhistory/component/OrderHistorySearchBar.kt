package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderHistorySearchBar(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        placeholder = {
            Text(
                "주문한 메뉴나 가게를 찾아볼 수 있어요",
                style = CoupangEatsTheme.typography.body_02_R_12,
                color = CoupangEatsTheme.colors.gray500
            )
        },
        trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "검색",
                tint = CoupangEatsTheme.colors.black
            )
        },
        shape = RoundedCornerShape(size = 20.dp),
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = CoupangEatsTheme.colors.gray100,
            unfocusedContainerColor = CoupangEatsTheme.colors.gray100,
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent
        ),
        singleLine = true
    )
}