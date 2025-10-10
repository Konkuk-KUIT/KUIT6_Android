package com.kuit.kuit6android.extension

import java.text.DecimalFormat

fun String.toDateFormat(): String{
    //확장함수 연습
    val parts = this.split("-")
    val month = parts[0]
    val day = parts[1]
    val week = parts[2]

    return "${month}월 ${day}일 ${week}요일"
}

fun Int.toDecimalFormat():String{
    val decimalFormat = DecimalFormat("#,###")
    return decimalFormat.format(this)
}