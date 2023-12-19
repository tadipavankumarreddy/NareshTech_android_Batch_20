package com.nareshtechnologies.contentresolver

import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object{
        const val TABLE_NAME = "person"
        const val COL_0 = "person_id"
        const val COL_1 = "person_name"
        const val COL_2 = "person_age"
    }

    lateinit var tv:TextView
    val AUTHORITY = "content://com.nareshtechnologies.sqlitedatabases.CONTENT_URI"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textv)
    }

    fun fetchData(view: View) {
        val uri = Uri.parse(AUTHORITY)

        tv.text = ""

        val c:Cursor? = contentResolver.query(uri,null,null,null,null,null)
        c?.moveToFirst()
        do{
            val id = c?.getInt(0)
            val name = c?.getString(1)
            val age = c?.getInt(2)
            tv.append("$id  $name  $age\n")
        }while(c?.moveToNext() == true)

    }

    fun saveData(view: View) {
        val uri = Uri.parse(AUTHORITY)
        // Create a content Resolver
        val values = ContentValues()
        values.put(COL_1,"Fake Data")
        values.put(COL_2,23)

        contentResolver.insert(uri,values)
    }
}