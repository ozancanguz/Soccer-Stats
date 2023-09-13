package com.example.soccer_stats.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.soccer_stats.R
import com.example.soccer_stats.databinding.FragmentDetailsBinding
import com.example.soccer_stats.databinding.FragmentListBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Initialize the binding object
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        // Return the root view of the binding


        return binding.root
    }


}