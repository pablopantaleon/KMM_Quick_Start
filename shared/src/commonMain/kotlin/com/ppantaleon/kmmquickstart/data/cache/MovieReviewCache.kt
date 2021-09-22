package com.ppantaleon.kmmquickstart.data.cache

import com.ppantaleon.kmmquickstart.domain.entity.MovieReview

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
interface MovieReviewCache {

    fun insert(movieReview: MovieReview)

    fun insert(movieReviews: List<MovieReview>)

    fun getAll(): List<MovieReview>

}