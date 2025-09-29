package com.kuit.kuit6android.ui.detail.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.kuit.kuit6android.model.Store
import com.kuit.kuit6android.model.factory.StoreFactory

@Composable
fun DetailPage(store: Store){
    Column {

    }
}

@Preview(showBackground = true)
@Composable
private fun DetailPagePreview(){
    DetailPage(store = StoreFactory.getStoreList()[0])
}