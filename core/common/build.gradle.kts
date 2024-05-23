plugins {
    alias(libs.plugins.jddev.android.library)
    alias(libs.plugins.jddev.android.library.jacoco)
    alias(libs.plugins.jddev.android.hilt)
}

android {
    namespace = "com.jddev.corearch.core.common"
}

dependencies {
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.turbine)
}
