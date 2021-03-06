package com.matthewtimmons.firebasefirestoreexample.adapters

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.activities.DetailsActivity
import com.matthewtimmons.firebasefirestoreexample.models.Movie
import com.squareup.picasso.Picasso

class MovieRecyclerAdapter(var movies: List<Movie>): RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): MovieViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.movie_card_view, viewGroup, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(viewHolder: MovieViewHolder, position: Int) {
        val currentMovie = movies[position]

        // Set Text Views
        viewHolder.titleTextView.text = currentMovie.title
        viewHolder.genresTextView.text = currentMovie.genres
        viewHolder.ratingTextView.text = currentMovie.rating
        viewHolder.releaseDateTextView.text = currentMovie.releaseDate

        // Set poster ImageView
        Picasso.get().load(currentMovie.photoUrl).error(R.drawable.broken_image).into(viewHolder.moviePosterImageView)

        // Set click listener
        viewHolder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailsActivity::class.java)
            intent.putExtra("title", currentMovie.title)
            it.context.startActivity(intent)
        }
    }

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val titleTextView = view.findViewById<TextView>(R.id.movie_title_text_view)
        val genresTextView = view.findViewById<TextView>(R.id.movie_genres_text_view)
        val ratingTextView = view.findViewById<TextView>(R.id.movie_rating_text_view)
        val releaseDateTextView = view.findViewById<TextView>(R.id.movie_release_date_text_view)
        val moviePosterImageView = view.findViewById<ImageView>(R.id.movie_poster_image_view)
    }
}