package com.nareshtechnologies.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonDAO {

    @Insert
    fun insertData(person:Person)

    @Query("Select * from Person")
    fun getData():List<Person>
}