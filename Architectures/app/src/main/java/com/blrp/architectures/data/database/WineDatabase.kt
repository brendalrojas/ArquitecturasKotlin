package com.blrp.architectures.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.blrp.architectures.data.database.dao.WineDao
import com.blrp.architectures.data.database.entity.WineEntity

@Database(entities = [WineEntity::class], version = 1, exportSchema = false)
abstract class WineDatabase : RoomDatabase() {
    abstract fun wineDao(): WineDao
}