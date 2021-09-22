package com.ppantaleon.kmmquickstart.domain.usecase

import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import com.ppantaleon.kmmquickstart.domain.repository.MovieReviewRepository
import com.ppantaleon.kmmquickstart.state.DataState
import kotlinx.coroutines.flow.Flow

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
class SearchUseCaseImpl(
    private val repository: MovieReviewRepository,
) : SearchUseCase {

    override fun invoke(): Flow<DataState<List<MovieReview>>> {
        return repository.search()
    }
}