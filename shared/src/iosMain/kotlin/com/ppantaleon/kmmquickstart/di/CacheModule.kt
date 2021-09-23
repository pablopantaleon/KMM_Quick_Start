package com.ppantaleon.kmmquickstart.di

import com.ppantaleon.kmmquickstart.data.cache.DriverFactory
import com.ppantaleon.kmmquickstart.data.cache.MovieReviewCache
import com.ppantaleon.kmmquickstart.data.cache.MovieReviewCacheImpl
import com.ppantaleon.kmmquickstart.data.cache.MovieReviewDatabaseFactory
import com.ppantaleon.kmmquickstart.datasource.cache.KmmQuickStartDatabase

class CacheModule {

    private val driverFactory: DriverFactory by lazy {
        DriverFactory()
    }
    val database: KmmQuickStartDatabase by lazy {
        MovieReviewDatabaseFactory(driverFactory = driverFactory).createDatabase()
    }
    val movieCache: MovieReviewCache by lazy {
        MovieReviewCacheImpl(database = database)
    }
}








