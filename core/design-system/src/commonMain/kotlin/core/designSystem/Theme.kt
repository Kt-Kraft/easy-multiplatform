package core.designSystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import core.designSystem.theme.color.defaultColorScheme
import core.designSystem.theme.color.model.AppColorSchemeModel
import core.designSystem.theme.typography.AppTypographyTokens
import core.designSystem.theme.typography.defaultFontFamily
import core.designSystem.theme.typography.defaultTypography
import core.designSystem.theme.typography.model.AppTypographyModel

@Composable
public fun AppTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit,
) {
  val jakartaSansFamily = defaultFontFamily()

  val appTypography = AppTypographyModel(AppTypographyTokens((jakartaSansFamily)))
  val appColorScheme = if (darkTheme) {
    AppColorSchemeModel.darkColorScheme()
  } else {
    AppColorSchemeModel.lightColorScheme()
  }

  CompositionLocalProvider(
    LocalColorScheme provides appColorScheme,
    LocalTypography provides appTypography,
  ) {
    MaterialTheme(
      colorScheme = defaultColorScheme(darkTheme),
      typography = defaultTypography(jakartaSansFamily),
      content = content,
    )
  }
}
