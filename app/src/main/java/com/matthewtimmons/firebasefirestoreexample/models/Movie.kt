package com.matthewtimmons.firebasefirestoreexample.models

data class MovieTitles(
        val title: String
)

data class Movie(
        val title: String,
        val releaseDate: String,
        val genres: String,
        val rating: String,
        val photoUrl: String
)