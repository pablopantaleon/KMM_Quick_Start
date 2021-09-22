package com.ppantaleon.kmmquickstart.data.network

import com.ppantaleon.kmmquickstart.data.network.datamodel.MovieReviewDto
import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import io.ktor.client.HttpClient

expect class KtorClientFactory() {

    fun build(): HttpClient
}

fun MovieReviewDto.toMovie(): MovieReview {
    return MovieReview(
        title = title ?: "",
        mpaaRating = mpaaRating ?: "",
        criticsPick = (criticsPick ?: 0).toLong(),
        byline = byline ?: "",
        headline = headline ?: "",
        summaryShort = summaryShort ?: "",
        publicationDate = publicationDate ?: "",
        openingDate = openingDate ?: "",
        dateUpdated = dateUpdated ?: "",
        imageUrl = multimedia.src,
    )
}

fun List<MovieReviewDto>.toMovieReviewsList(): List<MovieReview> {
    return map { it.toMovie() }
}