package com.kuit.kuit6android.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.kuit.kuit6android.ui.detailpage.screen.DetailScreen
import com.kuit.kuit6android.ui.favorite.components.FavoriteStore
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

        // MainNavHost.kt 中
        // Favorite 화면
        composable<Route.Favorite> {
            FavoriteScreen(
                padding = padding,
                onBack = { navController.popBackStack() },
                favorites = listOf(
                    FavoriteStore("아워떡볶이", 4.9, 3849, 30),
                    FavoriteStore("아워떡볶이", 4.9, 3849, 30),
                    FavoriteStore("아워떡볶이", 4.9, 3849, 30),
                ),
                onStoreClick = { store ->
                    navController.navigate(
                        Route.StoreDetail(
                            name = store.name,
                            rating = store.rating,
                            reviewCount = store.reviewCount,
                            etaMinutes = store.etaMinutes
                        )
                    )
                }
            )
        }

// 상세
        composable<Route.StoreDetail> { backStackEntry ->
            val args = backStackEntry.toRoute<Route.StoreDetail>()
            DetailScreen(
                padding = padding,
                storeName = args.name,
                rating = args.rating,
                reviewCount = args.reviewCount,
                onBack = { navController.popBackStack() }
            )
        }


        composable<Route.OrderHistory> {
            OrderHistoryScreen(
                padding = padding,
            )
        }
        // ...중략
        composable<Route.MyEats> {
            MyEatsScreen(
                padding = padding,
                onNavigateToFavorite = {
                    navController.navigate(Route.Favorite)
                }
            )
        }


    }

}