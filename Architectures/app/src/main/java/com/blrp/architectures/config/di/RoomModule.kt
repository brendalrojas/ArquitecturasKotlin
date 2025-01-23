package com.blrp.architectures.config.di

import android.content.Context
import androidx.room.Room
import com.blrp.architectures.data.database.WineDatabase
import com.blrp.architectures.data.database.dao.WineDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RoomModule {

    @Provides
    @Singleton
    fun provideWineDao(wineDatabase: WineDatabase): WineDao {
        return wineDatabase.wineDao()
    }

    @Provides
    @Singleton
    fun provideWineDatabase(@ApplicationContext context: Context): WineDatabase {
        return Room.databaseBuilder(
            context = context,
            WineDatabase::class.java,
            "wine_database"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}