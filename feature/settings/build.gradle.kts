plugins {
    alias(libs.plugins.jddev.android.feature)
    alias(libs.plugins.jddev.android.library.compose)
    alias(libs.plugins.jddev.android.library.jacoco)
}

android {
    namespace = "com.jddev.corearch.feature.settings"
}

dependencies {
    implementation(libs.androidx.appcompat)
}
