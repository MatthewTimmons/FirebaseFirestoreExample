package com.matthewtimmons.firebasefirestoreexample.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.adapters.MovieRecyclerAdapter
import com.matthewtimmons.firebasefirestoreexample.models.Movie

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Replace this mock instance with a call to retrieve all movies from database
        // Mock list of movies
        val mockMovies = listOf<Movie>(
                Movie("Black Panther"),
                Movie("Avengers: Infinity War"),
                Movie("Deadpool 2"),
                Movie("Ant-Man and the Wasp"),
                Movie("Spider-Man: Into the Spider-Verse")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.movies_recycler_view)
        val recyclerViewAdapter = MovieRecyclerAdapter(mockMovies)
        recyclerView.adapter = recyclerViewAdapter
    }
}
