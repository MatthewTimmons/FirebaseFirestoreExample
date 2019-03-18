package com.matthewtimmons.firebasefirestoreexample.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.firestore.FirebaseFirestore
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieTitleRecyclerAdatper
import com.matthewtimmons.firebasefirestoreexample.models.Movie
import com.matthewtimmons.firebasefirestoreexample.models.MovieTitle

class MoviesFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, viewGroup: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_movies, viewGroup, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Movie Titles Only //
        // TODO Replace this mock instance with a call to retrieve all Movie Titles from database
        val mockMovieTitles = getMockMoviesTitleOnly()
        val recyclerViewAdapter = MovieTitleRecyclerAdatper(mockMovieTitles) // Movie titles only

        // Full Movie Details //
//        val mockMovies = getMockMovies()
//        val recyclerViewAdapter = MovieRecyclerAdapter(mockMovies) // Full movies

        // Get and set recyclerview
        val recyclerView = view.findViewById<RecyclerView>(R.id.movies_recycler_view)
        recyclerView.adapter = recyclerViewAdapter
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
}