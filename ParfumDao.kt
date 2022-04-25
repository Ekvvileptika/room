package com.example.myapplication.room.parfum

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ParfumDao {
    @Insert
    suspend fun insert(item: ParfumModel)

    @Query("SELECT * FROM Parfum")
    fun getAllData(): LiveData<List<ParfumModel>>

    @Delete
    suspend fun deleteItem(item: ParfumModel)
}