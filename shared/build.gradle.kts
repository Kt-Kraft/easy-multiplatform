plugins {
  alias(libs.plugins.jetbrains.compose)
  alias(libs.plugins.convention.compose.lib)
  alias(libs.plugins.convention.multiplatform)
}

android {
  namespace = "shared"
}

kotlin {
  sourceSets {
    commonMain.dependencies {
      // Projects
      api(projects.core.common)
      api(projects.core.designSystem)
      api(projects.core.domain)
      api(projects.core.navigation)

      api(projects.feature.homepage)

      // Others
      implementation(compose.ui)
      implementation(compose.runtime)
      implementation(compose.foundation)
      implementation(compose.material3)
      implementation(libs.jetbrains.navigation.compose)
    }
  }
}
