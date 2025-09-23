package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryItem(modifier: Modifier = Modifier, categoryData: CategoryData) {

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.height(67.dp)
    ) {
        item {
            Image(
                painter = painterResource(categoryData.imageId),
                contentDescription = categoryData.category,
                modifier = modifier.size(47.dp)
            )

            Text(
                text = categoryData.category,
                color = Color.Black,
                fontSize = 11.sp,
                modifier = modifier.padding(top = 4.dp)
            )
        }

    }
}