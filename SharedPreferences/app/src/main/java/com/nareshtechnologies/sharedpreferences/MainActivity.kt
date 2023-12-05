package com.nareshtechnologies.sharedpreferences

import android.content.SharedPreferences
import android.content.SharedPreferences.OnSharedPreferenceChangeListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), OnSharedPreferenceChangeListener {
    lateinit var name:EditText
    lateinit var age:EditText
    lateinit var result:TextView
    lateinit var preferences:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.person_name)
        age = findViewById(R.id.person_age)
        result = findViewById(R.id.result)

        preferences = getSharedPreferences("data_shared_preferences", MODE_PRIVATE)
        preferences.registerOnSharedPreferenceChangeListener(this)
    }

    fun saveData(view: View) {
        // TODO 1: Save the data from name and age edittext boxes into the shared Preferences
        val n = name.text.toString()
        val a = age.text.toString().toInt()

        val e = preferences.edit()
        e.putString("NAME",n)
        e.putInt("AGE",a)
        e.putFloat("WEIGHT",87.09f)
        e.apply() // only at this point your changes to the sharedpreferences will apply.

        Snackbar.make(view, "Save Successful",Snackbar.LENGTH_LONG).show()
    }

    fun loadData(view: View) {
        // TODO 2: Load the data from the shared Preferences to name and age edittext boxes
        val n = preferences.getString("NAME","No Data Found")
        /*preferences.edit().clear().apply() - This clears the data*/
        val a = preferences.getInt("AGE",0)
        result.text = "$n \n $a"
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences?, key: String?) {

        val n = preferences?.getString("NAME","No Data Found")
        /*preferences.edit().clear().apply() - This clears the data*/
        val a = preferences?.getInt("AGE",0)
        result.text = "$n \n $a"
    }
}