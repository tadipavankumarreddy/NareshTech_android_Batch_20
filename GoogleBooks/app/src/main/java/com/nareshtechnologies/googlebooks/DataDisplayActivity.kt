package com.nareshtechnologies.googlebooks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.google.gson.Gson
import com.nareshtechnologies.googlebooks.dataclasses.SourceData
import org.json.JSONObject

class DataDisplayActivity : AppCompatActivity() {
    /*lateinit var tv:TextView*/
    lateinit var recycle:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_display)
        // Catch the intent and extract data out of it
        /*tv = findViewById(R.id.textView)*/
        recycle = findViewById(R.id.recyclerview)
        val response = intent.getStringExtra("RES")
       /* // JSON Parsing
        val root = JSONObject(response!!)
        val itemsArray = root.getJSONArray("items")
        // Now, we need to loop through so that we get individual Items
        var i = 0
        tv.text = ""
        while(i<itemsArray.length()){
            val item =  itemsArray.getJSONObject(i)
            // You are now working with individual Items in the Items array
            val volInfo = item.getJSONObject("volumeInfo")
            val title = volInfo.getString("title")
            tv.text = tv.text.toString()+"\n"+title
            i++
        }*/

        val gson = Gson()
        val sd:SourceData = gson.fromJson(response,SourceData::class.java)
        var i = 0

        /*
        tv.text = ""
        while(i<sd.items.size){
            val title = sd.items.get(i).volumeInfo?.title
            tv.text = tv.text.toString()+"\n"+title
            i++
        }*/

        val ra = RecycleAdapter(this,sd.items)
        recycle.adapter = ra
        recycle.layoutManager = LinearLayoutManager(this)

    }
}