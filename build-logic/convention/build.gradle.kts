plugins {
    `kotlin-dsl`
}

group = "com.jddev.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.firebase.crashlytics.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "jddev.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose") {
            id = "jddev.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }

        register("androidLibrary") {
            id = "jddev.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "jddev.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }

        register("androidFeatureCompose") {
            id = "jddev.android.feature.compose"
            implementationClass = "AndroidFeatureComposeConventionPlugin"
        }

        register("androidRoom") {
            id = "jddev.android.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }

        register("androidHilt") {
            id = "jddev.android.hilt"
            implementationClass = "AndroidHiltConventionPlugin"
        }

        register("androidFirebase") {
            id = "jddev.android.application.firebase"
            implementationClass = "AndroidApplicationFirebaseConventionPlugin"
        }

        register("androidRetrofit") {
            id = "jddev.android.retrofit"
            implementationClass = "AndroidRetrofitConventionPlugin"
        }

        register("jvmLibrary") {
            id = "jddev.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
    }
}
