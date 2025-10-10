package com.kuit.kuit6android.ui.orderhistory.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun OrderHistoryTextField(modifier: Modifier = Modifier) {
    var menu by rememberSaveable { mutableStateOf("") }
    Box{
        OutlinedTextField(
            placeholder = {
                Text(text = "주문한 메뉴나 가게를 찾아볼 수 있어요",
                    style = CoupangEatsTheme.typograahy.body_02_R_12,
                    fontSize = 12.sp
                )
            },
            value = menu,
            onValueChange = { menu = it },
            modifier = modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = CoupangEatsTheme.colors.black,
                unfocusedTextColor = CoupangEatsTheme.colors.black,
                focusedContainerColor = CoupangEatsTheme.colors.Gray200,
                unfocusedContainerColor = CoupangEatsTheme.colors.Gray200,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            ),
            textStyle = CoupangEatsTheme.typograahy.body_02_R_12,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "search icon",
                    tint = CoupangEatsTheme.colors.black,
                    modifier = modifier.size(20.dp)
                )
            },
            shape = RoundedCornerShape(20.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun OrderHistoryTextFieldPrev() {
OrderHistoryTextField()
}