package com.gomdolstudio.covidinfoapp.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Item(
        @Expose
        @SerializedName("title") val title: String,
        @Expose
        @SerializedName("originallink") val originallink: String,
        @Expose
        @SerializedName("link") val link: String,
        @Expose
        @SerializedName("description") val description: String,
        @Expose
        @SerializedName("pubDate") val pubDate: String
)
