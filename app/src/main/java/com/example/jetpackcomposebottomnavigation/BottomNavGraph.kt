package com.example.jetpackcomposebottomnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcomposebottomnavigation.ui.screens.HomeScreen
import com.example.jetpackcomposebottomnavigation.ui.screens.ProfileScreen
import com.example.jetpackcomposebottomnavigation.ui.screens.SettingsScreen

@Composable
fun SetupBottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}