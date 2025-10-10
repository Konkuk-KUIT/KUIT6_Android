package com.kuit.kuit6android.ui.orderhistory.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun OrderHistoryTextField(
    value: String,
    onValueChange: (String)-> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        placeholder = {
            Text(
                text = "주문한 메뉴나 가게를 찾아볼 수 있어요. ",
                style = CoupangEatsTheme.typography.body_02_R_12
                )
                      },
            value = value,
            onValueChange= onValueChange,
            modifier = modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth(),

            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = CoupangEatsTheme.colors.black,
                unfocusedTextColor = CoupangEatsTheme.colors.black,
                focusedContainerColor = CoupangEatsTheme.colors.gray200,
                unfocusedContainerColor = CoupangEatsTheme.colors.gray200,
                focusedBorderColor= Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
             ),
            textStyle = CoupangEatsTheme.typography.body_02_R_12,
            trailingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "돋보기",
                tint = CoupangEatsTheme.colors.black,
                modifier = modifier.size(20.dp)
                )
            },
            shape = RoundedCornerShape(20.dp)
    )
}