package com.ppantaleon.kmmquickstart.domain.repository

import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import com.ppantaleon.kmmquickstart.state.DataState
import kotlinx.coroutines.flow.Flow

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
interface MovieReviewRepository {

    fun search(
        query: String? = null
    ): Flow<DataState<List<MovieReview>>>

}