package com.ppantaleon.kmmquickstart.di

import com.ppantaleon.kmmquickstart.data.network.KtorClientFactory
import com.ppantaleon.kmmquickstart.data.network.api.MovieReviewApi
import com.ppantaleon.kmmquickstart.data.network.api.MovieReviewApiImpl
import com.ppantaleon.kmmquickstart.domain.repository.MovieReviewRepository
import com.ppantaleon.kmmquickstart.domain.repository.MovieReviewRepositoryImpl

class NetworkModule(
    private val cache: CacheModule,
) {

    val service: MovieReviewApi by lazy {
        MovieReviewApiImpl(
            httpClient = KtorClientFactory().build(),
            baseUrl = MovieReviewApi.BASE_URL
        )
    }
    val repository: MovieReviewRepository by lazy {
        MovieReviewRepositoryImpl(
            movieReviewApi = service,
            movieReviewCache = cache.movieCache
        )
    }
}








