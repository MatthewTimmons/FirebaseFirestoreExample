package com.matthewtimmons.firebasefirestoreexample.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.matthewtimmons.firebasefirestoreexample.fragments.ConcertsFragment
import com.matthewtimmons.firebasefirestoreexample.fragments.GamesFragment
import com.matthewtimmons.firebasefirestoreexample.fragments.MoviesFragment

class EventPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    var COUNT_PAGES = 3
    var INDEX_MOVIES = 0
    var INDEX_GAMES = 1
    var INDEX_CONCERTS = 2

    override fun getItem(index: Int): Fragment {
        var fragment: Fragment? = null
        when (index) {
            INDEX_MOVIES -> {
                fragment = MoviesFragment()
            }
            INDEX_GAMES -> {
                fragment = GamesFragment()
            }
            INDEX_CONCERTS -> {
                fragment = ConcertsFragment()
            }
        }

        return fragment!!
    }

    override fun getCount(): Int {
        return COUNT_PAGES
    }
}