package com.matthewtimmons.firebasefirestoreexample.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.matthewtimmons.firebasefirestoreexample.R
import com.matthewtimmons.firebasefirestoreexample.models.Movie
import com.matthewtimmons.firebasefirestoreexample.models.User
import com.squareup.picasso.Picasso

class DetailsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val title = intent.extras["title"]

        // TODO Replace this mock instance with a call to get the actual movie passed in
        var movie = getMockMovie()

        // Set Text Views
        findViewById<TextView>(R.id.title).text = movie.title
        findViewById<TextView>(R.id.third_info_field).text = movie.rating
        findViewById<TextView>(R.id.fourth_info_field).text = movie.genres
        findViewById<TextView>(R.id.fifth_info_field).text = movie.releaseDate
        findViewById<CheckBox>(R.id.confirmed_checkbox).text = "Seen"

        // Set poster Image View
        Picasso.get().load(movie.photoUrl).error(R.drawable.broken_image).into(findViewById<ImageView>(R.id.poster_image_view))

        // TODO Set up checkbox functionality
        findViewById<CheckBox>(R.id.confirmed_checkbox).setOnCheckedChangeListener { compoundButton, checked ->

        }
        findViewById<CheckBox>(R.id.favorite_checkbox).setOnCheckedChangeListener { compoundButton, checked ->

            compoundButton.buttonDrawable = if (checked) getDrawable(R.drawable.solid_star) else getDrawable(R.drawable.hollow_star)
        }
        findViewById<CheckBox>(R.id.add_to_watchlist_checkbox).setOnCheckedChangeListener { compoundButton, checked ->

        }
    }

    fun getMockMovie(): Movie {
        return Movie("Movie Title*",
            "02/16/2019*",
            "Action, Comedy*",
            "PG-13*",
            "https://miro.medium.com/max/1400/1*a2Da_CQHUsSKTCTRI2tYhQ.png")
    }
}