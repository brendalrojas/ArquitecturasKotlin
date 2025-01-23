package com.blrp.architectures.data.webservice

import com.blrp.architectures.data.model.WineResponse
import com.blrp.architectures.utils.Constants
import retrofit2.http.GET

interface WineApiService {
    @GET(Constants.PATH_WINES)
    suspend fun getWines(): List<WineResponse>
}