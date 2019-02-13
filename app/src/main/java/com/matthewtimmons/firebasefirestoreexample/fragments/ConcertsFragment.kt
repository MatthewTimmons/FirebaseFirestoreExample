package com.matthewtimmons.firebasefirestoreexample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.firestore.FirebaseFirestore
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.ConcertRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.models.Concert

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
                    "Journey",
                    "Def Leppard"),
                "American Airlines Center - Dallas, Texas",
                "07/29/2018",
                "https://www.prucenter.com/assets/event-main/_639x639_crop_center-center/defleppard1.jpg"),
            Concert(
                listOf(
                    "Avenged Sevenfold",
                    "Prophets of Rage"),
                "Dos Equis Pavilion - Dallas, Texas",
                "09/01/2018",
                "https://www.altitudetickets.com/assets/img/Avenged-Sevenfold-Event-2018-7f0d260668.jpg"),
            Concert(
                listOf(
                    "Blue Oyster Cult",
                    "Mothership",
                    "Novakain"),
                "Gas Monkey Live - Dallas, Texas",
                "10/19/2018",
                "https://image-ticketfly.imgix.net/00/02/91/14/64-og.jpg?w=500&h=334&fit=crop&crop=top"),
            Concert(
                listOf(
                    "Josh Groban"
                    ),
                "American Airlines Center - Dallas, Texas",
                "10/24/2018",
                "https://images-na.ssl-images-amazon.com/images/I/81mo7OmSa9L._SX355_.jpg"),
            Concert(
                listOf(
                    "Silverstein",
                    "Hawthorne Heights",
                    "As Cities Burn",
                    "Capstan"),
                "Gas Monkey Bar & Grill - Dallas, Texas",
                "11/28/2018",
                "https://www.bowerypresents.com/media/image/348657/678/399?s=a38f32e04c5696f6d2738d3d4b06d51f4d2ef83237d6d609a834f75e42a520fe")
        )
    }
}