package com.nareshtechnologies.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.room.Room
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(){
    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var result:TextView
    lateinit var employeeDatabase: EmployeeDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.person_name)
        age = findViewById(R.id.person_age)
        result = findViewById(R.id.result)

        employeeDatabase = Room.databaseBuilder(this,EmployeeDatabase::class.java,"Employee.db")
            .allowMainThreadQueries()
            .build()

    }

    fun saveData(view: View) {
        // TODO 1: Save the data from name and age edittext boxes into the shared Preferences
        val n = name.text.toString()
        val a = age.text.toString().toInt()

        val e = Employee(n,a)
        employeeDatabase.employeeDao().insertData(e)

        name.text.clear()
        age.text.clear()
        name.clearFocus()
        age.clearFocus()
        Snackbar.make(view, "Save Successful",Snackbar.LENGTH_LONG).show()
    }

    fun loadData(view: View) {
        val list = employeeDatabase.employeeDao().getData()
        result.text = ""
        for(e in list){
            result.append("${e.emp_id}   ${e.name}    ${e.age}\n")
        }
    }

}