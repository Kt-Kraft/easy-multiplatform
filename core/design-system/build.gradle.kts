plugins {
  alias(libs.plugins.jetbrains.compose)
  alias(libs.plugins.convention.compose.lib)
  alias(libs.plugins.convention.multiplatform)
}

android {
  namespace = "core.designSystem"
}

kotlin {
  sourceSets {
    commonMain.dependencies {
      // Others
      implementation(compose.ui)
      implementation(compose.runtime)
      implementation(compose.foundation)
      implementation(compose.material3)
      implementation(compose.components.resources)
    }
  }
}

compose.resources {
  publicResClass = false
  packageOfResClass = "core.designSystem.resources"
  generateResClass = auto
}
