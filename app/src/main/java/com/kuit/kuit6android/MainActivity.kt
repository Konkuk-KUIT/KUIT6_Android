package com.kuit.kuit6android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.kuit.kuit6android.navigation.BottomNavBar
import com.kuit.kuit6android.navigation.MainNavHost
import com.kuit.kuit6android.ui.theme.KUIT6_ANDROIDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KUIT6_ANDROIDTheme {
                val navController = rememberNavController()

                val currentDestination =
                    navController.currentBackStackEntryAsState().value?.destination


//                var currentIndex by remember { mutableIntStateOf(0) }
//                val navBarItems = listOf(
//                    BottomNavBarItem(
//                        label = "홈",
//                        route = Route.Home,
//                        icon = R.drawable.ic_home,
//                    ),
//                    BottomNavBarItem(
//                        label = "검색",
//                        route = Route.Search,
//                        icon = R.drawable.ic_search,
//                    ),
//                    BottomNavBarItem(
//                        label = "즐겨찾기",
//                        route = Route.Favorite,
//                        icon = R.drawable.ic_favorite,
//                    ),
//                    BottomNavBarItem(
//                        label = "주문내역",
//                        route = Route.OrderHistory,
//                        icon = R.drawable.ic_order_history,
//                    ),
//                    BottomNavBarItem(
//                        label = "My Eats",
//                        route = Route.MyEats,
//                        icon = R.drawable.ic_my_eats,
//                    ),
//                )

                Scaffold(
                    containerColor = Color.White,
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {

                        BottomNavBar(
                            visible = true,
                            items = navBarItems,
                            currentIndex = currentIndex,
                            onItemSelected = { index, item ->
                                navController.navigate(item.route)
                                currentIndex = index
                            },
                        )
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


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KUIT6_ANDROIDTheme {
        Greeting("Android")
    }
}