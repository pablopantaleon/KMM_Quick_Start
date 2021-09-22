package com.ppantaleon.kmmquickstart.android.di

import com.ppantaleon.kmmquickstart.data.cache.MovieReviewCache
import com.ppantaleon.kmmquickstart.data.network.KtorClientFactory
import com.ppantaleon.kmmquickstart.data.network.api.MovieReviewApi
import com.ppantaleon.kmmquickstart.data.network.api.MovieReviewApiImpl
import com.ppantaleon.kmmquickstart.domain.repository.MovieReviewRepository
import com.ppantaleon.kmmquickstart.domain.repository.MovieReviewRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient {
        return KtorClientFactory().build()
    }

    @Singleton
    @Provides
    fun provideMovieReviewApi(
        httpClient: HttpClient,
    ): MovieReviewApi {
        return MovieReviewApiImpl(
            httpClient = httpClient,
            baseUrl = MovieReviewApi.BASE_URL,
        )
    }

    @Singleton
    @Provides
    fun provideMovieReviewRepository(
        api: MovieReviewApi,
        cache: MovieReviewCache,
    ): MovieReviewRepository {
        return MovieReviewRepositoryImpl(
            movieReviewApi = api,
            movieReviewCache = cache,
        )
    }
}