package com.blrp.architectures.data.respository

import com.blrp.architectures.domain.model.WineModel
import com.blrp.architectures.domain.repository.WineRepository
import kotlinx.coroutines.flow.Flow

class WineRepositoryImpl() : WineRepository {

    override fun getWines(): Flow<List<WineModel>> {
        TODO("Not yet implemented")
    }
}