package com.kuit.kuit6android.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

val NanumGothic = FontFamily(
    Font(R.font.nanumgothic, FontWeight.Normal),
    Font(R.font.nanumgothicbold, FontWeight.Bold)
)

val Pretendard = FontFamily(
    Font(R.font.pretendardmedium, FontWeight.Normal),
    Font(R.font.pretendardbold, FontWeight.Bold),
    Font(R.font.pretendardsemibold, FontWeight.SemiBold),
    Font(R.font.pretendardregular, FontWeight.Medium)
)


val coupangEatsFontBold = FontFamily(Font(R.font.pretendardbold))
val coupangEatsFontMedium = FontFamily(Font(R.font.pretendardmedium))
val coupangEatsFontRegular = FontFamily(Font(R.font.pretendardregular))
val coupangEatsFontSemiBold = FontFamily(Font(R.font.pretendardsemibold))

data class CoupangEatsTypography(
    val head_01_B_24 : TextStyle,
    val head_02_B_20 : TextStyle,
    val head_03_B_16 : TextStyle,
    val head_03_SB_16 : TextStyle,
    val head_04_SB_14 : TextStyle,
    val head_05_B_10 : TextStyle,
    val body_01_M_14 : TextStyle,
    val body_02_R_14 : TextStyle,
    val body_02_R_12 : TextStyle,
    val body_02_SB_12 : TextStyle,
    val caption_01_R_10 : TextStyle
)

val defaultCoupangEatsTypography = CoupangEatsTypography(
    head_01_B_24 = TextStyle(
        fontFamily = coupangEatsFontBold,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 24.sp
    ),
    head_02_B_20 = TextStyle(
        fontFamily = coupangEatsFontBold,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 20.sp
    ),
    head_03_B_16 = TextStyle(
        fontFamily = coupangEatsFontBold,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_03_SB_16 = TextStyle(
        fontFamily = coupangEatsFontSemiBold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_04_SB_14 = TextStyle(
        fontFamily = coupangEatsFontSemiBold,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    head_05_B_10 = TextStyle(
        fontFamily = coupangEatsFontBold,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp,
        lineHeight = 10.sp
    ),
    body_01_M_14 = TextStyle(
        fontFamily = coupangEatsFontMedium,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    body_02_R_14 = TextStyle(
        fontFamily = coupangEatsFontRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    body_02_R_12 = TextStyle(
        fontFamily = coupangEatsFontRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp
    ),
    body_02_SB_12 = TextStyle(
        fontFamily = coupangEatsFontSemiBold,
        fontSize = 12.sp,
        lineHeight = 12.sp,
        fontWeight = FontWeight.SemiBold
    ),
    caption_01_R_10 = TextStyle(
        fontFamily = coupangEatsFontRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        lineHeight = 10.sp
    )
)

val localCoupangEatsTypography = staticCompositionLocalOf { defaultCoupangEatsTypography }