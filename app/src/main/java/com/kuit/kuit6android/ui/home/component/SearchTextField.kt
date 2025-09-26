package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R


@Composable
fun SearchTextField(modifier: Modifier = Modifier) {
    var content by rememberSaveable() { mutableStateOf("") }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            painter = painterResource(id = R.drawable.search),
            "search",
            modifier = modifier.size(20.dp)
        )
        OutlinedTextField(
            value = content,
            onValueChange = {content = it},
            placeholder = { Text(text = "박경민님, 요아정 어때요?", fontSize=15.sp) },
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedPlaceholderColor = Color(0xFF98A0AB),
                unfocusedPlaceholderColor = Color(0xFF98A0AB),
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            ),
        )
        }
}

@Preview(showBackground = true)
@Composable
private fun TextField() {
    SearchTextField()
}