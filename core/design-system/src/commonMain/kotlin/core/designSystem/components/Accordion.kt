package core.designSystem.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterExitState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import core.designSystem.foundation.ripple

@Composable
public fun Accordion(
  modifier: Modifier = Modifier,
  headerModifier: Modifier = Modifier,
  state: AccordionState = rememberAccordionState(),
  animate: Boolean = true,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
  headerContent: @Composable () -> Unit,
  bodyContent: @Composable () -> Unit,
) {
  val expanded = state.expanded

  val clickableModifier =
    if (state.clickable) {
      Modifier.clickable(
        enabled = state.enabled,
        interactionSource = interactionSource,
        indication = ripple(),
        onClick = { state.toggle() },
      )
    } else {
      Modifier
    }

  Column(modifier = modifier) {
    Box(
      modifier =
        Modifier
          .fillMaxWidth()
          .semantics {
            role = Role.Button
            stateDescription = if (expanded) "Expanded" else "Collapsed"
          }
          .then(headerModifier)
          .then(clickableModifier),
    ) {
      headerContent()
    }

    if (animate) {
      AnimatedVisibility(
        visible = expanded,
        enter = expandVertically(),
        exit = shrinkVertically(),
      ) {
        val progress by transition.animateFloat(label = "accordion transition") { state ->
          if (state == EnterExitState.Visible) 1f else 0f
        }

        state.updateProgress(progress)

        bodyContent()
      }
    } else {
      if (expanded) {
        bodyContent()
      }
    }
  }
}

@Composable
public fun rememberAccordionState(
  expanded: Boolean = false,
  enabled: Boolean = true,
  clickable: Boolean = true,
  onExpandedChange: ((Boolean) -> Unit)? = null,
): AccordionState = remember {
  AccordionState(expanded, enabled, clickable, onExpandedChange)
}

public class AccordionState(
  expanded: Boolean = false,
  public var enabled: Boolean = true,
  public var clickable: Boolean = true,
  public var onExpandedChange: ((Boolean) -> Unit)? = null,
) {
  public var expanded: Boolean by mutableStateOf(expanded)
    private set

  public var animationProgress: Float by mutableFloatStateOf(0f)
    private set

  public fun toggle() {
    if (!enabled) return
    expanded = !expanded
    onExpandedChange?.invoke(expanded)
  }

  public fun updateProgress(progress: Float) {
    animationProgress = progress
  }

  public fun collapse() {
    expanded = false
  }
}

@Composable
public fun rememberAccordionGroupState(
  count: Int,
  allowMultipleOpen: Boolean = false,
): AccordionGroupState {
  return remember { AccordionGroupState(count, allowMultipleOpen) }
}

public class AccordionGroupState(
  count: Int,
  private val allowMultipleOpen: Boolean,
) {
  private val states = List(count) { AccordionState() }
  private var openedIndex by mutableIntStateOf(-1)

  public fun getState(index: Int): AccordionState {
    val state = states[index]
    state.onExpandedChange = { isExpanded ->
      if (allowMultipleOpen) {
        if (!isExpanded && openedIndex == index) {
          openedIndex = -1
        }
      } else {
        if (isExpanded) {
          openedIndex = index
          states.forEachIndexed { i, otherState ->
            if (i != index) otherState.collapse()
          }
        } else if (openedIndex == index) {
          openedIndex = -1
        }
      }
    }
    return state
  }

  public fun collapseAll() {
    states.forEach { it.collapse() }
    openedIndex = -1
  }

  public fun expand(index: Int) {
    if (index in states.indices) {
      states[index].toggle()
    }
  }
}
