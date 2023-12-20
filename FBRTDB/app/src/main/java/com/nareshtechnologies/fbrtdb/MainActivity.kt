package com.nareshtechnologies.fbrtdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var result:TextView
    lateinit var reference: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.person_name)
        age = findViewById(R.id.person_age)
        result = findViewById(R.id.result)
        reference = Firebase.database.reference
    }

    fun saveData(view: View) {
        val n = name.text.toString()
        val a:Int = age.text.toString().toInt()

        // write the logic for saving the data
        reference.child("Person").push().setValue(Person(n,a))

        name.text.clear()
        age.text.clear()
        name.clearFocus()
        age.clearFocus()
    }
    fun loadData(view: View) {

    }
}