package com.ppantaleon.kmmquickstart.data.network.datamodel

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
@Serializable
data class LinkDto(
    val type: String,
    val url: String,

    @SerialName("suggested_link_text")
    val suggestedLinkText: String,
)
