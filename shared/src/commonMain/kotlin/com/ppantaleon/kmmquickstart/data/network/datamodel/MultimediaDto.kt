package com.ppantaleon.kmmquickstart.data.network.datamodel

import kotlinx.serialization.Serializable

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
@Serializable
data class MultimediaDto(
    val type: String,
    val src: String,
    val height: Int,
    val width: Int,
)