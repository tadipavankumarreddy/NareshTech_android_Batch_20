package com.nareshtechnologies.retrofit

import com.nareshtechnologies.retrofit.PostRequest
import com.example.example.FakeGet
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

// TODO 5: Create an Interface to perform GET and POST requests (refer documentation)
//  create methods as well at this point

interface JsonTypicodeInterface {

    @GET("posts/1")
    fun getData():Call<FakeGet>

    @POST("posts")
    fun postData(@Body postRequest: PostRequest):Call<PostResponse>
}