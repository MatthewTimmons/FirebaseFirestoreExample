package com.matthewtimmons.firebasefirestoreexample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.models.Movie

class MovieRecyclerAdapter(var movies: List<Movie>): RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): MovieViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.movie_card_view, viewGroup, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(viewHolder: MovieViewHolder, position: Int) {
        val currentMovieTitle = movies[position]

        viewHolder.titleTextView.text = currentMovieTitle.title
        viewHolder.genresTextView.text = currentMovieTitle.genres
        viewHolder.ratingTextView.text = currentMovieTitle.rating
        viewHolder.releaseDateTextView.text = currentMovieTitle.releaseDate

        // TODO Set up poster Image View using Picasso

    }

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val titleTextView = view.findViewById<TextView>(R.id.movie_title_text_view)
        val genresTextView = view.findViewById<TextView>(R.id.movie_genres_text_view)
        val ratingTextView = view.findViewById<TextView>(R.id.movie_rating_text_view)
        val releaseDateTextView = view.findViewById<TextView>(R.id.movie_release_date_text_view)
    }
}