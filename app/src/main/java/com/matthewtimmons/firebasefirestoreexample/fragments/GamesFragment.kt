package com.matthewtimmons.firebasefirestoreexample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.firestore.FirebaseFirestore
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.GameRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.models.Game

class GamesFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, viewGroup: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_games, viewGroup, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Mock list of Games
        // TODO Replace this mock instance with a call to retrieve all Games from database
        val mockGames = getMockGames()

        // Get and set recyclerview
        val recyclerView = view.findViewById<RecyclerView>(R.id.games_recycler_view)
        val recyclerViewAdapter = GameRecyclerAdapter(mockGames)
        recyclerView.adapter = recyclerViewAdapter
    }

    fun getMockGames(): List<Game> {
        return listOf(
            Game("Call of Duty: Black Ops 4",
                "10/12/2018",
                "PC, Xbox One, Playstation 4",
                "M",
                "https://ksassets.timeincuk.net/wp/uploads/sites/54/2018/06/screen-call-of-duty-black-ops-4-reveal-trailer-1.jpg"),
            Game("Red Dead Redemption 2",
                "10/26/2018",
                "Xbox One, Playstation 4",
                "M",
                "https://media.playstation.com/is/image/SCEA/red-dead-redemption-2-listing-thumb-01-ps4-us-18oct16?"),
            Game("Shadow of the Tomb Raider",
                "09/14/2018",
                "PC, Xbox One, Playstation 4",
                "M",
                "https://steamcdn-a.akamaihd.net/steamcommunity/public/images/clans/32341898/5b83592ca76d41f1f2264f2122a617c7663efd36.png"),
            Game("Spiderman",
                "09/07/2018",
                "Playstation 4",
                "T",
                "https://upload.wikimedia.org/wikipedia/en/thumb/e/e1/Spider-Man_PS4_cover.jpg/220px-Spider-Man_PS4_cover.jpg"),
            Game("Super Mario Party",
                "10/05/2018",
                "Nintendo Switch",
                "E10+",
                "https://m.media-amazon.com/images/M/MV5BOWU2NTBmNjUtN2ExNC00MzdlLWE0ZGYtN2M2YTA1YmZmYzcxXkEyXkFqcGdeQXVyMzY0MDAyMDI@._V1_.jpg")
        )
    }
}