@file:Suppress("DEPRECATION")

package com.myapplication.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.myapplication.R

private val TAB_TITLES = arrayOf(
    R.string.requests,
    R.string.offering,
    R.string.recommends
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> {
                RequestsFragment.newInstance()
            }
            1 -> {
                OfferingFragment.newInstance()
            }
            else -> {
                RecommendsFragment.newInstance()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 3
    }
}