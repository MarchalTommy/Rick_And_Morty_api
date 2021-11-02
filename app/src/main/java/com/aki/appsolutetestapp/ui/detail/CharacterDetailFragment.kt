package com.aki.appsolutetestapp.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import coil.Coil
import coil.load
import coil.request.ImageRequest
import com.aki.appsolutetestapp.R
import com.aki.appsolutetestapp.databinding.CharacterDetailFragmentBinding
import com.aki.appsolutetestapp.ui.main.CharacterListFragment
import com.aki.appsolutetestapp.ui.main.CharacterListViewModel

class CharacterDetailFragment : Fragment() {

    companion object {
        fun newInstance() = CharacterDetailFragment()
    }

    val viewModel: CharacterDetailViewModel by lazy {
        ViewModelProvider(this).get(CharacterDetailViewModel::class.java)
    }
    private lateinit var binding: CharacterDetailFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.character_detail_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}