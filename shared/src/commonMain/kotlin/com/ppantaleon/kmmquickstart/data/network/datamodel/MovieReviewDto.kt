package com.ppantaleon.kmmquickstart.data.network.datamodel

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
@Serializable
data class MovieReviewDto(
    @SerialName("display_title")
    val title: String?,
    @SerialName("mpaa_rating")
    val mpaaRating: String?,
    @SerialName("critics_pick")
    val criticsPick: Int?,
    val byline: String?,
    val headline: String?,
    @SerialName("summary_short")
    val summaryShort: String?,
    @SerialName("publication_date")
    val publicationDate: String?,
    @SerialName("opening_date")
    val openingDate: String?,
    @SerialName("date_updated")
    val dateUpdated: String?,
    val link: LinkDto,
    val multimedia: MultimediaDto,
)
