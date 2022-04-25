package com.example.myapplication.hilt.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.repository.parfumrepo.IParfumRepo
import com.example.myapplication.repository.parfumrepo.ParfumRepo
import com.example.myapplication.room.parfum.ParfumDao
import com.example.myapplication.room.parfum.ParfumDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
object ParfumModule {

    @Provides
    @Singleton
    fun parfumDb(
        @ApplicationContext context: Context
    ): ParfumDatabase{
        return Room.databaseBuilder(
            context,
            ParfumDatabase::class.java,
            "parfum.db"
        ).build()
    }

    @Provides
    @Singleton
    fun getParfumDao(
        db: ParfumDatabase
    ): ParfumDao{
        return db.parfumdao
    }

    @Provides
    @Singleton
    fun repositoryInjector(
        dao: ParfumDao
    ): IParfumRepo {
        return ParfumRepo(dao) as IParfumRepo
    }
}