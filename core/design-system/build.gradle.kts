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
      api(compose.ui)
      api(compose.runtime)
      api(compose.foundation)
      api(compose.material3)
      api(compose.components.resources)
      api(compose.components.uiToolingPreview)
      api(libs.androidx.lifecycle.runtime.multiplatform)
      api(libs.nomanr.composables)
    }
  }
}

compose.resources {
  publicResClass = false
  packageOfResClass = "core.designSystem.resources"
  generateResClass = auto
}
