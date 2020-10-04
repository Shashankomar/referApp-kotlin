package com.myapplication.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myapplication.R
import com.myapplication.model.PostsModelItem

class PostAdapter(val context: Context?, private val postList: List<PostsModelItem>?) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        holder.tvTitle.text = postList?.get(pos)?.title
        holder.tvBody.text = postList?.get(pos)?.body
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle: TextView = view.findViewById(R.id.tv_title)
        val tvBody: TextView = view.findViewById(R.id.tv_body)
    }
}