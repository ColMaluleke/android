package com.vertextraining.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.vertextraining.ui.screens.onboarding.OnboardingScreen
import com.vertextraining.ui.screens.dashboard.DashboardScreen
// Add other imports as you build the app

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "onboarding"
    ) {
        composable("onboarding") {
            OnboardingScreen(navController)
        }
        composable("dashboard") {
            DashboardScreen(navController)
        }

        // TODO: Add routes for lessons, quizzes, glossary, settings, etc.
    }
}