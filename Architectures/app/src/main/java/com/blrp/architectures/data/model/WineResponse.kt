package com.blrp.architectures.data.model

import com.blrp.architectures.domain.model.RatingModel
import com.blrp.architectures.domain.model.WineModel
import com.google.gson.annotations.SerializedName

data class WineResponse(
    @SerializedName("id") val id: Int? = null,
    @SerializedName("winery") val winery: String? = null,
    @SerializedName("wine") val wine: String? = null,
    @SerializedName("rating") val rating: RatingResponse? = null,
    @SerializedName("location") val location: String? = null,
    @SerializedName("image") val image: String? = null,
)

fun WineResponse.toWineModel(): WineModel {
    return WineModel(
        id = id,
        winery = winery,
        wine = wine,
        rating = RatingModel(
            reviews = rating?.reviews,
            average = rating?.average,
        ),
        location = location,
    )

}