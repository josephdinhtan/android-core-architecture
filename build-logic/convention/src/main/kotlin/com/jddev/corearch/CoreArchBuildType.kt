package com.jddev.corearch

/**
 * This is shared between :app and :benchmarks module to provide configurations type safety.
 */
enum class CoreArchBuildType(val applicationIdSuffix: String? = null) {
    DEBUG(".debug"),
    RELEASE,
}
