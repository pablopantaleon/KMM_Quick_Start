package com.ppantaleon.kmmquickstart.domain.entity

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
data class DataList<T>(
    val status: String,
    val copyright: String,
    val hasMore: Boolean,
    val numResults: Int,
    val results: List<T>,
)