package com.kuit.kuit6android.navigation

import com.kuit.kuit6android.R

enum class NavTab (
    var icon: Int,
    val label: String,
    val route: Route
){
    HOME(
        icon = R.drawable.ic_home,
        label = "홈",
        route = Route.Home,
    ),
    SEARCH(
        icon = R.drawable.ic_search,
        label = "검색",
        route = Route.Search,
    ),
    FAVORITE(
        icon = R.drawable.ic_favorite,
        label = "즐겨찾기",
        route = Route.Favorite,
    ),
    ORDER_HISTORY(
        icon = R.drawable.ic_order_history,
        label = "주문내역",
        route = Route.OrderHistory,
    ),
    MY_EATS(
        icon = R.drawable.ic_my_eats,
        label = "My_Eats",
        route = Route.MyEats,
    ),
}