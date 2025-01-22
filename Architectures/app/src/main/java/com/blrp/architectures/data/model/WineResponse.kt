package com.blrp.architectures.data.model

import com.google.gson.annotations.SerializedName

data class WineResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("winery") val winery: String,
    @SerializedName("wine") val wine: String,
    @SerializedName("rating") val rating: RatingResponse,
    @SerializedName("location") val location: String,
    @SerializedName("image") val image: String,
)