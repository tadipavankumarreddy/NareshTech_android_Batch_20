package com.nareshtechnologies.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.room.Room
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var result:TextView
    lateinit var room:PersonDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.person_name)
        age = findViewById(R.id.person_age)
        result = findViewById(R.id.result)

        // Initializing the room database
        room = Room.databaseBuilder(applicationContext,PersonDatabase::class.java,
            "pavan.db")
            .allowMainThreadQueries()
            .build()
    }

    fun saveData(view: View) {
        val n = name.text.toString()
        val a = age.text.toString().toInt()
        // We perform the database operation
        // tODO 1: Create the object
        val p = Person(1,n,a)
        room.personDao().insertData(p)
        Snackbar.make(view,"Success",Snackbar.LENGTH_LONG).show()

        name.text.clear()
        age.text.clear()
        name.clearFocus()
        age.clearFocus()
    }
    fun loadData(view: View) {

    }
}