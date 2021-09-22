package com.ppantaleon.kmmquickstart.domain.entity

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
data class MovieReview(
    val title: String,
    val mpaaRating: String,
    val criticsPick: Long,
    val byline: String,
    val headline: String,
    val summaryShort: String,
    val publicationDate: String,
    val openingDate: String,
    val dateUpdated: String,
    val imageUrl: String,
)