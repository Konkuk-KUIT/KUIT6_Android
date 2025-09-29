package com.kuit.kuit6android.ui.components.favorite

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit6android.model.Store
import com.kuit.kuit6android.model.factory.StoreFactory
import com.kuit.kuit6android.ui.components.home.StoreComponent

@Composable
fun StoreListComponent(storeList : List<Store>, modifier: Modifier = Modifier){
    LazyColumn(modifier = Modifier.then(modifier),
        verticalArrangement = Arrangement.spacedBy(20.dp)) {
        items(storeList){ store ->
            StoreComponent(store, modifier = Modifier.size(width = 306.dp, height = 129.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StoreListComponentPreview(){
    StoreListComponent(StoreFactory.getStoreList())
}