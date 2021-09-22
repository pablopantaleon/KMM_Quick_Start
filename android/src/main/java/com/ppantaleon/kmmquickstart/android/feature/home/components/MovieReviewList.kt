package com.ppantaleon.kmmquickstart.android.feature.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.annotation.ExperimentalCoilApi
import com.ppantaleon.kmmquickstart.domain.entity.MovieReview

@ExperimentalCoilApi
@Composable
fun MovieReviewList(
    loading: Boolean,
    data: List<MovieReview>,
) {
    Box(
        modifier = Modifier
            .background(color = MaterialTheme.colors.surface)
    ) {
        if (loading && data.isEmpty()) {
            // Loading
        } else if (data.isEmpty()) {
            // There's nothing here
        } else {
            LazyColumn {
                itemsIndexed(
                    items = data
                ) { index, movieReview ->
                    MovieReviewCard(
                        movieReview = movieReview,
                    )
                }
            }
        }
    }
}