package com.kuit.kuit6android.model.factory

import com.kuit.kuit6android.R
import com.kuit.kuit6android.model.ImageResource
import com.kuit.kuit6android.model.Store

object StoreFactory {
    fun getStoreList():List<Store>{
        return listOf(
            Store(
                name = "아워떡볶이",
                img = ImageResource.Resource(R.drawable.storeexample),
                time = "30분",
                star = 4.9,
                commentCount = 3849
            ),
            Store(
                name = "아워떡볶이",
                img = ImageResource.Resource(R.drawable.storeexample),
                time = "30분",
                star = 4.9,
                commentCount = 3849
            )
        )
    }
}