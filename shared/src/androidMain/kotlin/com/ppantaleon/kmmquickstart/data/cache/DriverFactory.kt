package com.ppantaleon.kmmquickstart.data.cache

import android.content.Context
import com.ppantaleon.kmmquickstart.datasource.cache.KmmQuickStartDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DriverFactory(private val context: Context) {

    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(KmmQuickStartDatabase.Schema, context, "movie_reviews.db")
    }
}