package feature.payment.screen.dashboard

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
public fun DashboardDestination(
  navController: NavController,
  viewModel: DashboardViewModel = viewModel { DashboardViewModel() },
) {
  DashboardScreen(navController)
}
