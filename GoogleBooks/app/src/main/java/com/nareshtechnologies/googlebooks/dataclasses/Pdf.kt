package com.nareshtechnologies.googlebooks.dataclasses

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Pdf (

  @SerializedName("isAvailable" ) var isAvailable : Boolean? = null

): Serializable