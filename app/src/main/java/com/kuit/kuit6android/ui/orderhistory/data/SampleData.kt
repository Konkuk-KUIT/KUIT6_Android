package com.kuit.kuit6android.ui.orderhistory.data

import com.kuit.kuit6android.ui.orderhistory.model.OrderItem

object OrderHistorySampleData {
    val sampleOrderItems = listOf(
        OrderItem(
            date = "10월 4일(토)",
            storeName = "신선에이 중곡역점",
            menuName = "마라탕 외",
            menuCount = "1개",
            deliveryInfo = "도착완료 12분",
            status = "주문완료",
            originalPrice = 10000,
            finalPrice = 8500,
            couponDiscount = 1500,
            imageRes = 0
        ),
        OrderItem(
            date = "10월 3일(금)",
            storeName = "사상명장식지탕 중곡역점",
            menuName = "지갈비명장식지탕",
            menuCount = "1개",
            deliveryInfo = "배달완료 17분",
            status = "주문완료",
            originalPrice = 24000,
            finalPrice = 20000,
            couponDiscount = 4000,
            imageRes = 0
        ),
        OrderItem(
            date = "9월 27일(토)",
            storeName = "동네분식카페(의 전지뼈)",
            menuName = "순대떡볶이",
            menuCount = "1개",
            deliveryInfo = "단골, [무거운] 일회용컵",
            status = "주문완료",
            originalPrice = 20700,
            finalPrice = 18500,
            couponDiscount = 2200,
            imageRes = 0,
            isFavorite = true
        ),
        OrderItem(
            date = "10월 4일(토)",
            storeName = "신전떡볶이 중곡역점",
            menuName = "1인세트",
            menuCount = "1개",
            deliveryInfo = "떡볶이 1인분, 모둠튀김, 주시를",
            status = "주문상세",
            originalPrice = 10000,
            finalPrice = 8500,
            couponDiscount = 1500,
            imageRes = 0,
            isFavorite = false,
            isStoreOpen = false
        )
    )
}