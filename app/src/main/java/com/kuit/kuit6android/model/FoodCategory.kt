package com.kuit.kuit6android.model

import androidx.annotation.DrawableRes
import com.kuit.kuit6android.R

sealed class FoodCategory(
    val name: String,
    @DrawableRes val imageRes : Int
){
    data object Cutlet : FoodCategory(
        name = "돈가스",
        imageRes = R.drawable.cutlet
    )

    data object Sushi : FoodCategory(
        name = "일식",
        imageRes = R.drawable.sushi
    )

    data object Korean : FoodCategory(
        name = "한식",
        imageRes = R.drawable.korean
    )

    data object Chicken : FoodCategory(
        name = "치킨",
        imageRes = R.drawable.chicken
    )

    data object SchoolFood : FoodCategory(
        name = "분식",
        imageRes = R.drawable.schoolfood
    )

    companion object{
        fun getList(): List<FoodCategory>{
            return listOf(Cutlet, Sushi, Korean, Chicken, SchoolFood)
        }
    }
}