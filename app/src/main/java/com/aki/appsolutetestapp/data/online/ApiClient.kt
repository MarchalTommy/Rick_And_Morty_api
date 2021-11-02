package com.aki.appsolutetestapp.data.online

import com.aki.appsolutetestapp.data.entities.GetCharacterByIdResponse
import retrofit2.Response
import java.lang.Exception

class ApiClient(private val service: Service) {

    suspend fun getCharacterById(characterId: Int): SimpleResponse<GetCharacterByIdResponse> {
        return safeApiCall { service.getCharacterById(characterId) }
    }

    private inline fun <T> safeApiCall(apiCall: () -> Response<T>): SimpleResponse<T> {
        return try {
            SimpleResponse.success(apiCall.invoke())
        } catch (e: Exception) {
            SimpleResponse.failure(e)
        }
    }
}
