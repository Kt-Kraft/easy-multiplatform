plugins {
  alias(libs.plugins.jetbrains.compose)
  alias(libs.plugins.convention.compose.lib)
  alias(libs.plugins.convention.multiplatform)
}

android {
  namespace = "feature.homepage"
}

kotlin {
  sourceSets {
    commonMain.dependencies {
      // Projects
      implementation(projects.core.navigation)

      // Others
      implementation(compose.ui)
      implementation(compose.runtime)
      implementation(compose.foundation)
      implementation(compose.material3)
      implementation(compose.components.resources)

      implementation(libs.jetbrains.navigation.compose)
      implementation(libs.jetbrains.lifecycle.viewmodel.compose)
    }
  }
}
