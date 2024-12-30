package feature.homepage.screen.dashboard

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
public fun DashboardDestination(
  viewModel: DashboardViewModel = viewModel { DashboardViewModel() },
) {
  DashboardScreen()
}
