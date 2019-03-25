package com.matthewtimmons.firebasefirestoreexample.helpers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.models.*

class InitializeFirestoreData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_init_firestore)
        val firestore = FirebaseFirestore.getInstance()

        for (movieTitle in getMockMoviesTitleOnly()) {
            firestore.collection("movieTitles").document(movieTitle.title).set(movieTitle)
        }

        for (movie in getMockMovies()) {
            firestore.collection("movies").document(movie.title).set(movie)
        }

        for (concert in getMockConcerts()) {
            firestore.collection("concerts").document(concert.concertBandsArray[0]).set(concert)
        }

        for (game in getMockGames()) {
            firestore.collection("games").document(game.title).set(game)
        }

        val exampleUser = User("ExampleUser", arrayListOf<String>(), arrayListOf<String>(), arrayListOf<String>())
        firestore.collection("users").document("exampleUser").set(exampleUser)
    }

    fun getMockMoviesTitleOnly(): List<MovieTitle> {
        return listOf(
            MovieTitle("Black Panther"),
            MovieTitle("Avengers: Infinity War"),
            MovieTitle("Deadpool 2"),
            MovieTitle("Ant-Man and the Wasp"),
            MovieTitle("Spider-Man: Into the Spider-Verse")
        )
    }

    fun getMockMovies(): List<Movie> {
        return listOf(
            Movie("Black Panther",
                "02/16/2018",
                "Action, Adventure, Sci-Fi",
                "PG-13",
                "https://m.media-amazon.com/images/M/MV5BMTg1MTY2MjYzNV5BMl5BanBnXkFtZTgwMTc4NTMwNDI@._V1_SY1000_CR0,0,674,1000_AL_.jpg"),
            Movie("Avengers: Infinity War",
                "04/27/2018",
                "Action, Adventure, Fantasy",
                "PG-13",
                "https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_UX182_CR0,0,182,268_AL_.jpg"),
            Movie("Deadpool 2",
                "05/18/2018",
                "Action, Adventure, Comedy",
                "R",
                "https://m.media-amazon.com/images/M/MV5BNjk1Njk3YjctMmMyYS00Y2I4LThhMzktN2U0MTMyZTFlYWQ5XkEyXkFqcGdeQXVyODM2ODEzMDA@._V1_UY268_CR43,0,182,268_AL_.jpg"),
            Movie("Ant-Man and the Wasp",
                "07/06/2018",
                "Action, Adventure, Comedy",
                "PG-13",
                "https://m.media-amazon.com/images/M/MV5BYjcyYTk0N2YtMzc4ZC00Y2E0LWFkNDgtNjE1MzZmMGE1YjY1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX182_CR0,0,182,268_AL_.jpg"),
            Movie("Spider-Man: Into the Spider-Verse",
                "12/14/2018",
                "Animation, Action, Adventure",
                "PG",
                "https://m.media-amazon.com/images/M/MV5BMjMwNDkxMTgzOF5BMl5BanBnXkFtZTgwNTkwNTQ3NjM@._V1_UX182_CR0,0,182,268_AL_.jpg")
        )
    }

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