package com.blrp.architectures.domain.usecase

import com.blrp.architectures.domain.model.WineModel
import com.blrp.architectures.domain.repository.WineRepository
import kotlinx.coroutines.flow.Flow

class WineUseCase(
    private val repository: WineRepository,
) {
    operator fun invoke(): Flow<List<WineModel>> {
        return repository.getWines()
    }
}