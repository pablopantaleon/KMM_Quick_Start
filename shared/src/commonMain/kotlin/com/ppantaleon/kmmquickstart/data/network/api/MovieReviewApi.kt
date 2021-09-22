package com.ppantaleon.kmmquickstart.data.network.api

import com.ppantaleon.kmmquickstart.data.network.datamodel.MovieReviewDto
import com.ppantaleon.kmmquickstart.data.network.datamodel.SearchResponse

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
interface MovieReviewApi {

    suspend fun search(
        query: String?
    ): SearchResponse<MovieReviewDto>

    companion object {

        const val BASE_URL = "https://api.nytimes.com/svc/movies/v2/reviews"
    }
}