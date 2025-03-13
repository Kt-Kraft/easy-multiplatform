package core.designSystem.theme.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

public val metadata10Bold: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 10.sp,
    lineHeight = 16.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val metadata10Regular: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 10.sp,
    lineHeight = 16.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val metadata12Bold: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 12.sp,
    lineHeight = 18.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val metadata12Regular: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 12.sp,
    lineHeight = 18.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val body14ExtraBold: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W900,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val body14Bold: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val body14Regular: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val body16Bold: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 16.sp,
    lineHeight = 22.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val body16Regular: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 16.sp,
    lineHeight = 22.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val header18Bold: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W700,
    fontSize = 18.sp,
    lineHeight = 24.sp,
    fontFamily = FontFamily.plusJakarta,
  )

public val header18Regular: TextStyle
  @Composable get() = TextStyle(
    fontWeight = FontWeight.W400,
    fontSize = 18.sp,
    lineHeight = 28.sp,
    fontFamily = FontFamily.plusJakarta,
  )
