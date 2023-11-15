package com.nareshtechnologies.googlebooks.dataclasses

import com.google.gson.annotations.SerializedName


data class SourceData (

  @SerializedName("kind"       ) var kind       : String?          = null,
  @SerializedName("totalItems" ) var totalItems : Int?             = null,
  @SerializedName("items"      ) var items      : ArrayList<Items> = arrayListOf()

)