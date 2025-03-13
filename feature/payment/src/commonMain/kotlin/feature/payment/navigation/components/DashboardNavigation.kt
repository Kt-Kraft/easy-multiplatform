package feature.payment.navigation.components

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import core.navigation.Screen
import core.navigation.enterPop
import core.navigation.enterPush
import core.navigation.exitPop
import core.navigation.exitPush
import feature.payment.screen.dashboard.DashboardDestination

internal fun NavGraphBuilder.dashboardNavigation(navController: NavController) {
  composable<Screen.Payment>(
    popEnterTransition = enterPop,
    enterTransition = enterPush,
    popExitTransition = exitPop,
    exitTransition = exitPush,
  ) {
    DashboardDestination(navController)
  }
}
