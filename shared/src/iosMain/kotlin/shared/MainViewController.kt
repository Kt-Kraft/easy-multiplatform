package shared

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

public fun mainViewController(): UIViewController =
  ComposeUIViewController {
    Main()
  }
