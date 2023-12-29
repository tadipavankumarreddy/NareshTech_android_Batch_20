package com.nareshtech.batch19.coroutinesandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.*
import java.lang.StringBuilder
import java.net.HttpURLConnection
import java.net.URL
import java.util.Scanner
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scope = CoroutineScope(Dispatchers.IO)

        val data:Deferred<String> = scope.async {
            val url = URL("https://api.chucknorris.io/jokes/random")
            val connection = url.openConnection() as HttpsURLConnection
            val ips = connection.inputStream
            val s:Scanner = Scanner(ips)
            var lin:String = ""
            var sb = StringBuilder()
            do{
                lin = s.nextLine()
                sb.append(lin)
            }while(s.hasNext())

            sb.toString()
        }
        scope.launch {
            val d = data.await()
            withContext(Dispatchers.Main){
                Toast.makeText(applicationContext,d,Toast.LENGTH_LONG).show()
            }
        }


    }

    fun getData() {

    }
}