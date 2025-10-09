package com.kuit.kuit6android.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class CoupangEatsColors(
    val white: Color = White,
    val black: Color = Black,
    val blue: Color = Blue,
    val gray100: Color = Gray100,
    val gray200: Color = Gray200,
    val gray300: Color = Gray300,
    val gray400: Color = Gray400,
    val gray500: Color = Gray500,
    val apricot: Color = Apricot,
    val mint: Color = Mint,
    val purple: Color = Purple,
    val lavender: Color = Lavender,
    val violet: Color = Violet
)

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val White = Color(0xFFFFFFFF)

val Black = Color(0xFF000000)

val Blue = Color(0xFF0077FF)

val Gray100 = Color(0xFFF6F7F9)

val Gray200 = Color(0xFFF3F4F6)

val Gray300 = Color(0xFFD9D9D9)

val Gray400 = Color(0xFF9FA5B0)

val Gray500 = Color(0xFF666668)

val Apricot = Color(0xFFFFF5E4)

val Mint = Color(0xFF0CEFD4)

val Purple = Color(0xFF462DAF)

val Lavender = Color(0xFFE5E9FE)

val Violet = Color(0xFF462DAF)

val defaultCoupangEatsColors = CoupangEatsColors()

val LocalCoupangEatsColors = staticCompositionLocalOf { defaultCoupangEatsColors }