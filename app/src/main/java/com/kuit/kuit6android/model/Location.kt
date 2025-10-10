package com.kuit.kuit6android.model

data class Location(var city : String, var town : String, var neighborhood : String){
    override fun toString(): String {
        return "$city $town $neighborhood"
    }
}