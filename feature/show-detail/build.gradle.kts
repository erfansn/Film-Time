plugins {
  id("io.filmtime.gradle.android.feature")
  id("io.filmtime.gradle.android.library.compose")
}

android {
  namespace = "io.filmtime.feature.show.detail"
}

dependencies {
  implementation(project(":core:browser"))
  implementation(project(":data:model"))
  implementation(project(":domain:tmdb-shows"))

  implementation(project(":domain:bookmarks"))
  implementation(project(":domain:trakt:trakt"))
  implementation(project(":domain:trakt:history"))

  implementation(project(":feature:credits"))
  implementation(project(":feature:similar"))
}
