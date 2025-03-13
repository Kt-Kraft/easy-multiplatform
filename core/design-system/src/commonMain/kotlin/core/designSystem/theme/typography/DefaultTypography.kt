package core.designSystem.theme.typography

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import core.designSystem.resources.Res
import core.designSystem.resources.plus_jakarta_sans_bold
import core.designSystem.resources.plus_jakarta_sans_bold_italic
import core.designSystem.resources.plus_jakarta_sans_extra_bold
import core.designSystem.resources.plus_jakarta_sans_italic
import core.designSystem.resources.plus_jakarta_sans_light
import core.designSystem.resources.plus_jakarta_sans_medium
import core.designSystem.resources.plus_jakarta_sans_medium_italic
import core.designSystem.resources.plus_jakarta_sans_regular
import core.designSystem.resources.plus_jakarta_sans_semi_bold
import core.designSystem.resources.plus_jakarta_sans_semi_bold_italic
import org.jetbrains.compose.resources.Font

public val PlusJakarta: FontFamily
  @Composable get() = FontFamily(
    Font(Res.font.plus_jakarta_sans_light, FontWeight.Light),
    Font(Res.font.plus_jakarta_sans_regular, FontWeight.Normal),
    Font(Res.font.plus_jakarta_sans_italic, FontWeight.Normal, FontStyle.Italic),
    Font(Res.font.plus_jakarta_sans_medium, FontWeight.Medium),
    Font(Res.font.plus_jakarta_sans_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(Res.font.plus_jakarta_sans_bold, FontWeight.Bold),
    Font(Res.font.plus_jakarta_sans_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(Res.font.plus_jakarta_sans_semi_bold, FontWeight.SemiBold),
    Font(Res.font.plus_jakarta_sans_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
    Font(Res.font.plus_jakarta_sans_extra_bold, FontWeight.ExtraBold),
  )

public inline val FontFamily.Companion.plusJakarta: FontFamily @Composable get() = PlusJakarta

internal val DefaultTypography
  @Composable
  get() = run {
    val fontFamily = PlusJakarta
    remember {
      Typography(
        displayLarge = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 57.sp,
          lineHeight = 64.sp,
          letterSpacing = (-0.25).sp,
        ),
        displayMedium = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 45.sp,
          lineHeight = 52.sp,
        ),
        displaySmall = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 36.sp,
          lineHeight = 44.sp,
        ),
        headlineLarge = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 32.sp,
          lineHeight = 40.sp,
        ),
        headlineMedium = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 28.sp,
          lineHeight = 36.sp,
        ),
        headlineSmall = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 24.sp,
          lineHeight = 32.sp,
        ),
        titleLarge = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W700,
          fontSize = 22.sp,
          lineHeight = 28.sp,
        ),
        titleMedium = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W700,
          fontSize = 16.sp,
          lineHeight = 24.sp,
          letterSpacing = 0.1.sp,
        ),
        titleSmall = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W500,
          fontSize = 14.sp,
          lineHeight = 20.sp,
          letterSpacing = 0.1.sp,
        ),
        bodyLarge = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 16.sp,
          lineHeight = 24.sp,
          letterSpacing = 0.5.sp,
        ),
        bodyMedium = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 14.sp,
          lineHeight = 20.sp,
          letterSpacing = 0.25.sp,
        ),
        bodySmall = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 12.sp,
          lineHeight = 16.sp,
          letterSpacing = 0.4.sp,
        ),
        labelLarge = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 14.sp,
          lineHeight = 20.sp,
          letterSpacing = 0.1.sp,
        ),
        labelMedium = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W400,
          fontSize = 12.sp,
          lineHeight = 16.sp,
          letterSpacing = 0.5.sp,
        ),
        labelSmall = TextStyle(
          fontFamily = fontFamily,
          fontWeight = FontWeight.W500,
          fontSize = 10.sp,
          lineHeight = 16.sp,
        ),
      )
    }
  }
