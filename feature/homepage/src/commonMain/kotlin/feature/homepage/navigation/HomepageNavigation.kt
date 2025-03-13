package feature.homepage.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import feature.homepage.navigation.components.dashboardNavigation

public fun NavGraphBuilder.homepageNavigation(navController: NavController) {
  dashboardNavigation(navController)
}
