package com.myapplication.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.myapplication.R
import com.myapplication.ui.adapter.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val sectionsPagerAdapter =
            SectionsPagerAdapter(
                this,
                supportFragmentManager
            )

        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)

        fab.setOnClickListener { view ->
            Snackbar.make(view, getString(R.string.clicked), Snackbar.LENGTH_LONG).show()
        }
    }
}