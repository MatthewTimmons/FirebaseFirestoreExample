package com.matthewtimmons.firebasefirestoreexample.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.widget.RecyclerView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.EventPagerAdapter
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieTitleRecyclerAdatper
import com.matthewtimmons.firebasefirestoreexample.models.Movie
import com.matthewtimmons.firebasefirestoreexample.models.MovieTitles

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager = findViewById<ViewPager>(R.id.viewpager)
        val viewPagerAdapter = EventPagerAdapter(supportFragmentManager)
        viewpager.adapter = viewPagerAdapter
    }

}
