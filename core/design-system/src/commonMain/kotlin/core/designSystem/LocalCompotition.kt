package core.designSystem

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import core.designSystem.theme.color.AppColorScheme

public val LocalColorScheme: ProvidableCompositionLocal<AppColorScheme> =
  staticCompositionLocalOf { AppColorScheme() }
