package com.blrp.architectures.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wine_table")
data class WineEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val winery: String,
    val wine: String,
    val location: String,
    val image: String,
)