package com.kuit.kuit6android.model

import androidx.annotation.DrawableRes

sealed class ImageResource{
    data class Resource(@DrawableRes val resId : Int) : ImageResource()
    data class Url(val url : String) : ImageResource()
}