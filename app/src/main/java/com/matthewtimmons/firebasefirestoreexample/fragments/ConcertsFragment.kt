package com.matthewtimmons.firebasefirestoreexample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.ConcertRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.adapters.GameRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.models.Concert
import com.matthewtimmons.firebasefirestoreexample.models.Game
import com.matthewtimmons.firebasefirestoreexample.models.Movie
import com.matthewtimmons.firebasefirestoreexample.models.MovieTitles

class ConcertsFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, viewGroup: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_concerts, viewGroup, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO Replace this mock instance with a call to retrieve all Concerts from database
        // Mock list of Concerts
        val mockConcerts = getMockConcerts()

        // Get and set recyclerview
        val recyclerView = view.findViewById<RecyclerView>(R.id.concerts_recycler_view)
        val recyclerViewAdapter = ConcertRecyclerAdapter(mockConcerts)
        recyclerView.adapter = recyclerViewAdapter
    }

    // TODO Finish the creation of mock concerts
    fun getMockConcerts(): List<Concert> {
        return listOf(
            Concert(
                listOf(
                    "Blue Oyster Cult",
                    "Mothership",
                    "Others"), // TODO Actually enter the other bands here
                "Gas Monkey Live - Dallas, Texas",
                "10/19/2018",
                "https://ksassets.timeincuk.net/wp/uploads/sites/54/2018/06/screen-call-of-duty-black-ops-4-reveal-trailer-1.jpg"),
            Concert(
                listOf(
                    "Josh Groban"
                    ),
                "American Airlines Center - Dallas, Texas",
                "10/24/2018",
                "https://ksassets.timeincuk.net/wp/uploads/sites/54/2018/06/screen-call-of-duty-black-ops-4-reveal-trailer-1.jpg"),
            Concert(
                listOf(
                    "Silverstein",
                    "Hawthorne Heights",
                    "Others"), // TODO Actually enter the other bands here
                "Gas Monkey Bar & Grill - Dallas, Texas",
                "11/28/2018",
                "https://ksassets.timeincuk.net/wp/uploads/sites/54/2018/06/screen-call-of-duty-black-ops-4-reveal-trailer-1.jpg"),
            // TODO Add other concerts below
            Concert(
                listOf(
                    "Band 1",
                    "Band 2",
                    "Band 3"),
                "Gas Monkey Bar & Grill",
                "10/12/2018",
                "https://ksassets.timeincuk.net/wp/uploads/sites/54/2018/06/screen-call-of-duty-black-ops-4-reveal-trailer-1.jpg"),
            Concert(
                listOf(
                    "Band 1",
                    "Band 2",
                    "Band 3"),
                "Gas Monkey Bar & Grill",
                "10/12/2018",
                "https://ksassets.timeincuk.net/wp/uploads/sites/54/2018/06/screen-call-of-duty-black-ops-4-reveal-trailer-1.jpg")
        )
    }
}