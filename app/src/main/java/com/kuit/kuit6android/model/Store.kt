package com.kuit.kuit6android.model

import java.util.UUID

data class Store(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val img: ImageResource,
    val time: String,
    val star: Double,
    val commentCount: Int
)
