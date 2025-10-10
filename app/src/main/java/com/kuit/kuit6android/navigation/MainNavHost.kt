package com.kuit.kuit6android.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kuit.kuit6android.ui.favorite.screen.FavoriteScreen
import com.kuit.kuit6android.ui.home.screen.HomeScreen
import com.kuit.kuit6android.ui.myeats.screen.MyEatsScreen
import com.kuit.kuit6android.ui.orderhistory.screen.OrderHistoryScreen
import com.kuit.kuit6android.ui.search.screen.SearchScreen
import com.kuit.kuit6android.ui.shoppingcart.screen.ShoppingCartScreen

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
            )
        }
        composable<Route.Favorite> {
            FavoriteScreen(
                padding = padding,
            )
        }

        composable<Route.OrderHistory> {
            OrderHistoryScreen(
                padding = padding,
                navController = navController
            )
        }


        composable<Route.MyEats> {
            MyEatsScreen(
                padding = padding,
            )
        }

        composable<Route.ShoppingCart> {
            ShoppingCartScreen(
                modifier = Modifier
            )

        }

    }
}