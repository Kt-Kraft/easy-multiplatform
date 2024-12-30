plugins {
  alias(libs.plugins.kotlin.android)
  alias(libs.plugins.convention.compose.app)
  alias(libs.plugins.kotlin.ksp)
}

android {
  namespace = "easy.app"

  defaultConfig {
    applicationId = "easy.app"
    versionCode = 1
    versionName = "0.1.0"
  }
}

kotlin {
  explicitApi()
}

dependencies {
  // Projects
  implementation(projects.shared)

  // Others
  implementation(libs.bundles.android.app)
  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.bundles.androidx.compose)
  implementation(platform(libs.koin.bom))
  implementation(libs.koin.core)
  implementation(libs.koin.android)
  implementation(libs.koin.android.compose)
}
