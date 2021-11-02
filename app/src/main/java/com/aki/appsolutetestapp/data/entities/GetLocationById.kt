package com.aki.appsolutetestapp.data.entities

data class GetLocationById(
    val created: String = "",
    val dimension: String = "",
    val id: Int = 0,
    val name: String = "",
    val residents: List<String> = listOf(),
    val type: String = "",
    val url: String = ""
)