package com.myapplication.ui.main.apiservices


import com.myapplication.model.PostsModelItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    fun getPosts(): Call<List<PostsModelItem>>
}