package com.myapplication.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.myapplication.R

class RecommendsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recommends, container, false)
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(): RecommendsFragment {
            return RecommendsFragment()
        }
    }
}
