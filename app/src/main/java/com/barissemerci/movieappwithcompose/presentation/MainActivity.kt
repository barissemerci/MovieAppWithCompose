package com.barissemerci.movieappwithcompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import com.barissemerci.movieappwithcompose.presentation.theme.MovieAppWithComposeTheme
import dagger.hilt.android.AndroidEntryPoint
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.barissemerci.movieappwithcompose.presentation.movies.views.MovieScreen


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppWithComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.MovieScreen.route
                    ) {
                        composable(route = Screen.MovieScreen.route) {
                            MovieScreen(navController = navController)
                        }

                        composable(route = Screen.MovieDetailScreen.route) {

                        }

                    }

                }


            }
        }
    }
}

