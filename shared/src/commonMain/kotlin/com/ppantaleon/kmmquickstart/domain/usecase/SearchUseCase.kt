package com.ppantaleon.kmmquickstart.domain.usecase

import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import com.ppantaleon.kmmquickstart.state.DataState
import kotlinx.coroutines.flow.Flow

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
interface SearchUseCase {

    fun invoke(): Flow<DataState<List<MovieReview>>>

}