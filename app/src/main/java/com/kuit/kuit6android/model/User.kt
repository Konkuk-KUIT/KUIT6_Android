package com.kuit.kuit6android.model

data class User(
    val name: String,
    val phone: String,
    val myReview: List<String>,
    val helpCount: Int,
    val favoriteStore: List<Store>
)
