package com.matthewtimmons.firebasefirestoreexample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.models.MovieTitles

class MovieTitleRecyclerAdatper(var movieTitles: List<MovieTitles>): RecyclerView.Adapter<MovieTitleRecyclerAdatper.MovieTitleViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): MovieTitleViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.movie_card_view_title_only, viewGroup, false)
        return MovieTitleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieTitles.size
    }

    override fun onBindViewHolder(viewHolder: MovieTitleViewHolder, position: Int) {
        val currentMovieTitle = movieTitles[position]

        viewHolder.titleTextView.text = currentMovieTitle.title
    }

    class MovieTitleViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val titleTextView = view.findViewById<TextView>(R.id.movie_title_text_view)
    }
}