package com.aki.appsolutetestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aki.appsolutetestapp.ui.main.CharacterListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CharacterListFragment.newInstance())
                .commitNow()
        }
    }
}