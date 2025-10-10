package com.kuit.kuit6android.navigation

sealed interface NavEvent {
    data object Back : NavEvent
    data class ToDetail(val id: String) : NavEvent
}