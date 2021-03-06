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

class EpisodeDetailFragment : Fragment() {

    companion object {
        fun newInstance() = EpisodeDetailFragment()
    }

    private lateinit var viewModel: EpisodeDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.episode_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EpisodeDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}