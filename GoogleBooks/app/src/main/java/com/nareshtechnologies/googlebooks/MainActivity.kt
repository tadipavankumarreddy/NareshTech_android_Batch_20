package com.nareshtechnologies.googlebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    var link:String = "https://www.googleapis.com/books/v1/volumes?q="
    lateinit var tli:TextInputLayout
    lateinit var probar:ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tli = findViewById(R.id.textInputLayout)
        probar = findViewById(R.id.progressBar)

        probar.visibility = View.INVISIBLE
    }

    fun searchBook(view: View) {
        val ss = tli.editText?.text.toString()
        val url = link+ss
        probar.visibility = View.VISIBLE

        // First Create a Volley New Request Queue
        val queue = Volley.newRequestQueue(this)

        // Create your stringRequest Object
        // Four arguments to be passed
        // 1. Request Type (GET/POST/PUT/UPDATE/DELETE)
        // 2. URL (String)
        // 3. ResponseListener
        // 4. ErrorListener
        val stringRequest = StringRequest(Request.Method.GET,url,Response.Listener { response ->
            // Whatever you want to do with the response you get, you write it here
            probar.visibility = View.INVISIBLE
            // For Debugging you can use Log
            Log.v("MAIN",response)
            startActivity(Intent(this,DataDisplayActivity::class.java)
                .putExtra("RES",response))
        }, Response.ErrorListener { Snackbar.make(view,"Error Occured",Snackbar.LENGTH_LONG).show() })

        queue.add(stringRequest)
    }
}