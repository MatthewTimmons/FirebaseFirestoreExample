package com.matthewtimmons.firebasefirestoreexample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.models.Game
import com.squareup.picasso.Picasso

class GameRecyclerAdapter(var games: List<Game>): RecyclerView.Adapter<GameRecyclerAdapter.GameViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): GameViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.game_card_view, viewGroup, false)
        return GameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return games.size
    }

    override fun onBindViewHolder(viewHolder: GameViewHolder, position: Int) {
        val currentGame = games[position]

        viewHolder.titleTextView.text = currentGame.title
        viewHolder.releaseConsolesTextView.text = currentGame.releaseConsoles
        viewHolder.ratingTextView.text = currentGame.rating
        viewHolder.releaseDateTextView.text = currentGame.releaseDate

        //Set poster Image View
        Picasso.get().load(currentGame.photoUrl).error(R.drawable.broken_image).into(viewHolder.gamePosterImageView)
    }

    class GameViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val titleTextView = view.findViewById<TextView>(R.id.game_title_text_view)
        val releaseConsolesTextView = view.findViewById<TextView>(R.id.concert_location_text_view)
        val ratingTextView = view.findViewById<TextView>(R.id.game_rating_text_view)
        val releaseDateTextView = view.findViewById<TextView>(R.id.game_release_date_text_view)
        val gamePosterImageView = view.findViewById<ImageView>(R.id.game_poster_image_view)
    }
}