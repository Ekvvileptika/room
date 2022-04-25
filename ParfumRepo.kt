package com.example.myapplication.repository.parfumrepo

import androidx.lifecycle.LiveData
import com.example.myapplication.room.parfum.ParfumDao
import com.example.myapplication.room.parfum.ParfumModel
import javax.inject.Inject

class ParfumRepo @Inject constructor(
    val db: ParfumDao
): IParfumRepo {
    override suspend fun insert(item: ParfumModel) {
        db.insert(item)
    }

    override fun select(): LiveData<List<ParfumModel>> = db.getAllData()


    override suspend fun delete(item: ParfumModel) {
        db.deleteItem(item)
    }
}