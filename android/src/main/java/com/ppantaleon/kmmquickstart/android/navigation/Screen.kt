package com.ppantaleon.kmmquickstart.android.navigation

sealed class Screen(val route: String) {
    object Home: Screen("home")
}
