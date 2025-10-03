package com.kuit.kuit6android.navigation

import android.util.Log
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.coroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.toRoute
import com.kuit.kuit6android.ui.detail.screen.DetailPage
import com.kuit.kuit6android.ui.favorite.screen.FavoriteScreen
import com.kuit.kuit6android.ui.home.screen.HomeScreen
import com.kuit.kuit6android.ui.myeats.screen.MyEatsScreen
import com.kuit.kuit6android.ui.orderhistory.screen.OrderHistoryScreen
import com.kuit.kuit6android.ui.search.screen.SearchResultScreen
import com.kuit.kuit6android.ui.search.screen.SearchScreen
import com.kuit.kuit6android.viewmodel.favorite.FavoriteViewModel
import com.kuit.kuit6android.viewmodel.favorite.StoreCache
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

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
        composable<Route.Search> {
            SearchScreen(
                padding = padding,
                onNavigateToSearchResult = {
                    navController.navigate(Route.SearchResult(searchKeyword = it))
                }
            )
        }
        composable<Route.SearchResult> { navBackStackEntry ->
            val keyword = navBackStackEntry.toRoute<Route.SearchResult>().searchKeyword
            SearchResultScreen(
                padding = padding,
                searchKeyWord = keyword
            )
        }
        composable<Route.Favorite> {
            val viewModel: FavoriteViewModel = viewModel()

            LaunchedEffect(viewModel) {
                viewModel.nav.collect { ev ->
                    when (ev){
                        NavEvent.Back -> navController.popBackStack()
                        is NavEvent.ToDetail -> {
                            navController.navigate("detail/${ev.id}")
                        }
                    }
                }
            }

            FavoriteScreen(padding = padding, viewModel = viewModel)
        }
        composable(
            Route.Detail.routeWithArg,
            arguments = listOf(navArgument("storeId") { type = NavType.StringType })
        ) { backStackEntry ->
            val storeId = backStackEntry.arguments?.getString("storeId")
            val store = StoreCache.get(storeId)

            if (store == null) {
                navController.popBackStack()
                return@composable
            }
            DetailPage(store = store, onBackClick = {navController.popBackStack()})
        }
        composable<Route.OrderHistory> {
            OrderHistoryScreen(
                padding = padding,
            )
        }
        composable<Route.MyEats> {
            MyEatsScreen(
                padding = padding,
                clickedFavoriteNavigate = {
                    navController.navigate(Route.Favorite)
                }
            )
        }
    }
}