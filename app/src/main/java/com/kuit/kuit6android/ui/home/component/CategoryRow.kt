package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.CategoryData
import java.util.Locale

@Composable
fun CategoryRow(modifier: Modifier = Modifier) {
    val categoryList = listOf(
        CategoryData(imageId = R.drawable.pork_cutlet, category = "돈까스"),
        CategoryData(imageId = R.drawable.japanese, category = "일식"),
        CategoryData(imageId = R.drawable.korean, category = "한식"),
        CategoryData(imageId = R.drawable.chicken, category = "치킨"),
        CategoryData(imageId = R.drawable.ttobboki, category = "분식")
    )
    LazyRow(horizontalArrangement = Arrangement.spacedBy(18.dp)) {
        items(categoryList) {category ->
            CategoryItem(categoryData = category)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CategoryRowPreview() {
    CategoryRow()
}