package com.kuit.kuit6android.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import com.kuit.kuit6android.ui.favorite.screen.DetailPage
import com.kuit.kuit6android.ui.favorite.screen.FavoriteScreen
import com.kuit.kuit6android.ui.home.component.StoreData
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
                    onNavigateToSearchResult = {
                        navController.navigate(Route.SearchResult(searchKeyword = it))
                    }
                )
            }

            composable<Route.SearchResult>{navBackStackEntry ->
                val keyword = navBackStackEntry.toRoute<Route.SearchResult>().searchKeyword
                SearchResultScreen(
                    padding = padding,
                    searchKeyword = keyword
                )
            }
        }

        navigation<Route.FavoriteNestedGraphRoute>(
            startDestination = Route.Favorite
        ){
            composable<Route.Favorite> {
                FavoriteScreen(
                    padding = padding,
                    onNavigateToFavoriteStoreInfo = { store ->
                        navController.navigate(
                            Route.DetailPage(
                                imageId = store.imageId,
                                name = store.name,
                                deliveryTime = store.deliveryTime,
                                score = store.score,
                                reviewCount = store.reviewCount
                            )
                        )
                    },
                    navController = navController
                )
            }

            composable<Route.DetailPage> { backStackEntry ->
                val args = backStackEntry.toRoute<Route.DetailPage>()
                val store = StoreData(
                    imageId = args.imageId,
                    name = args.name,
                    deliveryTime = args.deliveryTime,
                    score = args.score,
                    reviewCount = args.reviewCount
                )
                // 화면 컴포저블로 전달
                DetailPage(storeInfo = store, navController = navController)
            }
        }

        composable<Route.OrderHistory> {
            OrderHistoryScreen(
                padding = padding,
            )
        }

        navigation<Route.MyEatsNestedGraphRoute>(
            startDestination = Route.MyEats
        ){
            composable<Route.MyEats> {
                MyEatsScreen(
                    padding = padding,
                    onNavigateToFavorite = {
                        navController.navigate(Route.Favorite)
                    }
                )
            }

            composable<Route.Favorite>{
                FavoriteScreen(
                    padding = padding,
                    onNavigateToFavoriteStoreInfo = { store ->
                        navController.navigate(
                            Route.DetailPage(
                                imageId = store.imageId,
                                name = store.name,
                                deliveryTime = store.deliveryTime,
                                score = store.score,
                                reviewCount = store.reviewCount
                            )
                        )
                    },
                    navController = navController
                )
            }
        }

    }
}