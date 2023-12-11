package com.nareshtechnologies.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employee")
data class Employee(val name:String, val age:Int){
    @PrimaryKey(autoGenerate = true)
    var emp_id:Int = 0
}