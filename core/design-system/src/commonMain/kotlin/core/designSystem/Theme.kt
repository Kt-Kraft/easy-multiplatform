package core.designSystem

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import core.designSystem.configs.rememberAppConfigState
import core.designSystem.theme.color.AppColors
import core.designSystem.theme.color.Colors
import core.designSystem.theme.color.LightColors
import core.designSystem.theme.color.MaterialDarkColorScheme
import core.designSystem.theme.color.MaterialLightColorScheme
import core.designSystem.theme.color.contentColorFor
import core.designSystem.theme.typography.AppTypography
import core.designSystem.theme.typography.DefaultTypography
import core.designSystem.theme.typography.Typography
import core.designSystem.theme.typography.scaledTypography

public object AppTheme {
  public val colors: Colors
    @ReadOnlyComposable @Composable
    get() = LocalColors.current

  public val typography: Typography
    @ReadOnlyComposable @Composable
    get() = LocalTypography.current

  public val originalScaleTypography: Typography
    @ReadOnlyComposable @Composable
    get() = LocalOriginalTypography.current
}

@Composable
public fun AppTheme(
  isDarkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit,
) {
  val rippleIndication = ripple()
  val selectionColors = rememberTextSelectionColors(LightColors)
  val appConfigState = rememberAppConfigState()
  val defaultTypography = AppTypography
  val scaledTypography = scaledTypography(appConfigState.fontScale, defaultTypography)
  val colors = if (isDarkTheme) appConfigState.colors.darkColors else appConfigState.colors.lightColors
  val m3Colors = if (isDarkTheme) MaterialDarkColorScheme else MaterialLightColorScheme

  CompositionLocalProvider(
    LocalColors provides colors,
    LocalDefaultColors provides AppColors(),
    LocalContentColor provides colors.contentColorFor(colors.background),
    LocalTypography provides scaledTypography,
    LocalOriginalTypography provides scaledTypography,
    LocalIndication provides rippleIndication,
    LocalTextSelectionColors provides selectionColors,
    LocalAppConfigState provides appConfigState,
    LocalTextStyle provides scaledTypography.body1,
    LocalLayoutDirection provides appConfigState.layoutDirection,
  ) {
    MaterialTheme(
      colorScheme = m3Colors,
      typography = DefaultTypography,
      content = content,
    )
  }
}

@Composable
public fun contentColorFor(color: Color): Color {
  return AppTheme.colors.contentColorFor(color)
}

@Composable
internal fun rememberTextSelectionColors(colorScheme: Colors): TextSelectionColors {
  val primaryColor = colorScheme.primary
  return remember(primaryColor) {
    TextSelectionColors(
      handleColor = primaryColor,
      backgroundColor = primaryColor.copy(alpha = TextSelectionBackgroundOpacity),
    )
  }
}

internal const val TextSelectionBackgroundOpacity = 0.4f
