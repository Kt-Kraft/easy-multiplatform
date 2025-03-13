package core.designSystem.theme.shape

import CornerRadius
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes

public val shapes: Shapes = Shapes(
  extraSmall = RoundedCornerShape(CornerRadius.extraSmall),
  small = RoundedCornerShape(CornerRadius.small),
  medium = RoundedCornerShape(CornerRadius.medium),
  large = RoundedCornerShape(CornerRadius.large),
  extraLarge = RoundedCornerShape(CornerRadius.extraLarge),
)
