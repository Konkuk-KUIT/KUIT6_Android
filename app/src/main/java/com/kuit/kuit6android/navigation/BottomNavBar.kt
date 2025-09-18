package com.kuit.kuit6android.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavBar(
    visible: Boolean,
    items: List<BottomNavBarItem>,
    currentIndex: Int,
    onItemSelected: (Int, BottomNavBarItem) -> Unit,
) {
    Box(modifier = Modifier.background(Color.White)) {
        Column {
            HorizontalDivider(color = Color.LightGray)
            Row(
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 14.dp)
                    .navigationBarsPadding()
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                items.forEachIndexed { index, item ->
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clickable(indication = null, interactionSource = null) {
                                onItemSelected(index, item)
                            },
                        verticalArrangement = Arrangement.spacedBy(3.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Icon(
                            painter = painterResource(id = item.icon),
                            contentDescription = item.label,
                            tint = if (index == currentIndex)
                                Color.Black
                            else Color(0xff939DA9)
                        )
                        Text(
                            item.label,
                            fontSize = 13.sp,
                            color = if (index == currentIndex)
                                Color.Black
                            else Color(0xff939DA9)
                        )
                    }
                }
            }
        }
    }
}