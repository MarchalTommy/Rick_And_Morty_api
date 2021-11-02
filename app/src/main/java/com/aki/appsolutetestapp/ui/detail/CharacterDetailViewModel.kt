package com.aki.appsolutetestapp.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aki.appsolutetestapp.data.entities.GetCharacterByIdResponse
import com.aki.appsolutetestapp.data.repository.Repository
import kotlinx.coroutines.launch

class CharacterDetailViewModel : ViewModel() {

    private val repo = Repository()

    private val _characterById = MutableLiveData<GetCharacterByIdResponse?>()
    val characterById: LiveData<GetCharacterByIdResponse?> = _characterById

    fun getCharacterById(characterId: Int) {
        viewModelScope.launch {
            _characterById.postValue(repo.getCharacterById(characterId))
        }
    }
}