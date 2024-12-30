import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.android.library) apply false
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.convention.android.app) apply false
  alias(libs.plugins.convention.android.lib) apply false
  alias(libs.plugins.convention.compose.app) apply false
  alias(libs.plugins.convention.compose.lib) apply false
  alias(libs.plugins.kotlin.multiplatform) apply false
  alias(libs.plugins.convention.multiplatform) apply false
  alias(libs.plugins.jetbrains.compose) apply false
  alias(libs.plugins.convention.publishing) apply false
  alias(libs.plugins.convention.publish.config) apply false
  alias(libs.plugins.kotlin.ksp) apply false
  alias(libs.plugins.kotlinCocoapods) apply false
  alias(libs.plugins.convention.android.config)
  alias(libs.plugins.convention.multiplatform.config)
  alias(libs.plugins.ben.manes.versions)
  alias(libs.plugins.version.catalog.update)
  alias(libs.plugins.convention.commitlint)
}

convention {
  multiplatform {
    android.set(true)
    iOS.set(true)
  }
}

versionCatalogUpdate {
  sortByKey.set(true)
  keep {
    keepUnusedVersions.set(true)
    keepUnusedLibraries.set(true)
    keepUnusedPlugins.set(true)
  }
}

fun isNonStable(version: String): Boolean {
  val stableKeywords = listOf("RELEASE", "FINAL", "GA")
  val regex = Regex("^[0-9,.v-]+(-r)?$")
  return stableKeywords.none { it in version.uppercase() } && !regex.matches(version)
}

tasks.withType<DependencyUpdatesTask> {
  rejectVersionIf {
    isNonStable(candidate.version)
  }
}
