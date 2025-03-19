package core.designSystem.configs

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration

@Composable
public actual fun getSystemFontScale(): Float {
  val configurations = LocalConfiguration.current
  return configurations.fontScale
}
