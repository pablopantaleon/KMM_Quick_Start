package com.ppantaleon.kmmquickstart.android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.HiltViewModelFactory
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.ppantaleon.kmmquickstart.android.feature.home.HomeScreen
import com.ppantaleon.kmmquickstart.android.feature.home.HomeViewModel

@ExperimentalCoilApi
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) { navBackStackEntry ->
            val factory = HiltViewModelFactory(LocalContext.current, navBackStackEntry)
            val viewModel: HomeViewModel =
                viewModel(key = "HomeViewModel", factory = factory)
            HomeScreen(state = viewModel.state.value)
        }
    }
}