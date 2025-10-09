package com.kuit.kuit6android.ui.orderhistory.model

data class OrderItem(
    val date: String,
    val storeName: String,
    val menuName: String,      // "슈프림양념치킨"
    val menuCount: String,     // "1개"
    val deliveryInfo: String,
    val status: String,
    val originalPrice: Int,
    val finalPrice: Int,
    val couponDiscount: Int,
    val imageRes: Int,
    val isFavorite: Boolean = false,
    val isStoreOpen: Boolean = true
)