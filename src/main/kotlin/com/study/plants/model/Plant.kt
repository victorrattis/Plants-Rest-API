package com.study.plants.model

data class Plant(
    val id: String,
    val name: String,
    val image: String,
    val description: String,
    val price: String,
    val carelevel: String,
    val country: String = "",
)