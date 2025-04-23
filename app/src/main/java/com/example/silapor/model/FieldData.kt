package com.example.silapor.model

data class City(
    val id: Int,
    val name: String
)

data class Field(
    val id: Int,
    val cityId: Int,
    val sportType: String,
    val name: String,
    val address: String,
    val pricePerHour: Int,
    val imageUrl: String
)

data class Sport(
    val name: String,
    val imageUrl: String,
)