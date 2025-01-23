package com.blrp.architectures.domain.usecase

import com.blrp.architectures.domain.model.WineModel
import com.blrp.architectures.domain.repository.WineRepository
import com.blrp.architectures.utils.toWineEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WineUseCase @Inject constructor(
    private val repository: WineRepository,
) {
    suspend operator fun invoke(): Flow<List<WineModel>> {
        return repository.getWines()
    }

    suspend fun insertWine(wineModel: WineModel) {
        repository.insertWine(wineModel.toWineEntity())
    }

    suspend fun getAllWines(): Flow<List<WineModel>> {
        return repository.getAllWines()
    }
}