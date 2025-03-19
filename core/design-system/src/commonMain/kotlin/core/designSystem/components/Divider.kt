package core.designSystem.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import core.designSystem.AppTheme

@Composable
public fun HorizontalDivider(
  modifier: Modifier = Modifier,
  thickness: Dp = DividerDefaults.Thickness,
  color: Color = DividerDefaults.color,
): Unit = Canvas(
  modifier
    .fillMaxWidth()
    .height(thickness),
) {
  drawLine(
    color = color,
    strokeWidth = thickness.toPx(),
    start = Offset(0f, thickness.toPx() / 2),
    end = Offset(size.width, thickness.toPx() / 2),
  )
}

@Composable
public fun VerticalDivider(
  modifier: Modifier = Modifier,
  thickness: Dp = DividerDefaults.Thickness,
  color: Color = DividerDefaults.color,
): Unit = Canvas(
  modifier
    .fillMaxHeight()
    .width(thickness),
) {
  drawLine(
    color = color,
    strokeWidth = thickness.toPx(),
    start = Offset(thickness.toPx() / 2, 0f),
    end = Offset(thickness.toPx() / 2, size.height),
  )
}

public object DividerDefaults {
  public val Thickness: Dp = 1.dp
  public val color: Color @Composable get() = AppTheme.colors.surface
}
