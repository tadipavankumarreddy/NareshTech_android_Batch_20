package com.nareshtechnologies.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EmployeeDAO {

    @Insert
    fun insertData(employee: Employee)

    @Query("select * from employee")
    fun getData():List<Employee>
}