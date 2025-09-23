package com.kuit.kuit6android.ui.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FoodCategoryViewComponent(modifier: Modifier = Modifier){
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        items(2) {
            FoodLazyRowComponent()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FoodCategoryViewComponentPreview(){
    FoodCategoryViewComponent()
}