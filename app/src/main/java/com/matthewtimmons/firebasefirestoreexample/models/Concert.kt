package com.matthewtimmons.firebasefirestoreexample.models

data class Concert(
    val concertBandsArray: List<String>,
    val concertLocation: String,
    val date: String,
    val imageUrl: String
)