package com.myapplication.model

import com.google.gson.annotations.SerializedName

data class PostsModelItem(

    @SerializedName("userId") val userId : Int,

    @SerializedName("id") val id : Int,

    @SerializedName("title") val title : String,

    @SerializedName("body") val body : String
)