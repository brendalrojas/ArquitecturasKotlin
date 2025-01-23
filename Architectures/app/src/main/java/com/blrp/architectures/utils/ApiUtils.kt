package com.blrp.architectures.utils

import com.blrp.architectures.domain.model.WineModel
import com.google.gson.Gson
import com.google.gson.JsonParser

fun getWineUtil(actionUrl: String): WineModel? {
    return try {
        Gson().fromJson(
            JsonParser.parseString(actionUrl).asJsonObject,
            WineModel::class.java,
        )
    } catch (e: Exception) {
        null
    }
}
