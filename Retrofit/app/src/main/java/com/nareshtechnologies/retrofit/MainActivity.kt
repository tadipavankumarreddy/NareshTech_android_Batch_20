package com.nareshtechnologies.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.example.FakeGet
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
    // TODO (6) Initialize the Interface to null initially.
    var jsonTypicodeInterface: JsonTypicodeInterface? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO (7) initialize the Retrofit Object as follows
        val retrofit:Retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // TODO (8) create the interface as follows
        jsonTypicodeInterface = retrofit.create(JsonTypicodeInterface::class.java)

    }

    // TODO (3) Implement Post Request
    fun postRequest(view: View) {
        // TODO (9) Implement Post Request
        jsonTypicodeInterface?.postData(PostRequest("Pavan","Trainer",101))?.enqueue(object: Callback<PostResponse>{
            override fun onResponse(call: Call<PostResponse>, response: Response<PostResponse>) {
                Log.d("MAIN",response.body().toString())
            }

            override fun onFailure(call: Call<PostResponse>, t: Throwable) {

            }
        })
    }

    // TODO (2) Implement Get Request
    fun getRequest(view: View) {
        // TODO (8) Implement Get Request with enqueue(...) help.
        //  with this you get the onResponse and onFailure
        jsonTypicodeInterface?.getData()?.enqueue(object : Callback<FakeGet> {
            override fun onResponse(call: Call<FakeGet>, response: Response<FakeGet>) {
                val posts = response.body()
                // Handle successful response
                Log.d("MAIN",posts.toString())
            }

            override fun onFailure(call: Call<FakeGet>, t: Throwable) {
                // Handle error
            }
        })
    }
}