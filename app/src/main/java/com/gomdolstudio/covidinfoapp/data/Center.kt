package com.gomdolstudio.covidinfoapp.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Center (
        @Expose
        @SerializedName("address") val address : String,
        @Expose
        @SerializedName("centerName") val centerName : String,
        @Expose
        @SerializedName("centerType") val centerType : String,
        @Expose
        @SerializedName("createdAt") val createdAt : String,
        @Expose
        @SerializedName("facilityName") val facilityName : String,
        @Expose
        @SerializedName("id") val id : Int,
        @Expose
        @SerializedName("lat") val lat : Double,
        @Expose
        @SerializedName("lng") val lng : Double,
        @Expose
        @SerializedName("org") val org : String,
        @Expose
        @SerializedName("phoneNumber") val phoneNumber : String,
        @Expose
        @SerializedName("sido") val sido : String,
        @Expose
        @SerializedName("sigungu") val sigungu : String,
        @Expose
        @SerializedName("updatedAt") val updatedAt : String,
        @Expose
        @SerializedName("zipCode") val zipCode : Int
        )

