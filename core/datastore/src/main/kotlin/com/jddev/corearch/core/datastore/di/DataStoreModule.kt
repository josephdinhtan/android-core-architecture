//package com.jddev.corearch.core.datastore.di
//
//import android.content.Context
//import androidx.datastore.core.DataStore
//import androidx.datastore.core.DataStoreFactory
//import androidx.datastore.dataStoreFile
//import com.jddev.corearch.core.network.di.ApplicationScope
//import com.jddev.corearch.core.datastore.UserPreferencesSerializer
//import com.jddev.corearch.core.network.CoreArchDispatcher
//import com.jddev.corearch.core.network.Dispatcher
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.qualifiers.ApplicationContext
//import dagger.hilt.components.SingletonComponent
//import kotlinx.coroutines.CoroutineDispatcher
//import kotlinx.coroutines.CoroutineScope
//import javax.inject.Singleton
//
//@Module
//@InstallIn(SingletonComponent::class)
//object DataStoreModule {
//    @Provides
//    @Singleton
//    internal fun providesUserPreferencesDataStore(
//        @ApplicationContext context: Context,
//        @Dispatcher(CoreArchDispatcher.IO) ioDispatcher: CoroutineDispatcher,
//        @ApplicationScope scope: CoroutineScope,
//        userPreferencesSerializer: UserPreferencesSerializer,
//    ): DataStore<UserPreferences> =
//        DataStoreFactory.create(
//            serializer = userPreferencesSerializer,
//            scope = CoroutineScope(scope.coroutineContext + ioDispatcher),
//        ) {
//            context.dataStoreFile("user_preferences.pb")
//        }
//}
