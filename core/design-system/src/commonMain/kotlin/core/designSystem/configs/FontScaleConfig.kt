package core.designSystem.configs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import core.designSystem.LocalDefaultColors
import core.designSystem.theme.color.AppColors

@Composable
public expect fun getSystemFontScale(): Float

@Composable
public fun rememberAppConfigState(): AppConfigState {
  val layoutDirection = LocalLayoutDirection.current
  val colors = LocalDefaultColors.current
  val systemFontScale = getSystemFontScale()
  return remember {
    AppConfigState(
      systemFontScale = systemFontScale,
      systemLayoutDirection = layoutDirection,
      defaultColors = colors,
    )
  }
}

public class AppConfigState(
  public val systemFontScale: Float,
  public val systemLayoutDirection: LayoutDirection,
  public val defaultColors: AppColors
) {
  public var fontScale: Float by mutableFloatStateOf(systemFontScale)
    private set
  public var layoutDirection: LayoutDirection by mutableStateOf(systemLayoutDirection)
    private set

  public var colors: AppColors by mutableStateOf(defaultColors)
    private set

  public fun updateFontScale(newScale: Float) {
    fontScale = newScale
  }

  public fun updateLayoutDirection(newDirection: LayoutDirection) {
    layoutDirection = newDirection
  }

  public fun updateColors(newColors: AppColors) {
    colors = newColors
  }

  public fun resetFontScale() {
    fontScale = systemFontScale
  }

  public fun resetColors() {
    colors = defaultColors
  }
}
