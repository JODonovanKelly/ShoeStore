package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailsBinding

class ShoeDetailsFragment : Fragment(){

    private lateinit var binding : FragmentShoeDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, container, false)

        binding.save.setOnClickListener { findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment()) }
        binding.cancel.setOnClickListener { findNavController().navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment()) }

        return binding.root
    }
}