package com.aki.appsolutetestapp.data.entities

data class GetEpisodeById(
    val air_date: String = "",
    val characters: List<String> = listOf(),
    val created: String = "",
    val episode: String = "",
    val id: Int = 0,
    val name: String = "",
    val url: String = ""
)