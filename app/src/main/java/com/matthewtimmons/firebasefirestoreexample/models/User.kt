package com.matthewtimmons.firebasefirestoreexample.models

data class User(
    val name: String
)

// Empty constructor needed for Firestore
{
    constructor() : this("")
}