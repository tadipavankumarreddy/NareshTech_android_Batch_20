package com.nareshtechnologies.dogfacts

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.loader.content.AsyncTaskLoader
import org.w3c.dom.Text
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.util.Scanner
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {

    val link:String = "https://dog-api.kinduff.com/api/facts"
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView)
        //Perform the network operation
        // TODO 1: Set the url
        // TODO 2: Perfrom fetching data from network
        FetchData(tv).execute(link)
    }

    fun getAnotherFact(view: View) {
        FetchData(tv).execute(link)
    }

    class FetchData(val tv:TextView):AsyncTask<String,Void,String>(){

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            tv.text = result
        }
        // This is the method that does the background operation
        override fun doInBackground(vararg params: String?): String {
            // Fetch the data and return the results as a String
            val url:String? = params[0]
            // convert it to URL object
            val u = URL(url)
            // Open the connection
            val c = u.openConnection() as HttpsURLConnection
            // You are interested in inputStream because we want to read that
            val ips = c.inputStream
            // Follow the process to read the data from the inputStream
            val br = Scanner(ips)
            var l = ""
            var sb = StringBuilder()
            while(br.hasNext()){
                sb.append(br.nextLine())
            }
            return sb.toString()
        }

    }
}