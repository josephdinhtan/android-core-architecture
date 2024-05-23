plugins {
    alias(libs.plugins.jddev.android.library)
    alias(libs.plugins.jddev.android.library.jacoco)
    alias(libs.plugins.jddev.android.hilt)
}

android {
    defaultConfig {
        consumerProguardFiles("consumer-proguard-rules.pro")
    }
    namespace = "com.jddev.corearch.core.datastore"
    testOptions {
        unitTests {
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    api(libs.androidx.dataStore.core)
    api(projects.core.datastoreProto)
//    api(projects.core.model)
//
//    implementation(projects.core.common)

    testImplementation(libs.kotlinx.coroutines.test)
}
