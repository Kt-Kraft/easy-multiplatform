package core.designSystem.theme.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

public val MaterialDarkColorScheme: ColorScheme = darkColorScheme(
  primary = blue5,
  onPrimary = neutral0,
  surface = neutral10,
)

public val MaterialLightColorScheme: ColorScheme = lightColorScheme(
  primary = blue5,
  onPrimary = neutral0,
  surface = neutral0,
)

@Composable
internal fun defaultColorScheme(isDarkTheme: Boolean): ColorScheme = if (isDarkTheme) {
  MaterialDarkColorScheme
} else {
  MaterialLightColorScheme
}
