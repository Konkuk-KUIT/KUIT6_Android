package com.kuit.kuit6android.ui.shoppingcart.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendModeColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.shoppingcart.Menu
import com.kuit.kuit6android.ui.theme.CoupangEatsTheme

@Composable
fun SuggestMenuList(menuList: List<Menu>, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = CoupangEatsTheme.colors.gray300,
                shape = RoundedCornerShape(20.dp)
            )
    ) {
        menuList.forEach { menu ->
            SuggestMenu(menu = menu, modifier = Modifier.padding(top = 20.dp))
            HorizontalDivider(modifier = Modifier.padding(top = 20.dp))
        }
    }
}

@Preview
@Composable
private fun SuggestMenuListPreview(){
    SuggestMenuList(
        menuList = listOf(
            Menu(
                name = "떡볶이",
                price = 10000,
                count = 1,
                detail = "맛있는 떡볶이",
                img = R.drawable.storeexample
            ),
        )
    )
}