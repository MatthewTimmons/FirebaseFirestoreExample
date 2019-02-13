package com.matthewtimmons.firebasefirestoreexample.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.EventPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpager = findViewById<ViewPager>(R.id.viewpager)
        val viewPagerAdapter = EventPagerAdapter(supportFragmentManager)
        viewpager.adapter = viewPagerAdapter

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.action_movies -> {
                    viewpager.currentItem = viewPagerAdapter.INDEX_MOVIES
                    true
                }
                R.id.action_games -> {
                    viewpager.currentItem = viewPagerAdapter.INDEX_GAMES
                    true
                }
                R.id.action_concerts -> {
                    viewpager.currentItem = viewPagerAdapter.INDEX_CONCERTS
                    true
                }
                else -> {
                    false
                }
            }
        }

        // Set Bottom Nav Bar to View.GONE //
//        bottomNavigationView.visibility = View.GONE
    }

}
