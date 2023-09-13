package com.example.soccer_stats.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.soccer_stats.R
import com.example.soccer_stats.adapters.ListAdapter
import com.example.soccer_stats.databinding.FragmentListBinding
import com.example.soccer_stats.ui.fragments.viewmodels.ListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding

    private val adapter=ListAdapter()

    private val listviewModel:ListViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Initialize the binding object
        binding = FragmentListBinding.inflate(inflater, container, false)
        // Return the root view of the binding
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // observe live data and update ui
        observeLiveData()


        // setting up rv
        setupRv()
    }

    private fun observeLiveData() {
        listviewModel.getResults()
        listviewModel.result.observe(viewLifecycleOwner, Observer {
            adapter.setData(it)
        })
    }

    private fun setupRv() {
       binding.listRv.layoutManager=LinearLayoutManager(requireContext())
        binding.listRv.adapter=adapter
    }


}