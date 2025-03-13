package core.designSystem.theme.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import core.designSystem.theme.blue5
import core.designSystem.theme.neutral0
import core.designSystem.theme.neutral10

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
