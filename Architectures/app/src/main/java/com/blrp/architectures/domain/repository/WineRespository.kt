package com.blrp.architectures.domain.repository

import com.blrp.architectures.data.database.entity.WineEntity
import com.blrp.architectures.domain.model.WineModel
import kotlinx.coroutines.flow.Flow

interface WineRepository {
    suspend fun getWines(): Flow<List<WineModel>>

    suspend fun insertWine(wine: WineEntity)

    suspend fun getAllWines(): Flow<List<WineModel>>
}