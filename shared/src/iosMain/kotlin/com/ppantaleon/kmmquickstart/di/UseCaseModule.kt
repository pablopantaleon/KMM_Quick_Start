package com.ppantaleon.kmmquickstart.di

import com.ppantaleon.kmmquickstart.domain.repository.MovieReviewRepository
import com.ppantaleon.kmmquickstart.domain.usecase.SearchUseCase
import com.ppantaleon.kmmquickstart.domain.usecase.SearchUseCaseImpl

class UseCaseModule(
    val repository: MovieReviewRepository
) {

    val search: SearchUseCase by lazy {
        SearchUseCaseImpl(repository = repository)
    }
}






