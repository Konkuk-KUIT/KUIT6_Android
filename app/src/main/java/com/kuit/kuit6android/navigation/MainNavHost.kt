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
import com.kuit.kuit6android.ui.restaurant.screen.RestaurantDetailScreen
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
            startDestination = Route.Search // 필수
        ) {
            composable<Route.Search> {
                SearchScreen(
                    padding = padding,
                    {
                        navController.navigate(Route.SearchResult(searchKeyword = it))
                    }
                )
            }

            composable<Route.SearchResult> { navBackStackEntry ->
                val keyword = navBackStackEntry.toRoute<Route.SearchResult>().searchKeyword
                SearchResultScreen(
                    padding = padding,
                    searchKeyword = keyword
                )
            }
        }

        navigation<Route.FavoriteNestedGraphRoute>(
            startDestination = Route.Favorite
        ) {
            composable<Route.Favorite> {
                FavoriteScreen(
                    padding = padding,
                    onNavigateToRestaurantDetail = { restaurant ->
                        navController.navigate(
                            Route.RestaurantDetail(
                                imageId = restaurant.imageId,
                                name = restaurant.name,
                                time = restaurant.time,
                                rate = restaurant.rate,
                                reviewNum = restaurant.reviewNum
                            )
                        )
                    }
                )
            }

            composable<Route.RestaurantDetail> { navBackStackEntry ->
                val restaurant = navBackStackEntry.toRoute<Route.RestaurantDetail>()
                RestaurantDetailScreen(
                    padding = padding,
                    restaurant = restaurant,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }

        composable<Route.OrderHistory> {
            OrderHistoryScreen(
                padding = padding,
            )
        }

        navigation<Route.MyEatsNestedGraphRoute>(
            startDestination = Route.MyEats
        ) {
            composable<Route.MyEats> {
                MyEatsScreen(
                    padding = padding,
                    onNavigateToFavorite = {
                        navController.navigate(Route.MyEatsFavorite)
                    }
                )
            }

            composable<Route.MyEatsFavorite> {
                FavoriteScreen(
                    padding = padding,
                    onNavigateToRestaurantDetail = { restaurant ->
                        navController.navigate(
                            Route.RestaurantDetail(
                                imageId = restaurant.imageId,
                                name = restaurant.name,
                                time = restaurant.time,
                                rate = restaurant.rate,
                                reviewNum = restaurant.reviewNum
                            )
                        )
                    },
                    showBackButton = true,
                    onBackClick = { navController.popBackStack() }
                )
            }

        }

    }
}