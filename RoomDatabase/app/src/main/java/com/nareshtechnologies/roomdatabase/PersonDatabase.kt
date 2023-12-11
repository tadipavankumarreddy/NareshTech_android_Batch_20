package com.nareshtechnologies.roomdatabase


import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Personsss::class], version = 1)
abstract class PersonDatabase:RoomDatabase() {
    abstract fun personDao():PersonDAO
}