package com.gomdolstudio.covidinfoapp.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class VaccinationLocation(
    @Expose
    @SerializedName("currentCount") val currentCount : Int,
    @Expose
    @SerializedName("data") val data : List<Location>,
    @Expose
    @SerializedName("matchCount") val matchCount : Int,
    @Expose
    @SerializedName("page") val page : Int,
    @Expose
    @SerializedName("perPage") val perPage : Int,
    @Expose
    @SerializedName("totalCount") val totalCount : Int
)
