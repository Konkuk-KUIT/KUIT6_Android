package com.kuit.kuit6android.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit6android.R

val CoupangEatsFontBold = FontFamily(Font(R.font.pretendard_bold))
val CoupangEatsFontSemiBold = FontFamily(Font(R.font.pretendard_semibold))
val CoupangEatsFontMedium = FontFamily(Font(R.font.pretendard_medium))
val CoupangEatsFontRegular = FontFamily(Font(R.font.pretendard_regular))

data class CoupangEatsTypography(
    val head_01_B_24: TextStyle,
    val head_02_B_20: TextStyle,
    val head_03_B_16: TextStyle,
    val head_03_SB_16: TextStyle,
    val head_03_R_16: TextStyle,
    val head_04_SB_14: TextStyle,
    val head_05_B_10: TextStyle,
    val body_01_M_14: TextStyle,
    val body_01_R_14: TextStyle,
    val body_02_SB_12: TextStyle,
    val body_02_R_12: TextStyle,
    val caption_01_R_10: TextStyle,
)

val defaultCoupangEatsTypography = CoupangEatsTypography(
    head_01_B_24 = TextStyle(
        fontFamily = CoupangEatsFontBold,
        fontSize = 24.sp,
        lineHeight = 24.sp
    ),
    head_02_B_20 = TextStyle(
        fontFamily = CoupangEatsFontBold,
        fontSize = 20.sp,
        lineHeight = 20.sp
    ),
    head_03_B_16 = TextStyle(
        fontFamily = CoupangEatsFontBold,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_03_SB_16 = TextStyle(
        fontFamily = CoupangEatsFontSemiBold,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_03_R_16 = TextStyle(
        fontFamily = CoupangEatsFontRegular,
        fontSize = 16.sp,
        lineHeight = 16.sp
    ),
    head_04_SB_14 = TextStyle(
        fontFamily = CoupangEatsFontSemiBold,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    head_05_B_10 = TextStyle(
        fontFamily = CoupangEatsFontBold,
        fontSize = 10.sp,
        lineHeight = 10.sp
    ),
    body_01_M_14 = TextStyle(
        fontFamily = CoupangEatsFontMedium,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    body_01_R_14 = TextStyle(
        fontFamily = CoupangEatsFontRegular,
        fontSize = 14.sp,
        lineHeight = 14.sp
    ),
    body_02_SB_12 = TextStyle(
        fontFamily = CoupangEatsFontSemiBold,
        fontSize = 12.sp,
        lineHeight = 12.sp
    ),
    body_02_R_12 = TextStyle(
        fontFamily = CoupangEatsFontRegular,
        fontSize = 12.sp,
        lineHeight = 12.sp
    ),
    caption_01_R_10 = TextStyle(
        fontFamily = CoupangEatsFontRegular,
        fontSize = 10.sp,
        lineHeight = 10.sp
    ),
)

val LocalCoupangEatsTypography = staticCompositionLocalOf { defaultCoupangEatsTypography }

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)