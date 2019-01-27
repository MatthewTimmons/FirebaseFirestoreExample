package com.matthewtimmons.firebasefirestoreexample.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieTitleRecyclerAdatper
import com.matthewtimmons.firebasefirestoreexample.models.Movie
import com.matthewtimmons.firebasefirestoreexample.models.MovieTitles

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Replace this mock instance with a call to retrieve all Movie Titles from database
        // Mock list of Movies
        val mockMovies = getMockMovies()

        // Get and set recyclerview
        val recyclerView = findViewById<RecyclerView>(R.id.movies_recycler_view)
//        val recyclerViewAdapter = MovieTitleRecyclerAdatper(mockMovies) // Movie titles only
        val recyclerViewAdapter = MovieRecyclerAdapter(mockMovies) // Full movies
        recyclerView.adapter = recyclerViewAdapter
    }

    fun getMockMoviesTitleOnly(): List<MovieTitles> {
        return listOf(
                MovieTitles("Black Panther"),
                MovieTitles("Avengers: Infinity War"),
                MovieTitles("Deadpool 2"),
                MovieTitles("Ant-Man and the Wasp"),
                MovieTitles("Spider-Man: Into the Spider-Verse")
        )
    }

    fun getMockMovies(): List<Movie> {
        return listOf(
                Movie("Black Panther",
                        "01/01/2019",
                        "Action",
                        "PG-13",
                        "images.google.com/1234"),
                Movie("Avengers: Infinity War",
                        "01/01/2019",
                        "Action",
                        "PG-13",
                        "images.google.com/1234"),
                Movie("Deadpool 2",
                        "01/01/2019",
                        "Action",
                        "PG-13",
                        "images.google.com/1234"),
                Movie("Ant-Man and the Wasp",
                        "01/01/2019",
                        "Action",
                        "PG-13",
                        "images.google.com/1234"),
                Movie("Spider-Man: Into the Spider-Verse",
                        "01/01/2019",
                        "Action",
                        "PG-13",
                        "images.google.com/1234")
        )
    }
}
