package core.designSystem.foundation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import core.designSystem.LocalContentColor
import core.designSystem.LocalTextStyle

@Composable
public fun ProvideTextStyle(value: TextStyle, content: @Composable () -> Unit) {
  val mergedStyle = LocalTextStyle.current.merge(value)
  CompositionLocalProvider(LocalTextStyle provides mergedStyle, content = content)
}

@Composable
internal fun ProvideContentColorTextStyle(
  contentColor: Color,
  textStyle: TextStyle,
  content: @Composable () -> Unit,
) {
  val mergedStyle = LocalTextStyle.current.merge(textStyle)
  CompositionLocalProvider(
    LocalContentColor provides contentColor,
    LocalTextStyle provides mergedStyle,
    content = content,
  )
}
