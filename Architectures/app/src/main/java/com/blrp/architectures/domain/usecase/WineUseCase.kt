package com.blrp.architectures.domain.usecase

import com.blrp.architectures.domain.model.WineModel
import com.blrp.architectures.domain.repository.WineRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WineUseCase @Inject constructor(
    private val repository: WineRepository,
) {
    suspend operator fun invoke(): Flow<List<WineModel>> {
        return repository.getWines()
    }
}