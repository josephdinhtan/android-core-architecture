plugins {
    alias(libs.plugins.jddev.android.application)
    alias(libs.plugins.jddev.android.hilt)
    alias(libs.plugins.jddev.android.application.compose)
}

android {
    namespace = "com.jddev.corearchitecture"

    defaultConfig {
        applicationId = "com.jddev.corearchitecture"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.compose.activity)
    implementation(libs.androidx.compose.navigation)
    implementation(libs.androidx.compose.hilt.navigation)
    implementation(libs.androidx.compose.bom)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.lifecycle.viewModelCompose)

    implementation(libs.androidx.corektx)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)

    testImplementation(libs.test.junit)
    androidTestImplementation(libs.test.extjunit)
    androidTestImplementation(libs.test.espresso)
    androidTestImplementation(libs.test.compose.ui.junit)
    debugImplementation(libs.androidx.compose.ui.manifest)
}
