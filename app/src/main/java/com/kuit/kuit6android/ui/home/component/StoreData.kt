package com.kuit.kuit6android.ui.home.component
import kotlinx.serialization.Serializable
@Serializable
data class StoreData(
    val imageId : Int,
    val name : String,
    val deliveryTime : Int,
    val score : Double,
    val reviewCount : String
)