package com.nareshtechnologies.roomdatabase

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Person(
    @PrimaryKey val person_id:Int,
    val person_name:String,
    val person_age:Int
)