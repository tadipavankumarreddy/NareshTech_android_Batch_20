package com.nareshtechnologies.googlebooks.dataclasses

import com.google.gson.annotations.SerializedName


data class PanelizationSummary (

  @SerializedName("containsEpubBubbles"  ) var containsEpubBubbles  : Boolean? = null,
  @SerializedName("containsImageBubbles" ) var containsImageBubbles : Boolean? = null

)