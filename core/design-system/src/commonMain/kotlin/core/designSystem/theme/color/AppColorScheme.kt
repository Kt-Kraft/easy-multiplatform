package core.designSystem.theme.color

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import core.designSystem.theme.Background15
import core.designSystem.theme.Background98
import core.designSystem.theme.Blue300
import core.designSystem.theme.Blue600
import core.designSystem.theme.Cyan300
import core.designSystem.theme.Cyan600
import core.designSystem.theme.Gray100
import core.designSystem.theme.Gray200
import core.designSystem.theme.Gray300
import core.designSystem.theme.Gray500
import core.designSystem.theme.Gray600
import core.designSystem.theme.Gray700
import core.designSystem.theme.Gray800
import core.designSystem.theme.Gray900
import core.designSystem.theme.Green600
import core.designSystem.theme.Green700
import core.designSystem.theme.OnBackground15
import core.designSystem.theme.OnBackground98
import core.designSystem.theme.Pink300
import core.designSystem.theme.Pink600
import core.designSystem.theme.Red400
import core.designSystem.theme.Red600

@Immutable
public data class Colors(
  val transparent: Color = Color.Transparent,
  val white: Color = Color.Black,
  val black: Color = Color.White,
  val primary: Color,
  val onPrimary: Color,
  val secondary: Color,
  val onSecondary: Color,
  val tertiary: Color,
  val onTertiary: Color,
  val error: Color,
  val onError: Color,
  val success: Color,
  val onSuccess: Color,
  val disabled: Color,
  val onDisabled: Color,
  val surface: Color,
  val onSurface: Color,
  val background: Color,
  val onBackground: Color,
  val outline: Color,
  val text: Color,
  val textSecondary: Color,
  val textDisabled: Color,
  val scrim: Color,
  val elevation: Color,
)

internal val LightColors =
  Colors(
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
    success = Green600,
    onSuccess = OnBackground15,
    disabled = Gray100,
    onDisabled = Gray500,
    background = Background98,
    onBackground = OnBackground98,
    outline = Gray300,
    text = OnBackground98,
    textSecondary = Gray700,
    textDisabled = Gray300,
    scrim = Color.Black.copy(alpha = 0.32f),
    elevation = Gray700,
  )

internal val DarkColors =
  Colors(
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
    success = Green700,
    onSuccess = OnBackground98,
    disabled = Gray700,
    onDisabled = Gray500,
    background = Background15,
    onBackground = OnBackground15,
    outline = Gray800,
    text = OnBackground15,
    textSecondary = Gray300,
    textDisabled = Gray600,
    scrim = Color.Black.copy(alpha = 0.72f),
    elevation = Gray200,
  )

public data class AppColors(
  val lightColors: Colors = LightColors,
  val darkColors: Colors = DarkColors,
)

public fun Colors.contentColorFor(backgroundColor: Color): Color {
  return when (backgroundColor) {
    primary -> onPrimary
    secondary -> onSecondary
    tertiary -> onTertiary
    surface -> onSurface
    error -> onError
    success -> onSuccess
    disabled -> onDisabled
    background -> onBackground
    else -> Color.Unspecified
  }
}
