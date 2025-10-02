package com.kuit.kuit6android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavDestination.Companion.hasRoute
import com.kuit.kuit6android.navigation.BottomNavBar
import com.kuit.kuit6android.navigation.BottomNavBarItem
import com.kuit.kuit6android.navigation.MainNavHost
import com.kuit.kuit6android.navigation.NavTab
import com.kuit.kuit6android.navigation.Route
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

                val currentTab: NavTab? =
                    NavTab.entries.find { tab -> currentDestination?.hasRoute(route = tab.route::class) == true }

                Scaffold(
                    containerColor = Color.White,
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {

                        BottomNavBar(
                            visible = true,
                            tabs = NavTab.entries,
                            currentTab = currentTab,
                            onItemSelected = { tab ->
                                navController.navigate(route = tab.route) {
                                    popUpTo(route = tab.route) {
                                        inclusive = true
                                    }
                                    launchSingleTop = true
                                }
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