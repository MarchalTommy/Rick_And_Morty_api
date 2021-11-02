package com.aki.appsolutetestapp

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aki.appsolutetestapp.data.entities.GetCharacterByIdResponse
import com.aki.appsolutetestapp.data.online.NetworkLayer
import com.aki.appsolutetestapp.data.online.Service
import com.aki.appsolutetestapp.ui.main.CharacterListFragment
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.container, CharacterListFragment.newInstance())
//                .commitNow()
//        }


//        NetworkLayer.apiClient.getCharacterById(2).isSuccessful

    }
}