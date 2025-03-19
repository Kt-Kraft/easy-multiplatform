package core.designSystem.theme.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import core.designSystem.theme.Background15
import core.designSystem.theme.Background98
import core.designSystem.theme.Blue300
import core.designSystem.theme.Blue600
import core.designSystem.theme.Cyan300
import core.designSystem.theme.Cyan600
import core.designSystem.theme.Gray200
import core.designSystem.theme.Gray300
import core.designSystem.theme.Gray800
import core.designSystem.theme.Gray900
import core.designSystem.theme.OnBackground15
import core.designSystem.theme.OnBackground98
import core.designSystem.theme.Pink300
import core.designSystem.theme.Pink600
import core.designSystem.theme.Red400
import core.designSystem.theme.Red600

public val MaterialLightColorScheme: ColorScheme = lightColorScheme(
  primary = Pink600,
  onPrimary = OnBackground15,
  secondary = Cyan600,
  onSecondary = OnBackground15,
  tertiary = Blue600,
  onTertiary = OnBackground15,
  surface = Gray200,
  onSurface = OnBackground98,
  error = Red600,
  onError = OnBackground15,
  primaryContainer = Background98,
  onPrimaryContainer = OnBackground98,
  secondaryContainer = Background98,
  onSecondaryContainer = OnBackground98,
  tertiaryContainer = Background98,
  onTertiaryContainer = OnBackground98,
  errorContainer = Background98,
  onErrorContainer = OnBackground98,
  outline = Gray300,
  scrim = Color.Black.copy(alpha = 0.32f),
)

public val MaterialDarkColorScheme: ColorScheme = darkColorScheme(
  primary = Pink300,
  onPrimary = OnBackground98,
  secondary = Cyan300,
  onSecondary = OnBackground98,
  tertiary = Blue300,
  onTertiary = OnBackground98,
  surface = Gray900,
  onSurface = OnBackground15,
  error = Red400,
  onError = OnBackground98,
  primaryContainer = Background15,
  onPrimaryContainer = OnBackground15,
  secondaryContainer = Background15,
  onSecondaryContainer = OnBackground15,
  tertiaryContainer = Background15,
  onTertiaryContainer = OnBackground15,
  errorContainer = Background15,
  onErrorContainer = OnBackground15,
  outline = Gray800,
  scrim = Color.Black.copy(alpha = 0.72f),
)
