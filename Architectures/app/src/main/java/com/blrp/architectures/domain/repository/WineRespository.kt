package com.blrp.architectures.domain.repository

import com.blrp.architectures.domain.model.WineModel
import kotlinx.coroutines.flow.Flow

interface WineRepository {
    fun getWines(): Flow<List<WineModel>>
}