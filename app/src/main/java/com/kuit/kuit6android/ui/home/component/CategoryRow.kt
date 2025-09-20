package com.kuit.kuit6android.ui.home.component

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit6android.R
import com.kuit.kuit6android.ui.home.data.CategoryData

@Composable
fun CategoryRow(modifier: Modifier = Modifier) {
    val categoryList = listOf(
        CategoryData(imageId = R.drawable.pork_cutlet, category = "돈까스"),
        CategoryData(imageId = R.drawable.japanese_food, category = "일식"),
        CategoryData(imageId = R.drawable.korean_food, category = "한식"),
        CategoryData(imageId = R.drawable.chicken, category = "치킨"),
        CategoryData(imageId = R.drawable.snack_food, category = "분식"),
    )
////    LazyRow(horizontalArrangement = Arrangement.spacedBy(space = 4.dp)) {
//    LazyRow(horizontalArrangement = Arrangement.spacedBy(space = 18.dp)) {
//        items(items = categoryList) { category ->
//            CategoryItem(
//                categoryData = category
//            )
//        }
//    }
    Row {
        categoryList.forEach {
            CategoryItem(
                categoryData = it
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CategoryRowPreview() {
    CategoryRow()
}