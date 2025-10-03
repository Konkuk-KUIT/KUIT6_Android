package com.kuit.kuit6android.ui.detailpage.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R

@Composable
fun DetailBar(
    onBack: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_back_arrow),
            contentDescription = "뒤로가기",
            modifier = Modifier
                .size(24.dp)
                .clickable { onBack() }
        )
        Spacer(Modifier.weight(1f))
        Icon(
            painter = painterResource(R.drawable.ic_favorite),
            contentDescription = "즐겨찾기",
            modifier = Modifier.size(24.dp)
        )
    }
}
