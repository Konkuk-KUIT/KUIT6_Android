package com.kuit.kuit6android.ui.search.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit6android.ui.components.search.SearchBar

@Composable
fun SearchResultScreen(
    padding: PaddingValues,
    searchKeyWord: String,
    modifier: Modifier = Modifier) {
    Column (Modifier.padding(paddingValues=padding)){
        SearchBar(text= searchKeyWord)
    }
}
