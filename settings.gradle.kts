pluginManagement {
    includeBuild("build-logic")
    repositories {
        google ()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndroidCoreArchitecture"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":core:data")
include(":core:database")
include(":core:model")
include(":core:ui")
include(":core:notifications")
include(":core:network")
include(":core:testing")
include(":core:datastore")
include(":core:datastore-proto")
include(":core:common")

include(":feature:settings")
include(":core:designsystem")
