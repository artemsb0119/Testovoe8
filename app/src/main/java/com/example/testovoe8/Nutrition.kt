package com.example.testovoe8

import com.google.gson.annotations.SerializedName

data class Nutrition (

    @SerializedName("priem") val priem : String,
    @SerializedName("photo") val photo : String,
    @SerializedName("food") val food : String,
    @SerializedName("kcal") val kcal : String
)