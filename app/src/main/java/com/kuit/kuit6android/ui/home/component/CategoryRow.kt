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

@Composable
fun CategoryRow(modifier: Modifier = Modifier) {
    val categoryList = listOf(
        CategoryData(ImageId = R.drawable.img_pork_cutlet, "돈까스"),
        CategoryData(ImageId = R.drawable.img_japanese, "일식"),
        CategoryData(ImageId = R.drawable.img_korean, "한식"),
        CategoryData(ImageId = R.drawable.img_chicken, "치킨"),
        CategoryData(ImageId = R.drawable.img_snack, "분식"),
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        items(categoryList){category ->
            CategoryItem(categoryData = category)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CategoryRowPreview() {
    CategoryRow()
}