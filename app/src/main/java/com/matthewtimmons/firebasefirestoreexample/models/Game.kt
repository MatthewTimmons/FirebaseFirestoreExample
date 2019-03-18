package com.matthewtimmons.firebasefirestoreexample.models

data class Game(
    val title: String,
    val releaseDate: String,
    val releaseConsoles: String,
    val rating: String,
    val photoUrl: String
)

// Empty constructor needed for Firestore
{
    constructor() : this("", "", "", "", "")
}