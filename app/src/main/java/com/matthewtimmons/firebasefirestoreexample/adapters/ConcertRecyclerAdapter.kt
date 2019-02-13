package com.matthewtimmons.firebasefirestoreexample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.models.Concert
import com.squareup.picasso.Picasso

class ConcertRecyclerAdapter(var concerts: List<Concert>): RecyclerView.Adapter<ConcertRecyclerAdapter.ConcertViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ConcertViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.concert_card_view, viewGroup, false)
        return ConcertViewHolder(view)
    }

    override fun getItemCount(): Int {
        return concerts.size
    }

    override fun onBindViewHolder(viewHolder: ConcertViewHolder, position: Int) {
        val currentConcert = concerts[position]

        // Set bands text views
        val listOfBandsAtConcert = currentConcert.concertBandsArray
        viewHolder.firstBandTextView.text = listOfBandsAtConcert[0]
        // Rules for second and third bands at concert
        if (listOfBandsAtConcert.size > 1) {
            viewHolder.optionalSecondBandTextView.visibility = View.VISIBLE
            viewHolder.optionalSecondBandTextView.text = listOfBandsAtConcert[1]

            if (listOfBandsAtConcert.size > 2) {
                viewHolder.optionalThirdBandTextView.visibility = View.VISIBLE
            }
        }

        // Set other text views
        viewHolder.locationTextView.text = currentConcert.concertLocation
        viewHolder.dateTextView.text = currentConcert.date

        //Set poster Image View
        Picasso.get().load(currentConcert.imageUrl).error(R.drawable.broken_image).into(viewHolder.concertPosterImageView)
    }

    class ConcertViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val firstBandTextView = view.findViewById<TextView>(R.id.first_band_text_view)
        val optionalSecondBandTextView = view.findViewById<TextView>(R.id.optional_second_band_text_view)
        val optionalThirdBandTextView = view.findViewById<TextView>(R.id.optional_third_band_text_view)
        val locationTextView = view.findViewById<TextView>(R.id.concert_location_text_view)
        val dateTextView = view.findViewById<TextView>(R.id.concert_date_text_view)
        val concertPosterImageView = view.findViewById<ImageView>(R.id.concert_poster_image_view)
    }
}