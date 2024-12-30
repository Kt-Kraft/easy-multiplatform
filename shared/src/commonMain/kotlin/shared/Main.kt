package shared

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import core.designSystem.AppTheme
import core.navigation.Screen
import shared.navigation.MainNavGraph

@Composable
public fun Main() {
  val navController = rememberNavController()
  AppTheme {
    MainNavGraph(
      navController = navController,
      startDestination = Screen.Homepage
    )
  }
}
