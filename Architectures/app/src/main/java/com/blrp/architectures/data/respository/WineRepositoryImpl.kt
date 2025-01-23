package com.blrp.architectures.data.respository

import android.util.Log
import com.blrp.architectures.data.model.toWineModel
import com.blrp.architectures.data.webservice.WineApiService
import com.blrp.architectures.domain.model.WineModel
import com.blrp.architectures.domain.repository.WineRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WineRepositoryImpl @Inject constructor(
    private val wineService: WineApiService,
) : WineRepository {

    override suspend fun getWines(): Flow<List<WineModel>> = flow {
        val data: List<WineModel> = wineService.getWines().map { wine ->
            wine.toWineModel()
        }
        emit(data)
    }

}