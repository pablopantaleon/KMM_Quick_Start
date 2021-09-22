package com.ppantaleon.kmmquickstart.android.di

import com.ppantaleon.kmmquickstart.android.MovieReviewApp
import com.ppantaleon.kmmquickstart.data.cache.DriverFactory
import com.ppantaleon.kmmquickstart.data.cache.MovieReviewCache
import com.ppantaleon.kmmquickstart.data.cache.MovieReviewCacheImpl
import com.ppantaleon.kmmquickstart.data.cache.MovieReviewDatabaseFactory
import com.ppantaleon.kmmquickstart.datasource.cache.KmmQuickStartDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CacheModule {

    @Singleton
    @Provides
    fun provideRecipeDatabase(context: MovieReviewApp): KmmQuickStartDatabase {
        return MovieReviewDatabaseFactory(driverFactory = DriverFactory(context)).createDatabase()
    }

    @Singleton
    @Provides
    fun provideRecipeCache(
        recipeDatabase: KmmQuickStartDatabase,
    ): MovieReviewCache {
        return MovieReviewCacheImpl(
            database = recipeDatabase,
        )
    }
}