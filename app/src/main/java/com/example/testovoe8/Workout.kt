package com.example.testovoe8

import com.google.gson.annotations.SerializedName

data class Workout (

    @SerializedName("train") val train : String,
    @SerializedName("kol") val kol : String
)