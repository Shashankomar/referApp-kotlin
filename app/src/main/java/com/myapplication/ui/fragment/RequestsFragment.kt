package com.myapplication.ui.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.myapplication.R
import com.myapplication.apiservices.ApiClient
import com.myapplication.model.PostsItemModel
import com.myapplication.ui.adapter.PostAdapter
import kotlinx.android.synthetic.main.fragment_requests.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RequestsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_requests, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        callPostApi()
    }

    private fun callPostApi() {
        setVisibility(View.GONE, View.VISIBLE)

        ApiClient.getClient.getPosts().enqueue(object : Callback<List<PostsItemModel>> {
            override fun onResponse(
                call: Call<List<PostsItemModel>>,
                response: Response<List<PostsItemModel>>
            ) {
                setVisibility(View.VISIBLE, View.GONE)
                setRecyclerView(response.body())
            }

            override fun onFailure(call: Call<List<PostsItemModel>>, t: Throwable) {
                setVisibility(View.VISIBLE, View.GONE)
            }
        })
    }

    private fun setVisibility(rvVisibility: Int, pbVisibility: Int) {
        rv_list.visibility = rvVisibility
        pb.visibility = pbVisibility
    }

    private fun setRecyclerView(postList: List<PostsItemModel>?) {
        rv_list.adapter = PostAdapter(context, postList)
        rv_list.layoutManager = LinearLayoutManager(context)
    }

    companion object {
        fun newInstance(): RequestsFragment {
            return RequestsFragment()
        }
    }
}