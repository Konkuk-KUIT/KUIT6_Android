package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme


@Composable
fun TakeoutOrPickup(modifier: Modifier = Modifier) {
    var selectedOption by remember { mutableStateOf("delivery") }

    Column (
        modifier= modifier
            .fillMaxWidth()
    ){
        Column (
            modifier= modifier
                .fillMaxWidth()
                .border(width=1.dp,
                    color = if (selectedOption == "delivery")
                    CoupangEatsTheme.colors.black
                else
                    CoupangEatsTheme.colors.gray300,
                    shape= RoundedCornerShape(20.dp))
                .padding(20.dp)
                .clickable { selectedOption = "delivery" }
        ){
            Text(
                "가게 배달",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
            Spacer(modifier= modifier.height(9.dp))
            Text(
                "22~37분 후 도착예정",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black
            )
        }

        Spacer(modifier= modifier.height(10.dp))

        Column (
            modifier= modifier
            .fillMaxWidth()
            .border(width=1.dp,
                color = if (selectedOption == "pickup")
                    CoupangEatsTheme.colors.black
                else
                    CoupangEatsTheme.colors.gray300,
                shape= RoundedCornerShape(20.dp))
            .padding(20.dp)
                .clickable { selectedOption = "pickup" } ){
            Text(
                "픽업",
                style = CoupangEatsTheme.typography.head_03_B_16,
                color = CoupangEatsTheme.colors.black
            )
            Spacer(modifier= modifier.height(9.dp))
            Text(
                "14~24분 후 픽업",
                style = CoupangEatsTheme.typography.head_04_SB_14,
                color = CoupangEatsTheme.colors.black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TakeoutPreview() {
    TakeoutOrPickup(modifier= Modifier)
}