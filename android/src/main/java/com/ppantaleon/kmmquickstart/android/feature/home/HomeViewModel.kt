package com.ppantaleon.kmmquickstart.android.feature.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ppantaleon.kmmquickstart.domain.entity.MovieReview
import com.ppantaleon.kmmquickstart.domain.usecase.SearchUseCase
import com.ppantaleon.kmmquickstart.state.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCase: SearchUseCase,
) : ViewModel() {

    private val _state: MutableState<DataState<List<MovieReview>>> =
        mutableStateOf(DataState.Loading)
    val state: State<DataState<List<MovieReview>>> = _state

    init {
        loadRecipes()
    }

    private fun loadRecipes() {
        useCase.invoke().onEach { dataState ->
            _state.value = dataState
        }.launchIn(viewModelScope)
    }
}
