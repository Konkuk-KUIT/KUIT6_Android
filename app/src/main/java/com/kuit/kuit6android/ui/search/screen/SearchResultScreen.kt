package com.kuit.kuit6android.ui.search.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kuit.kuit6android.ui.search.components.SearchBar

@Composable
fun SearchResultScreen (
    padding: PaddingValues,
    searchKeyword: String,
    modifier : Modifier = Modifier
) {
    Column (Modifier.padding(padding)){
        SearchBar(searchKeyword)

    }

}