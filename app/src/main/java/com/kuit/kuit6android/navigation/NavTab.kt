package com.kuit.kuit6android.navigation

import com.kuit.kuit6android.R

enum class NavTab(
    val icon: Int,
    val label: String,
    val route: Route
) {
    HOME(
        icon = R.drawable.ic_home,
        label = "홈",
        Route.Home,
    ),
    SEARCH(
        icon = R.drawable.ic_search,
        label = "검색",
        Route.Search,
    ),
    FAVORITE(
        icon = R.drawable.ic_favorite,
        label = "즐겨찾기",
        Route.Favorite,
    ),
    ORDER_HISTORY(
        icon = R.drawable.ic_order_history,
        label = "주문내역",
        Route.OrderHistory,
    ),
    MY_EATS(
        icon = R.drawable.ic_my_eats,
        label = "My Eats",
        Route.MyEats,
    )


}