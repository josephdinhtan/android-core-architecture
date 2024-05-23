plugins {
    alias(libs.plugins.jddev.android.library)
    alias(libs.plugins.jddev.android.library.jacoco)
    alias(libs.plugins.jddev.android.hilt)
    alias(libs.plugins.jddev.android.room)
}

android {
    namespace = "com.jddev.corearch.core.database"
}

dependencies {
//    api(projects.core.model)

    implementation(libs.kotlinx.datetime)

    androidTestImplementation(projects.core.testing)
}
