package com.nareshtechnologies.sqlitedatabases

import android.content.ContentValues
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var result:TextView
    lateinit var helper: DatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.person_name)
        age = findViewById(R.id.person_age)
        result = findViewById(R.id.result)

        helper = DatabaseHelper(this)
    }

    fun saveData(view: View) {
        // get the data from the edittext boxes into variables
        val n = name.text.toString()
        val a = age.text.toString()
        val r = result.text.toString()

        // You can now perform insert operation here inorder to do that, you can first refer to `DatabaseHelper` class
        // TODO 1: Create the database and tables first
        val values = ContentValues()
        values.put(DatabaseHelper.COL_1,n)
        values.put(DatabaseHelper.COL_2,a)
        helper.insertData(values)
        Snackbar.make(view, "Successful",Snackbar.LENGTH_LONG).show()
        // Once the insert operation is performed, you should clear the editText Boxes
        name.text.clear()
        age.text.clear()
        name.clearFocus()
        age.clearFocus()
    }

    fun loadData(view: View) {
        val c:Cursor = helper.getAllData()
        result.text = ""
        c.moveToFirst()
        do{
            val id = c.getInt(0)
            val name = c.getString(1)
            val age = c.getInt(2)
            result.append("$id  $name  $age\n")
        }while(c.moveToNext())
    }
}