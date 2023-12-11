package com.nareshtechnologies.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person")
class Personsss{
    val person_name:String?=null
    val person_age:Int = 0
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0
}