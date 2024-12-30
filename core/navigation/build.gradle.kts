plugins {
  alias(libs.plugins.jetbrains.compose)
  alias(libs.plugins.convention.compose.lib)
  alias(libs.plugins.convention.multiplatform)
  alias(libs.plugins.kotlin.serialization)

}

android {
  namespace = "core.navigation"
}

kotlin {
  sourceSets {
    commonMain.dependencies {
      // Others
      implementation(compose.ui)
      implementation(compose.runtime)
      implementation(compose.foundation)
      implementation(compose.material3)

      implementation(libs.jetbrains.navigation.compose)
      implementation(libs.kotlinx.serialization.json)
    }
  }
}
