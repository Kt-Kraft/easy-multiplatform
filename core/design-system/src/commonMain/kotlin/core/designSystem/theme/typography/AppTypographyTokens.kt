package core.designSystem.theme.typography

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

public class AppTypographyTokens(fontFamily: FontFamily) {
  public val metadata10Bold: TextStyle = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 10.sp,
    lineHeight = 16.sp,
    fontFamily = fontFamily,
  )

  public val metadata10Regular: TextStyle = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 10.sp,
    lineHeight = 16.sp,
    fontFamily = fontFamily,
  )

  public val metadata12Bold: TextStyle = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 12.sp,
    lineHeight = 18.sp,
    fontFamily = fontFamily,
  )

  public val metadata12Regular: TextStyle = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 12.sp,
    lineHeight = 18.sp,
    fontFamily = fontFamily,
  )

  public val body14ExtraBold: TextStyle = TextStyle(
    fontWeight = FontWeight.W900,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = fontFamily,
  )

  public val body14Bold: TextStyle = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = fontFamily,
  )

  public val body14Regular: TextStyle = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = fontFamily,
  )

  public val body16Bold: TextStyle = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 16.sp,
    lineHeight = 22.sp,
    fontFamily = fontFamily,
  )

  public val body16Regular: TextStyle = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 16.sp,
    lineHeight = 22.sp,
    fontFamily = fontFamily,
  )

  public val header18Bold: TextStyle = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 18.sp,
    lineHeight = 24.sp,
    fontFamily = fontFamily,
  )

  public val header18Regular: TextStyle = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 18.sp,
    lineHeight = 28.sp,
    fontFamily = fontFamily,
  )
}
