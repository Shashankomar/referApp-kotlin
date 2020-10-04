package com.myapplication.apiservices


import com.myapplication.model.PostsItemModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getPosts(): Call<List<PostsItemModel>>
}