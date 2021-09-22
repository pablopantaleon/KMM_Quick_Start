package com.ppantaleon.kmmquickstart.data.cache

import com.ppantaleon.kmmquickstart.datasource.cache.KmmQuickStartDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DriverFactory {

    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(KmmQuickStartDatabase.Schema, "movie_reviews.db")
    }
}