package com.blrp.architectures.data.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.blrp.architectures.data.database.entity.WineEntity
import com.blrp.architectures.domain.model.WineModel

@Dao
interface WineDao {

    @Insert
    fun insertWine(wine: WineEntity)

    @Query("SELECT * FROM wine_table")
    suspend fun getAllWines(): List<WineEntity>

}