package com.blrp.architectures.config.di

import com.blrp.architectures.data.respository.WineRepositoryImpl
import com.blrp.architectures.data.webservice.WineApiService
import com.blrp.architectures.domain.repository.WineRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

   @Singleton
   @Provides
    fun provideWineRepository(
        wineService: WineApiService
    ): WineRepository {
        return WineRepositoryImpl(wineService)
    }

}