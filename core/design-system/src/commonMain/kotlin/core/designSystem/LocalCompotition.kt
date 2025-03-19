package core.designSystem

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import core.designSystem.configs.AppConfigState
import core.designSystem.theme.color.AppColors
import core.designSystem.theme.color.Colors
import core.designSystem.theme.color.LightColors
import core.designSystem.theme.typography.Typography
import core.designSystem.theme.typography.appTypography

public val LocalColors: ProvidableCompositionLocal<Colors> = staticCompositionLocalOf { LightColors }
public val LocalDefaultColors: ProvidableCompositionLocal<AppColors> = compositionLocalOf { AppColors() }
public val LocalContentColor: ProvidableCompositionLocal<Color> = compositionLocalOf { Color.Unspecified }
public val LocalContentAlpha: ProvidableCompositionLocal<Float> = compositionLocalOf { 1f }
public val LocalAppConfigState: ProvidableCompositionLocal<AppConfigState> =
  staticCompositionLocalOf { error("No AppConfigState provided") }
public val LocalTypography: ProvidableCompositionLocal<Typography> = staticCompositionLocalOf { appTypography }
public val LocalTextStyle: ProvidableCompositionLocal<TextStyle> =
  compositionLocalOf(structuralEqualityPolicy()) { TextStyle.Default }
public val LocalOriginalTypography: ProvidableCompositionLocal<Typography> = staticCompositionLocalOf { appTypography }
