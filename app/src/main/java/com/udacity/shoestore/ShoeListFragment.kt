package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe

class ShoeListFragment : Fragment() {

    private lateinit var viewModel: ShoeListViewModel
    private lateinit var binding: FragmentShoeListBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container,
            false)

        viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)

        val arrShoe: ArrayList<Shoe> = ArrayList()
        arrShoe.add(Shoe("Gel Duramo", 10.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Duram", 8.0, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Dura", 9.0, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Dur", 8.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel Du", 10.0, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel D", 9.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Gel", 11.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("Ge", 10.5, "Asics", "Gud Business"))
        arrShoe.add(Shoe("G", 11.0, "Asics", "Gud Business"))

        binding.shoelistview.adapter = ListViewAdapter(requireContext(), arrShoe)

        binding.addShoe.setOnClickListener{findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailsFragment())}

        return binding.root
    }
}
