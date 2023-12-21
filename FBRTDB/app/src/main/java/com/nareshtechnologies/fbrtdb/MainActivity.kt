package com.nareshtechnologies.fbrtdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var result: TextView
    lateinit var reference: DatabaseReference
    lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.person_name)
        age = findViewById(R.id.person_age)
        result = findViewById(R.id.result)
        progressBar = findViewById(R.id.progressBar)
        progressBar.visibility = ProgressBar.INVISIBLE
        reference = Firebase.database.reference
    }

    fun saveData(view: View) {
        val n = name.text.toString()
        val a: Int = age.text.toString().toInt()
        progressBar.visibility = ProgressBar.VISIBLE
        // write the logic for saving the data
        reference.child("Person").push().setValue(Person(n, a)).addOnSuccessListener {
            Toast.makeText(this, "Data Saved successfully", Toast.LENGTH_LONG).show()
            progressBar.visibility = ProgressBar.INVISIBLE
            name.text.clear()
            age.text.clear()
            name.clearFocus()
            age.clearFocus()
        }.addOnFailureListener {
            Toast.makeText(this, "Data Save unsuccessful", Toast.LENGTH_LONG).show()
            progressBar.visibility = ProgressBar.INVISIBLE
        }
    }

    fun loadData(view: View) {
        progressBar.visibility = ProgressBar.VISIBLE
        val postListener: ValueEventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values to update the UI
                progressBar.visibility = ProgressBar.INVISIBLE
                result.text = ""
                for (s in dataSnapshot.children) {
                    val p: Person = s.getValue(Person::class.java) as Person
                    result.append("${p.name}  ${p.age}\n")
                }
            }

            override fun onCancelled(error: DatabaseError) {
                progressBar.visibility = ProgressBar.INVISIBLE
            }
        }
        reference.child("Person").addValueEventListener(postListener)
    }

}