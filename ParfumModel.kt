package com.example.myapplication.room.parfum

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Parfum")
data class ParfumModel (
    @PrimaryKey(autoGenerate = true) val id: Int? = null,
    val name: String,
    val productcode: Int
)