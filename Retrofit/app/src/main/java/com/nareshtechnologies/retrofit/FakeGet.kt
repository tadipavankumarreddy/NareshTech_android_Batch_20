package com.example.example

import com.google.gson.annotations.SerializedName


// TODO 8.1 to get the data, you require the model class that represents the data
data class FakeGet (
  @SerializedName("userId" ) var userId : Int?    = null,
  @SerializedName("id"     ) var id     : Int?    = null,
  @SerializedName("title"  ) var title  : String? = null,
  @SerializedName("body"   ) var body   : String? = null
)