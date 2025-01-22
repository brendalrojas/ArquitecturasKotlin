package com.blrp.architectures.data.model

import com.google.gson.annotations.SerializedName

class RatingResponse(
    @SerializedName("average") val average: String,
    @SerializedName("reviews") val reviews: String,
)
