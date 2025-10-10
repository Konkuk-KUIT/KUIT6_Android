package com.kuit.kuit6android.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

fun onClick(string: String): () -> Unit {return {println("어떡하지")}}

@Composable
fun CoupangEatsRoundedButton(modifier: Modifier = Modifier) {
    //공통컴포넌트
    Button(
        modifier= modifier
            .width(131.dp)
            .height(43.dp),
        onClick = {onClick("")},
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = CoupangEatsTheme.colors.mint,
            contentColor = CoupangEatsTheme.colors.black
        )) {
        Text(
            text = "바로주문",
            style = CoupangEatsTheme.typography.head_03_B_16,
            color = CoupangEatsTheme.colors.black
        )
    }
}

@Preview
@Composable
private fun Preview() {
    CoupangEatsRoundedButton()
}