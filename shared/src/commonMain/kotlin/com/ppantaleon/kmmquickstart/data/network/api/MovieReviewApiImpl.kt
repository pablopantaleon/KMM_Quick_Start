package com.ppantaleon.kmmquickstart.data.network.api

import com.ppantaleon.kmmquickstart.data.network.datamodel.MovieReviewDto
import com.ppantaleon.kmmquickstart.data.network.datamodel.SearchResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.get

private const val API_KEY = "ZQDWIE2LGsS4jZN1xHDtDISOBLX4WfAo"

class MovieReviewApiImpl(
    private val httpClient: HttpClient,
    private val baseUrl: String,
) : MovieReviewApi {

    override suspend fun search(query: String?): SearchResponse<MovieReviewDto> {
        print("$baseUrl/search.json?api-key=$API_KEY")
        return httpClient.get("$baseUrl/search.json?api-key=$API_KEY")
    }
}