package com.example.flea

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.flea.ui.nav.Screen
import com.example.flea.ui.screen.aboutme.AboutMeScreen
import com.example.flea.ui.screen.detail.DetailScreen
import com.example.flea.ui.screen.home.HomeScreen

@Composable
fun FleaApp(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                navigateToAboutMe = {
                    navController.navigate(Screen.About.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                navigateToDetail = { filmId ->
                    navController.navigate(Screen.Detail.createRoute(filmId))
                },
            )
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument("filmId") { type = NavType.LongType }),
        ) {
            val id = it.arguments?.getLong("filmId") ?: -1L
            DetailScreen(
                filmId = id,
                navigateBack = {
                    navController.navigateUp()
                }
            )
        }
        composable(Screen.About.route) {
            AboutMeScreen(navigateBack = {
                navController.navigateUp()
            })
        }
    }
}
