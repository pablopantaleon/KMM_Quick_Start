package com.ppantaleon.kmmquickstart.data.cache

import com.ppantaleon.kmmquickstart.datasource.cache.KmmQuickStartDatabase
import com.ppantaleon.kmmquickstart.datasource.cache.MovieReviewDbQueries
import com.ppantaleon.kmmquickstart.domain.entity.MovieReview

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
class MovieReviewCacheImpl(
    private val database: KmmQuickStartDatabase,
) : MovieReviewCache {

    private var queries: MovieReviewDbQueries = database.movieReviewDbQueries

    override fun insert(movieReview: MovieReview) {
        queries.insertMediaReview(
            id = null, // autoincrement
            title = movieReview.title,
            mpaaRating = movieReview.mpaaRating,
            criticsPick = movieReview.criticsPick,
            byline = movieReview.byline,
            headline = movieReview.headline,
            summaryShort = movieReview.summaryShort,
            publicationDate = movieReview.publicationDate,
            openingDate = movieReview.openingDate,
            dateUpdated = movieReview.dateUpdated,
            imageUrl = movieReview.imageUrl,
        )
    }

    override fun insert(movieReviews: List<MovieReview>) {
        for (movieReview in movieReviews) {
            insert(movieReview)
        }
    }

    override fun getAll(): List<MovieReview> {
        return queries.selectAll().executeAsList().toMovieReviewsList()
    }
}