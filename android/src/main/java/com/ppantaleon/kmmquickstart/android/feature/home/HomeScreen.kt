package com.ppantaleon.kmmquickstart.android.feature.home

import androidx.compose.runtime.Composable
import coil.annotation.ExperimentalCoilApi
import com.ppantaleon.kmmquickstart.android.feature.home.components.MovieReviewList
import com.ppantaleon.kmmquickstart.android.theme.AppTheme
import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import com.ppantaleon.kmmquickstart.state.DataState

@ExperimentalCoilApi
@Composable
fun HomeScreen(
    state: DataState<List<MovieReview>>,
) {
    AppTheme(
        displayProgressBar = state is DataState.Loading
    ) {
        MovieReviewList(
            loading = state is DataState.Loading,
            data = (state as? DataState.Success)?.data ?: emptyList(),
        )
    }
}