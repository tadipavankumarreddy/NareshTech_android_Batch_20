package com.nareshtechnologies.roomdatabase

import android.app.Person
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Person::class], version = 1)
abstract class PersonDatabase:RoomDatabase() {
    abstract fun personDao():PersonDAO
}