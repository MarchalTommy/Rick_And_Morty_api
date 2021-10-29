package com.aki.appsolutetestapp.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.aki.appsolutetestapp.R
import com.aki.appsolutetestapp.ui.main.CharacterListFragment
import com.aki.appsolutetestapp.ui.main.CharacterListViewModel

class CharacterDetailFragment : Fragment() {

    companion object {
        fun newInstance() = CharacterDetailFragment()
    }

    private lateinit var viewModel: CharacterDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.character_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CharacterDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}