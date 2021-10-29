package com.aki.appsolutetestapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.aki.appsolutetestapp.R

class EpisodeListFragment : Fragment() {

    companion object {
        fun newInstance() = EpisodeListFragment()
    }

    private lateinit var viewModel: EpisodeListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.episode_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EpisodeListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}