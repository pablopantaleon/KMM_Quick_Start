package com.ppantaleon.kmmquickstart.data.network.datamodel

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
@Serializable
data class SearchResponse<T>(
    val status: String,
    val copyright: String,
    @SerialName("has_more")
    val hasMore: Boolean,
    @SerialName("num_results")
    val numResults: Int,
    val results: List<T>,
)
