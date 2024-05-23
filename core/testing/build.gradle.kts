plugins {
    alias(libs.plugins.jddev.android.library)
    alias(libs.plugins.jddev.android.library.compose)
    alias(libs.plugins.jddev.android.hilt)
}

android {
    namespace = "com.jddev.corearch.core.testing"
}

dependencies {
    api(kotlin("test"))
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.turbine)
}
