package com.ppantaleon.kmmquickstart.state

/**
 * Created by Pablo Reyes [devpab@gmail.com] on 22/09/21.
 */
sealed class DataState<out Type> {
    data class Success<Type>(val data: Type) : DataState<Type>()
    data class Failed(val error: Throwable) : DataState<Nothing>()
    object Loading : DataState<Nothing>()
    object Initial : DataState<Nothing>()
}
