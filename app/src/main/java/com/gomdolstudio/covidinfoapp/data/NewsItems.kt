package com.gomdolstudio.covidinfoapp.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsItems(
        @Expose
        @SerializedName("lastBuildDate") val lastBuildDate: String,
        @Expose
        @SerializedName("total") val total: Int,
        @Expose
        @SerializedName("start") val start: Int,
        @Expose
        @SerializedName("display") val display: Int,
        @Expose
        @SerializedName("items") val items: List<Item>
)
