package com.kuit.kuit6android.ui.favorite.data

import androidx.annotation.DrawableRes

data class StoreData(
    val name: String,
    val delitime: Int,
    @DrawableRes val imageResId: Int
)