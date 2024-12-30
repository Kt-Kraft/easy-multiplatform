plugins {
  alias(libs.plugins.jetbrains.compose)
  alias(libs.plugins.convention.compose.lib)
  alias(libs.plugins.convention.multiplatform)
}

android {
  namespace = "core.common"
}

kotlin {
  sourceSets {
    commonMain.dependencies {
      // Others
      implementation(compose.ui)
      implementation(compose.runtime)
      implementation(compose.foundation)
      implementation(compose.material3)
    }
  }
}
