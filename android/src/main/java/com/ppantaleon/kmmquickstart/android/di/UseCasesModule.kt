package com.ppantaleon.kmmquickstart.android.di

import com.ppantaleon.kmmquickstart.domain.repository.MovieReviewRepository
import com.ppantaleon.kmmquickstart.domain.usecase.SearchUseCase
import com.ppantaleon.kmmquickstart.domain.usecase.SearchUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {

    @Singleton
    @Provides
    fun provideGetMovieReviews(
        repository: MovieReviewRepository,
    ): SearchUseCase {
        return SearchUseCaseImpl(
            repository = repository
        )
    }
}