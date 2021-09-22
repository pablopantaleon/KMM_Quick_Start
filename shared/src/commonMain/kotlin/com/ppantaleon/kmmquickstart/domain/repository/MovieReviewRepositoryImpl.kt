package com.ppantaleon.kmmquickstart.domain.repository

import com.ppantaleon.kmmquickstart.data.cache.MovieReviewCache
import com.ppantaleon.kmmquickstart.data.network.api.MovieReviewApi
import com.ppantaleon.kmmquickstart.data.network.toMovieReviewsList
import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import com.ppantaleon.kmmquickstart.state.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
class MovieReviewRepositoryImpl(
    private val movieReviewApi: MovieReviewApi,
    private val movieReviewCache: MovieReviewCache,
) : MovieReviewRepository {

    override fun search(query: String?): Flow<DataState<List<MovieReview>>> {
        return flow {
            emit(DataState.Loading)
            val response = movieReviewApi.search("")
            // insert into cache
            movieReviewCache.insert(response.results.toMovieReviewsList())
            // query the cache
            val cacheData = movieReviewCache.getAll()
            // emit data from local database
            emit(DataState.Success(cacheData))
        }.catch { e: Throwable ->
            emit(DataState.Failed(e))
        }
    }
}