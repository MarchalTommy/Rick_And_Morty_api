package com.aki.appsolutetestapp.data.online

import com.aki.appsolutetestapp.data.entities.GetCharacterByIdResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {

    @GET("character/{character_id}")
    suspend fun getCharacterById(
        @Path("character_id") characterId: Int
    ): Response<GetCharacterByIdResponse>
}