package core.designSystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import core.designSystem.theme.color.AppColorScheme
import core.designSystem.theme.color.MaterialDarkColorScheme
import core.designSystem.theme.color.MaterialLightColorScheme
import core.designSystem.theme.typography.DefaultTypography

@Composable
public fun AppTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit,
) {
  val appColorScheme = if (darkTheme) {
    AppColorScheme.darkColorScheme()
  } else {
    AppColorScheme.lightColorScheme()
  }

  val materialColorScheme = if (darkTheme) {
    MaterialDarkColorScheme
  } else {
    MaterialLightColorScheme
  }

  CompositionLocalProvider(
    LocalColorScheme provides appColorScheme,
  ) {
    MaterialTheme(
      colorScheme = materialColorScheme,
      typography = DefaultTypography,
      content = content,
    )
  }
}
