package com.example.example

import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin (

  @SerializedName("kind"       ) var kind       : String?          = null,
  @SerializedName("totalItems" ) var totalItems : Int?             = null,
  @SerializedName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)