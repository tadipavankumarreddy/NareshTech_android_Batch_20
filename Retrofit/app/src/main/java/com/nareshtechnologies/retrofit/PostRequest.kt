package com.nareshtechnologies.retrofit

// TODO 9.1 you require to send data to the url as json data. you need a representation of the data as a model class

data class PostRequest(val title:String, val body:String, val id:Int)
