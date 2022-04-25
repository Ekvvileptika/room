package com.example.myapplication.room.parfum

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(ParfumModel::class), version = 1, exportSchema = false)
abstract class ParfumDatabase: RoomDatabase() {
    abstract val parfumdao: ParfumDao
}