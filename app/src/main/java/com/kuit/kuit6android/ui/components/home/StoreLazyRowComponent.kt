package com.kuit.kuit6android.ui.components.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.model.factory.StoreFactory

@Composable
fun StoreLazyRowComponent(modifier: Modifier = Modifier) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(21.dp), modifier = modifier) {
        items(StoreFactory.getStoreList()) { store ->
            StoreComponent(store, onClick = {} ,modifier = Modifier.size(width = 230.dp, height = 129.dp))
        }
    }
}

@Preview
@Composable
private fun StoreLazyRowComponentPreview() {
    StoreLazyRowComponent()
}