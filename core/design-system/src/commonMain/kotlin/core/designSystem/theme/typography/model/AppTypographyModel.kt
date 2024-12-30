package core.designSystem.theme.typography.model

import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import core.designSystem.theme.typography.AppTypographyTokens

@Immutable
public data class AppTypographyModel(val tokens: AppTypographyTokens) {
  val metadata10Bold: TextStyle = tokens.metadata10Bold
  val metadata10Regular: TextStyle = tokens.metadata10Regular
  val metadata12Bold: TextStyle = tokens.metadata12Bold
  val metadata12Regular: TextStyle = tokens.metadata12Regular
  val body14ExtraBold: TextStyle = tokens.body14ExtraBold
  val body14Bold: TextStyle = tokens.body14Bold
  val body14Regular: TextStyle = tokens.body14Regular
  val body16Bold: TextStyle = tokens.body16Bold
  val body16Regular: TextStyle = tokens.body16Regular
  val header18Bold: TextStyle = tokens.header18Bold
  val header18Regular: TextStyle = tokens.header18Regular
}
