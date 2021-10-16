package com.gomdolstudio.covidinfoapp.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Location(
    @Expose
    @SerializedName("accumulatedFirstCnt") val accumulatedFirstCnt : Int,
    @Expose
    @SerializedName("accumulatedSecondCnt") val accumulatedSecondCnt : Int,
    @Expose
    @SerializedName("accumulatedThirdCnt") val accumulatedThirdCnt : Int,
    @Expose
    @SerializedName("baseDate") val baseDate : String,
    @Expose
    @SerializedName("firstCnt") val firstCnt : Int,
    @Expose
    @SerializedName("id") val id : Int,
    @Expose
    @SerializedName("secondCnt") val secondCnt : Int,
    @Expose
    @SerializedName("sido") val sido : String,
    @Expose
    @SerializedName("thirdCnt") val thirdCnt : Int,
    @Expose
    @SerializedName("totalFirstCnt") val totalFirstCnt : Int,
    @Expose
    @SerializedName("totalSecondCnt") val totalSecondCnt : Int,
    @Expose
    @SerializedName("totalThirdCnt") val totalThirdCnt : Int
)
