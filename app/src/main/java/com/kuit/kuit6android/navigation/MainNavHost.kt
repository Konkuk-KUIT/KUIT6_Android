package com.kuit.kuit6android.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.kuit.kuit6android.ui.favorite.screen.FavoriteScreen
import com.kuit.kuit6android.ui.home.screen.HomeScreen
import com.kuit.kuit6android.ui.myeats.screen.MyEatsScreen
import com.kuit.kuit6android.ui.orderhistory.screen.OrderHistoryScreen
import com.kuit.kuit6android.ui.search.screen.SearchResultScreen
import com.kuit.kuit6android.ui.search.screen.SearchScreen

@Composable
fun MainNavHost(
    padding: PaddingValues,
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home,
    ) {
        composable<Route.Home> {
            HomeScreen(
                padding = padding,
            )
        }

        navigation<Route.SearchNestedGraphRoute>(
            startDestination = Route.Search
        ){
            composable<Route.Search> {
                SearchScreen(
                    padding = padding,
                    onNavigateSearchResult = {
                        navController.navigate(Route.SearchResult(searchKeyword = it))
                    }
                )
            }

            composable<Route.SearchResult> { navBackStackEntry ->
                val keyWord = navBackStackEntry.toRoute<Route.SearchResult>().searchKeyword

                SearchResultScreen(
                    padding = padding,
                    searchKeyword = keyWord
                )
            }
        }

        navigation<Route.SearchNestedGraphRoute>(
            startDestination = Route.MyEats
        ){
            composable<Route.MyEats> {
                MyEatsScreen(
                    padding = padding,
                    navController = navController
                )
            }
            composable<Route.Favorite> {
                FavoriteScreen(
                    padding = padding,
                    navController = navController
                )
            }
            composable<Route.FavoriteLook> {
                FavoriteLook(
                    padding = padding,
                )
            }
        }

        composable<Route.OrderHistory> {
            OrderHistoryScreen(
                padding = padding,
            )
        }

    }
}

@Composable
fun FavoriteLook(padding: PaddingValues) {
    TODO("Not yet implemented")
}