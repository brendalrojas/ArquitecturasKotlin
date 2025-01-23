package com.blrp.architectures.data.respository

import com.blrp.architectures.data.database.dao.WineDao
import com.blrp.architectures.data.database.entity.WineEntity
import com.blrp.architectures.data.webservice.WineApiService
import com.blrp.architectures.domain.model.WineModel
import com.blrp.architectures.domain.repository.WineRepository
import com.blrp.architectures.utils.toWineModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WineRepositoryImpl @Inject constructor(
    private val wineService: WineApiService,
    private val wineDao: WineDao,
) : WineRepository {

    override suspend fun getWines(): Flow<List<WineModel>> = flow {
        emit(wineService.getWines().map { it.toWineModel() })
    }

    override suspend fun insertWine(wine: WineEntity) = wineDao.insertWine(wine)

    override suspend fun getAllWines(): Flow<List<WineModel>> = flow {
        emit(wineDao.getAllWines().map { it.toWineModel() })
    }

}