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
    tabs: List<NavTab>,
    currentTab: NavTab?,
    onItemSelected: (NavTab) -> Unit,
) {
    if(!visible) return
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
                tabs.forEach { tab ->
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .clickable(indication = null, interactionSource = null) {
                                onItemSelected(tab)
                            },
                        verticalArrangement = Arrangement.spacedBy(3.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Icon(
                            painter = painterResource(id = tab.icon),
                            contentDescription = tab.label,
                            tint = if (tab == currentTab)
                                Color.Black
                            else Color(0xff939DA9)
                        )
                        Text(
                            tab.label,
                            fontSize = 13.sp,
                            color = if (tab == currentTab)
                                Color.Black
                            else Color(0xff939DA9)
                        )
                    }
                }
            }
        }
    }
}