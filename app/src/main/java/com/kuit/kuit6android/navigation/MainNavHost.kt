package com.kuit.kuit6android.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.kuit.kuit6android.ui.favorite.screen.FavoriteDetailScreen
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

        composable<Route.Favorite> {

        }

        navigation<Route.SearchNestedGraphRoute>(
            startDestination = Route.Search
        )
        {
            composable<Route.Search> {
                SearchScreen(
                    padding = padding,
                    onNavigateToSearchResult = {
                        navController.navigate(route = Route.SearchResult(searchKeyword = it))
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


        navigation<Route.MyEatsNestedGraph>(
            startDestination = Route.MyEats
        ) {
            composable<Route.FavoriteToMyEats> {
                FavoriteScreen(
                    padding = padding,
                    onNavigateToDetailPage = { restaurant ->
                        navController.navigate(
                            route = Route.FavoriteDetail(
                                restaurantImageId = restaurant.imageId,
                                restaurantName = restaurant.name,
                                restaurantRating = restaurant.rating,
                                restaurantReviewerCount = restaurant.reviewerCount
                            )
                        )
                    },
                    navController = navController
                )
            }
            composable<Route.FavoriteDetail> { navBackStackEntry ->
                val restaurantDetails = navBackStackEntry.toRoute<Route.FavoriteDetail>()
                FavoriteDetailScreen(
                    detail = restaurantDetails,
                    navController = navController
                )
            }
            composable<Route.MyEats> {
                MyEatsScreen(
                    padding = padding,
                    onNavigateToFavorite = {
                        navController.navigate(Route.FavoriteToMyEats)
                    }
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