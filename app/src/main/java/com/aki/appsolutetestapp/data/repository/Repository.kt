package com.aki.appsolutetestapp.data.repository

import com.aki.appsolutetestapp.data.entities.GetCharacterByIdResponse
import com.aki.appsolutetestapp.data.online.NetworkLayer

class Repository {

    suspend fun getCharacterById(characterId: Int): GetCharacterByIdResponse? {
        val request = NetworkLayer.apiClient.getCharacterById(characterId)

        if(request.failed) {
            return null
        }

        if (!request.successful) {
            return null
        }

        return request.body
    }
}