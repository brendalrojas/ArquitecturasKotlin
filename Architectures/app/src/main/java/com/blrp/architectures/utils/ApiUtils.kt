package com.blrp.architectures.utils

import com.blrp.architectures.data.database.entity.WineEntity
import com.blrp.architectures.data.model.WineResponse
import com.blrp.architectures.domain.model.RatingModel
import com.blrp.architectures.domain.model.WineModel

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

fun WineModel.toWineEntity(): WineEntity {
    return WineEntity(
        id = id ?: 0,
        winery = winery ?: "",
        wine = wine ?: "",
        location = location ?: "",
        image = image ?: ""
    )
}
fun WineEntity.toWineModel(): WineModel {
    return WineModel(
        id = id,
        winery = winery,
        wine = wine,
        location = location,
        image = image
    )
}