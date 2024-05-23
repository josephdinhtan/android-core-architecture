plugins {
    alias(libs.plugins.jddev.android.library)
    alias(libs.plugins.jddev.android.library.compose)
    alias(libs.plugins.jddev.android.library.jacoco)
}

android {
    namespace = "com.jddev.corearch.core.ui"
}

dependencies {
    implementation(libs.coil.kt)
    implementation(libs.coil.kt.compose)
}
