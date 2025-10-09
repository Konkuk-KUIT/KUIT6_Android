package com.kuit.kuit6android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kuit.kuit6android.navigation.BottomNavBar
import com.kuit.kuit6android.navigation.BottomNavBarItem
import com.kuit.kuit6android.navigation.MainNavHost
import com.kuit.kuit6android.navigation.Route
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KUIT6_ANDROIDTheme {
                val navController = rememberNavController()
                var currentIndex by remember { mutableIntStateOf(0) }

                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = try {
                    navBackStackEntry?.toRoute<Route>()
                } catch (_: Exception) {
                    null
                }

                val showBottomBar = currentRoute !is Route.ShoppingCart

                val navBarItems = listOf(
                    BottomNavBarItem("홈", Route.Home, R.drawable.ic_home),
                    BottomNavBarItem("검색", Route.Search, R.drawable.ic_search),
                    BottomNavBarItem("즐겨찾기", Route.Favorite, R.drawable.ic_favorite),
                    BottomNavBarItem("주문내역", Route.OrderHistory, R.drawable.ic_order_history),
                    BottomNavBarItem("My Eats", Route.MyEats, R.drawable.ic_my_eats),
                )

                Scaffold(
                    containerColor = Color.White,
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        if (showBottomBar) {
                            BottomNavBar(
                                visible = true,
                                items = navBarItems,
                                currentIndex = currentIndex,
                                onItemSelected = { index, item ->
                                    navController.navigate(item.route)
                                    currentIndex = index
                                }
                            )
                        }
                    }
                ) { innerPadding ->
                    MainNavHost(
                        padding = innerPadding,
                        navController = navController
                    )
                }
            }
        }
    }
}
