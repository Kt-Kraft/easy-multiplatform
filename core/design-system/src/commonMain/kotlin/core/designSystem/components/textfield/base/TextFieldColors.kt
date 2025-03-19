package core.designSystem.components.textfield.base

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse

@Immutable
public class TextFieldColors(
  public val focusedTextColor: Color,
  public val unfocusedTextColor: Color,
  public val disabledTextColor: Color,
  public val errorTextColor: Color,
  public val focusedContainerColor: Color,
  public val unfocusedContainerColor: Color,
  public val disabledContainerColor: Color,
  public val errorContainerColor: Color,
  public val cursorColor: Color,
  public val errorCursorColor: Color,
  public val textSelectionColors: TextSelectionColors,
  public val focusedOutlineColor: Color,
  public val unfocusedOutlineColor: Color,
  public val disabledOutlineColor: Color,
  public val errorOutlineColor: Color,
  public val focusedLeadingIconColor: Color,
  public val unfocusedLeadingIconColor: Color,
  public val disabledLeadingIconColor: Color,
  public val errorLeadingIconColor: Color,
  public val focusedTrailingIconColor: Color,
  public val unfocusedTrailingIconColor: Color,
  public val disabledTrailingIconColor: Color,
  public val errorTrailingIconColor: Color,
  public val focusedLabelColor: Color,
  public val unfocusedLabelColor: Color,
  public val disabledLabelColor: Color,
  public val errorLabelColor: Color,
  public val focusedPlaceholderColor: Color,
  public val unfocusedPlaceholderColor: Color,
  public val disabledPlaceholderColor: Color,
  public val errorPlaceholderColor: Color,
  public val focusedSupportingTextColor: Color,
  public val unfocusedSupportingTextColor: Color,
  public val disabledSupportingTextColor: Color,
  public val errorSupportingTextColor: Color,
  public val focusedPrefixColor: Color,
  public val unfocusedPrefixColor: Color,
  public val disabledPrefixColor: Color,
  public val errorPrefixColor: Color,
  public val focusedSuffixColor: Color,
  public val unfocusedSuffixColor: Color,
  public val disabledSuffixColor: Color,
  public val errorSuffixColor: Color,
) {
  public fun copy(
    focusedTextColor: Color = this.focusedTextColor,
    unfocusedTextColor: Color = this.unfocusedTextColor,
    disabledTextColor: Color = this.disabledTextColor,
    errorTextColor: Color = this.errorTextColor,
    focusedContainerColor: Color = this.focusedContainerColor,
    unfocusedContainerColor: Color = this.unfocusedContainerColor,
    disabledContainerColor: Color = this.disabledContainerColor,
    errorContainerColor: Color = this.errorContainerColor,
    cursorColor: Color = this.cursorColor,
    errorCursorColor: Color = this.errorCursorColor,
    textSelectionColors: TextSelectionColors? = this.textSelectionColors,
    focusedOutlineColor: Color = this.errorOutlineColor,
    unfocusedOutlineColor: Color = this.errorOutlineColor,
    disabledOutlineColor: Color = this.errorOutlineColor,
    errorOutlineColor: Color = this.errorOutlineColor,
    focusedLeadingIconColor: Color = this.focusedLeadingIconColor,
    unfocusedLeadingIconColor: Color = this.unfocusedLeadingIconColor,
    disabledLeadingIconColor: Color = this.disabledLeadingIconColor,
    errorLeadingIconColor: Color = this.errorLeadingIconColor,
    focusedTrailingIconColor: Color = this.focusedTrailingIconColor,
    unfocusedTrailingIconColor: Color = this.unfocusedTrailingIconColor,
    disabledTrailingIconColor: Color = this.disabledTrailingIconColor,
    errorTrailingIconColor: Color = this.errorTrailingIconColor,
    focusedLabelColor: Color = this.focusedLabelColor,
    unfocusedLabelColor: Color = this.unfocusedLabelColor,
    disabledLabelColor: Color = this.disabledLabelColor,
    errorLabelColor: Color = this.errorLabelColor,
    focusedPlaceholderColor: Color = this.focusedPlaceholderColor,
    unfocusedPlaceholderColor: Color = this.unfocusedPlaceholderColor,
    disabledPlaceholderColor: Color = this.disabledPlaceholderColor,
    errorPlaceholderColor: Color = this.errorPlaceholderColor,
    focusedSupportingTextColor: Color = this.focusedSupportingTextColor,
    unfocusedSupportingTextColor: Color = this.unfocusedSupportingTextColor,
    disabledSupportingTextColor: Color = this.disabledSupportingTextColor,
    errorSupportingTextColor: Color = this.errorSupportingTextColor,
    focusedPrefixColor: Color = this.focusedPrefixColor,
    unfocusedPrefixColor: Color = this.unfocusedPrefixColor,
    disabledPrefixColor: Color = this.disabledPrefixColor,
    errorPrefixColor: Color = this.errorPrefixColor,
    focusedSuffixColor: Color = this.focusedSuffixColor,
    unfocusedSuffixColor: Color = this.unfocusedSuffixColor,
    disabledSuffixColor: Color = this.disabledSuffixColor,
    errorSuffixColor: Color = this.errorSuffixColor,
  ): TextFieldColors = TextFieldColors(
    focusedTextColor.takeOrElse { this.focusedTextColor },
    unfocusedTextColor.takeOrElse { this.unfocusedTextColor },
    disabledTextColor.takeOrElse { this.disabledTextColor },
    errorTextColor.takeOrElse { this.errorTextColor },
    focusedContainerColor.takeOrElse { this.focusedContainerColor },
    unfocusedContainerColor.takeOrElse { this.unfocusedContainerColor },
    disabledContainerColor.takeOrElse { this.disabledContainerColor },
    errorContainerColor.takeOrElse { this.errorContainerColor },
    cursorColor.takeOrElse { this.cursorColor },
    errorCursorColor.takeOrElse { this.errorCursorColor },
    textSelectionColors.takeOrElse { this.textSelectionColors },
    focusedLeadingIconColor.takeOrElse { this.focusedLeadingIconColor },
    unfocusedLeadingIconColor.takeOrElse { this.unfocusedLeadingIconColor },
    disabledLeadingIconColor.takeOrElse { this.disabledLeadingIconColor },
    errorLeadingIconColor.takeOrElse { this.errorLeadingIconColor },
    focusedTrailingIconColor.takeOrElse { this.focusedTrailingIconColor },
    unfocusedTrailingIconColor.takeOrElse { this.unfocusedTrailingIconColor },
    disabledTrailingIconColor.takeOrElse { this.disabledTrailingIconColor },
    errorTrailingIconColor.takeOrElse { this.errorTrailingIconColor },
    focusedOutlineColor.takeOrElse { this.focusedOutlineColor },
    unfocusedOutlineColor.takeOrElse { this.unfocusedOutlineColor },
    disabledOutlineColor.takeOrElse { this.disabledOutlineColor },
    errorOutlineColor.takeOrElse { this.errorOutlineColor },
    focusedLabelColor.takeOrElse { this.focusedLabelColor },
    unfocusedLabelColor.takeOrElse { this.unfocusedLabelColor },
    disabledLabelColor.takeOrElse { this.disabledLabelColor },
    errorLabelColor.takeOrElse { this.errorLabelColor },
    focusedPlaceholderColor.takeOrElse { this.focusedPlaceholderColor },
    unfocusedPlaceholderColor.takeOrElse { this.unfocusedPlaceholderColor },
    disabledPlaceholderColor.takeOrElse { this.disabledPlaceholderColor },
    errorPlaceholderColor.takeOrElse { this.errorPlaceholderColor },
    focusedSupportingTextColor.takeOrElse { this.focusedSupportingTextColor },
    unfocusedSupportingTextColor.takeOrElse { this.unfocusedSupportingTextColor },
    disabledSupportingTextColor.takeOrElse { this.disabledSupportingTextColor },
    errorSupportingTextColor.takeOrElse { this.errorSupportingTextColor },
    focusedPrefixColor.takeOrElse { this.focusedPrefixColor },
    unfocusedPrefixColor.takeOrElse { this.unfocusedPrefixColor },
    disabledPrefixColor.takeOrElse { this.disabledPrefixColor },
    errorPrefixColor.takeOrElse { this.errorPrefixColor },
    focusedSuffixColor.takeOrElse { this.focusedSuffixColor },
    unfocusedSuffixColor.takeOrElse { this.unfocusedSuffixColor },
    disabledSuffixColor.takeOrElse { this.disabledSuffixColor },
    errorSuffixColor.takeOrElse { this.errorSuffixColor },
  )

  private fun TextSelectionColors?.takeOrElse(block: () -> TextSelectionColors): TextSelectionColors = this ?: block()

  @Composable
  internal fun leadingIconColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledLeadingIconColor
        isError -> errorLeadingIconColor
        focused -> focusedLeadingIconColor
        else -> unfocusedLeadingIconColor
      },
    )
  }

  @Composable
  internal fun trailingIconColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledTrailingIconColor
        isError -> errorTrailingIconColor
        focused -> focusedTrailingIconColor
        else -> unfocusedTrailingIconColor
      },
    )
  }

  @Composable
  internal fun labelColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledLabelColor
        isError -> errorLabelColor
        focused -> focusedLabelColor
        else -> unfocusedLabelColor
      },
    )
  }

  @Composable
  internal fun placeholderColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledPlaceholderColor
        isError -> errorPlaceholderColor
        focused -> focusedPlaceholderColor
        else -> unfocusedPlaceholderColor
      },
    )
  }

  @Composable
  internal fun supportingTextColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledSupportingTextColor
        isError -> errorSupportingTextColor
        focused -> focusedSupportingTextColor
        else -> unfocusedSupportingTextColor
      },
    )
  }

  @Composable
  internal fun prefixColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledPrefixColor
        isError -> errorPrefixColor
        focused -> focusedPrefixColor
        else -> unfocusedPrefixColor
      },
    )
  }

  @Composable
  internal fun suffixColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledSuffixColor
        isError -> errorSuffixColor
        focused -> focusedSuffixColor
        else -> unfocusedSuffixColor
      },
    )
  }

  @Composable
  internal fun containerColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledContainerColor
        isError -> errorContainerColor
        focused -> focusedContainerColor
        else -> unfocusedContainerColor
      },
    )
  }

  @Composable
  internal fun containerOutlineColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()
    return rememberUpdatedState(
      when {
        !enabled -> disabledOutlineColor
        isError -> errorOutlineColor
        focused -> focusedOutlineColor
        else -> unfocusedOutlineColor
      },
    )
  }

  @Composable
  internal fun textColor(
    enabled: Boolean,
    isError: Boolean,
    interactionSource: InteractionSource,
  ): State<Color> {
    val focused by interactionSource.collectIsFocusedAsState()

    return rememberUpdatedState(
      when {
        !enabled -> disabledTextColor
        isError -> errorTextColor
        focused -> focusedTextColor
        else -> unfocusedTextColor
      },
    )
  }

  @Composable
  internal fun cursorColor(isError: Boolean): State<Color> {
    return rememberUpdatedState(if (isError) errorCursorColor else cursorColor)
  }

  internal val selectionColors: TextSelectionColors
    @Composable get() = textSelectionColors
}
