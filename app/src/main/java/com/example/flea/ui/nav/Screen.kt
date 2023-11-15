package com.example.flea.ui.nav

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object About : Screen("about")
    object Detail : Screen("home/{filmId}") {
        fun createRoute(filmId: Long) = "home/$filmId"
    }
}
