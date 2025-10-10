package com.kuit.kuit6android.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


val White = Color(0xFFFFFFFF)

val Black = Color(0xFF000000)

val Gray100 = Color(0xFFF6F7F9)

val Gray200 = Color(0xFFF3F4F6)

val Apricot= Color(0xFFFFF5E4)

val Mint= Color(0xFF0CEFD4)

val Gray300 = Color(0xFFD9D9D9)

val Purple= Color(0xFF462DAF)

val Lavender= Color(0xFFE5E9FE)

val Gray500= Color(0xFF666668)

val Blue= Color(0xFF0077FF)

data class CoupangEatsColors(
    val white : Color,
    val black : Color,
    val gray100 : Color,
    val Gray200 : Color,
    val Apricot : Color,
    val Mint : Color,
    val Gray300 : Color,
    val Purple : Color,
    val Lavender : Color,
    val  Gray500 : Color,
    val Blue : Color

)

val defaultCoupangEatsColors = CoupangEatsColors(
    white = White,
    black = Black,
    gray100 = Gray100,
    Gray200 = Gray200,
    Apricot = Apricot,
    Mint = Mint,
    Gray300 = Gray300,
    Purple = Purple,
    Lavender = Lavender,
    Gray500 =Gray500,
    Blue = Blue
)

val LocalCoupangEatsColors = staticCompositionLocalOf { defaultCoupangEatsColors }
val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)