package com.example.myapplication.repository.parfumrepo

import androidx.lifecycle.LiveData
import com.example.myapplication.room.parfum.ParfumModel

interface IParfumRepo {
    suspend fun insert(item: ParfumModel)
    fun select(): LiveData<List<ParfumModel>>
    suspend fun delete(item: ParfumModel)
}