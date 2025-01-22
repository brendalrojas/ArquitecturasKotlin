package com.blrp.architectures.domain.model

data class WineModel(
    val id: Int? = null,
    val winery: String? = null,
    val wine: String? = null,
    val location: String? = null,
    val rating: RatingModel? = null,
    val image: String? = null,
)

