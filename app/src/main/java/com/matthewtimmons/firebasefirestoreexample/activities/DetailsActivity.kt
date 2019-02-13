package com.matthewtimmons.firebasefirestoreexample.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.models.Movie
import com.squareup.picasso.Picasso

class DetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        // TODO Replace this mock instance with a call to get the actual movie passed in
        val movie = getMockMovie()

        findViewById<TextView>(R.id.title).text = movie.title
        findViewById<TextView>(R.id.third_info_field).text = movie.rating
        findViewById<TextView>(R.id.fourth_info_field).text = movie.genres
        findViewById<TextView>(R.id.fifth_info_field).text = movie.releaseDate
        findViewById<CheckBox>(R.id.confirmed_checkbox).text = "Seen"

        //Set poster Image View
        Picasso.get().load(movie.photoUrl).error(R.drawable.broken_image).into(findViewById<ImageView>(R.id.poster_image_view))
    }

    fun getMockMovie(): Movie {
        return Movie("Movie Title",
            "02/16/2019",
            "Action, Comedy",
            "PG-13",
            "https://miro.medium.com/max/1400/1*a2Da_CQHUsSKTCTRI2tYhQ.png")
    }

}