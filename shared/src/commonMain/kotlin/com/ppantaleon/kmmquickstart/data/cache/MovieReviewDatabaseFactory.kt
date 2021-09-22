package com.ppantaleon.kmmquickstart.data.cache

import com.ppantaleon.kmmquickstart.datasource.cache.KmmQuickStartDatabase
import com.ppantaleon.kmmquickstart.datasource.cache.Movie_review_Entity
import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import com.squareup.sqldelight.db.SqlDriver

expect class DriverFactory {

    fun createDriver(): SqlDriver
}

class MovieReviewDatabaseFactory(private val driverFactory: DriverFactory) {

    fun createDatabase(): KmmQuickStartDatabase {
        return KmmQuickStartDatabase(driverFactory.createDriver())
    }
}

fun Movie_review_Entity.toMovie(): MovieReview {
    return MovieReview(
        title = title,
        mpaaRating = mpaaRating,
        criticsPick = criticsPick,
        byline = byline,
        headline = headline,
        summaryShort = summaryShort,
        publicationDate = publicationDate,
        openingDate = openingDate,
        dateUpdated = dateUpdated,
        imageUrl = imageUrl,
    )
}

fun List<Movie_review_Entity>.toMovieReviewsList(): List<MovieReview> {
    return map { it.toMovie() }
}
