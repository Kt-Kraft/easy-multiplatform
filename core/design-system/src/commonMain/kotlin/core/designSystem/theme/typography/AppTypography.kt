package core.designSystem.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import core.designSystem.AppTheme.typography
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

public data class Typography(
  val h1: TextStyle,
  val h2: TextStyle,
  val h3: TextStyle,
  val h4: TextStyle,
  val body1: TextStyle,
  val body2: TextStyle,
  val body3: TextStyle,
  val label1: TextStyle,
  val label2: TextStyle,
  val label3: TextStyle,
  val button: TextStyle,
  val input: TextStyle,
)

internal val appTypography =
  Typography(
    h1 =
      TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp,
      ),
    h2 =
      TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
      ),
    h3 =
      TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
      ),
    h4 =
      TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
      ),
    body1 =
      TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
      ),
    body2 =
      TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.15.sp,
      ),
    body3 =
      TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.15.sp,
      ),
    label1 =
      TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
      ),
    label2 =
      TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp,
      ),
    label3 =
      TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 10.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.5.sp,
      ),
    button =
      TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 1.sp,
      ),
    input =
      TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp,
      ),
  )

internal val AppTypography
  @Composable
  get() = run {
    val customFontFamily = PlusJakarta
    val defaultTypography = typography
    remember {
      Typography(
        h1 = defaultTypography.h1.copy(fontFamily = customFontFamily),
        h2 = defaultTypography.h2.copy(fontFamily = customFontFamily),
        h3 = defaultTypography.h3.copy(fontFamily = customFontFamily),
        h4 = defaultTypography.h4.copy(fontFamily = customFontFamily),
        body1 = defaultTypography.body1.copy(fontFamily = customFontFamily),
        body2 = defaultTypography.body2.copy(fontFamily = customFontFamily),
        body3 = defaultTypography.body3.copy(fontFamily = customFontFamily),
        label1 = defaultTypography.label1.copy(fontFamily = customFontFamily),
        label2 = defaultTypography.label2.copy(fontFamily = customFontFamily),
        label3 = defaultTypography.label3.copy(fontFamily = customFontFamily),
        button = defaultTypography.button.copy(fontFamily = customFontFamily),
        input = defaultTypography.input.copy(fontFamily = customFontFamily),
      )
    }
  }

public fun scaledTypography(fontScale: Float, default: Typography): Typography {
  return Typography(
    h1 = default.h1.copy(fontSize = 24.sp * fontScale, lineHeight = 32.sp * fontScale),
    h2 = default.h2.copy(fontSize = 20.sp * fontScale, lineHeight = 28.sp * fontScale),
    h3 = default.h3.copy(fontSize = 16.sp * fontScale, lineHeight = 24.sp * fontScale),
    h4 = default.h4.copy(fontSize = 16.sp * fontScale, lineHeight = 24.sp * fontScale),
    body1 = default.body1.copy(fontSize = 16.sp * fontScale, lineHeight = 24.sp * fontScale),
    body2 = default.body2.copy(fontSize = 14.sp * fontScale, lineHeight = 20.sp * fontScale),
    body3 = default.body3.copy(fontSize = 12.sp * fontScale, lineHeight = 16.sp * fontScale),
    label1 = default.label1.copy(fontSize = 14.sp * fontScale, lineHeight = 20.sp * fontScale),
    label2 = default.label2.copy(fontSize = 12.sp * fontScale, lineHeight = 16.sp * fontScale),
    label3 = default.label3.copy(fontSize = 10.sp * fontScale, lineHeight = 12.sp * fontScale),
    button = default.button.copy(fontSize = 14.sp * fontScale, lineHeight = 20.sp * fontScale),
    input = default.input.copy(fontSize = 16.sp * fontScale, lineHeight = 24.sp * fontScale),
  )
}
