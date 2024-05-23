package com.jddev.corearch.core.network

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val coreArchDispatcher: CoreArchDispatcher)

enum class CoreArchDispatcher {
    Default,
    IO,
}
