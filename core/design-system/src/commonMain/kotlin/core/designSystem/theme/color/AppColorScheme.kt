package core.designSystem.theme.color

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
public data class AppColorScheme(
  val brandColor: Color = brandColorLight,
  val backgroundPrimary: Color = backgroundPrimaryLight,
  val backgroundSecondary: Color = backgroundSecondaryLight,
  val backgroundTertiary: Color = backgroundTertiaryLight,
  val surfacePrimary: Color = surfacePrimaryLight,
  val surfaceSecondary: Color = surfaceSecondaryLight,
  val surfaceWarning: Color = surfaceWarningLight,
  val surfaceCritical: Color = surfaceCriticalLight,
  val surfaceInverse: Color = surfaceInverseLight,
  val textPrimary: Color = textPrimaryLight,
  val textSecondary: Color = textSecondaryLight,
  val textTertiary: Color = textTertiaryLight,
  val textSubdued: Color = textSubduedLight,
  val textWarning: Color = textWarningLight,
  val textCritical: Color = textCriticalLight,
  val textInverse: Color = textInverseLight,
  val borderPrimary: Color = borderPrimaryLight,
  val borderSecondary: Color = borderSecondaryLight,
  val borderTertiary: Color = borderTertiaryLight,
  val borderSelected: Color = borderSelectedLight,
  val borderWarning: Color = borderWarningLight,
  val borderCritical: Color = borderCriticalLight,
  val interactiveDefault: Color = interactiveDefaultLight,
  val interactiveEnabled: Color = interactiveEnabledLight,
  val interactiveHover: Color = interactiveHoverLight,
  val interactivePressed: Color = interactivePressedLight,
  val interactiveSelected: Color = interactiveSelectedLight,
  val interactiveCritical: Color = interactiveCriticalLight,
  val interactiveCriticalSubdued: Color = interactiveCriticalSubduedLight,
  val interactiveDisabled: Color = interactiveDisabledLight,
  val interactiveDisabledSubdued: Color = interactiveDisabledSubduedLight,
  val statusSuccess: Color = statusSuccessLight,
  val statusWarning: Color = statusWarningLight,
  val statusError: Color = statusErrorLight,
  val decorativeBlue: Color = decorativeBlueLight,
  val decorativeBlueVariant: Color = decorativeBlueVariantLight,
  val decorativeRed: Color = decorativeRedLight,
  val decorativeRedVariant: Color = decorativeRedVariantLight,
  val decorativeYellow: Color = decorativeYellowLight,
  val decorativeYellowVariant: Color = decorativeYellowVariantLight,
) {
  public companion object {
    public fun lightColorScheme(): AppColorScheme {
      return AppColorScheme()
    }

    public fun darkColorScheme(): AppColorScheme {
      return AppColorScheme(
        brandColorDark,
        backgroundPrimaryDark,
        backgroundSecondaryDark,
        backgroundTertiaryDark,
        surfacePrimaryDark,
        surfaceSecondaryDark,
        surfaceWarningDark,
        surfaceCriticalDark,
        surfaceInverseDark,
        textPrimaryDark,
        textSecondaryDark,
        textTertiaryDark,
        textSubduedDark,
        textWarningDark,
        textCriticalDark,
        textInverseDark,
        borderPrimaryDark,
        borderSecondaryDark,
        borderTertiaryDark,
        borderSelectedDark,
        borderWarningDark,
        borderCriticalDark,
        interactiveDefaultDark,
        interactiveEnabledDark,
        interactiveHoverDark,
        interactivePressedDark,
        interactiveSelectedDark,
        interactiveCriticalDark,
        interactiveCriticalSubduedDark,
        interactiveDisabledDark,
        interactiveDisabledSubduedDark,
        statusSuccessDark,
        statusWarningDark,
        statusErrorDark,
        decorativeBlueDark,
        decorativeBlueVariantDark,
        decorativeRedDark,
        decorativeRedVariantDark,
        decorativeYellowDark,
        decorativeYellowVariantDark,
      )
    }
  }
}
