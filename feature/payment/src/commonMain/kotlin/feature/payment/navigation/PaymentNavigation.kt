package feature.payment.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import feature.payment.navigation.components.dashboardNavigation

public fun NavGraphBuilder.paymentNavigation(navController: NavController) {
  dashboardNavigation(navController)
}
