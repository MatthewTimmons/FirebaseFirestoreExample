package com.matthewtimmons.firebasefirestoreexample.models

data class User(
    val name: String,
    val watchlist: List<String>,
    val favorites: List<String>,
    val moviesSeen: List<String>
)

// Empty constructor needed for Firestore
{
    constructor() : this("", arrayListOf<String>(), arrayListOf<String>(), arrayListOf<String>())
}