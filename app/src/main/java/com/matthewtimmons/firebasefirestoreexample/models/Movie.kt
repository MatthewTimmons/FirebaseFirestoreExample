package com.matthewtimmons.firebasefirestoreexample.models

data class MovieTitle(
        val title: String
)

// Empty constructor needed for Firestore
{
    constructor() : this("")
}

data class Movie(
        val title: String,
        val releaseDate: String,
        val genres: String,
        val rating: String,
        val photoUrl: String
)

// Empty constructor needed for Firestore
{
    constructor() : this("", "", "", "", "")
}