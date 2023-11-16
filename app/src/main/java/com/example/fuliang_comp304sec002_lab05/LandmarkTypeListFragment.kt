package com.example.fuliang_comp304sec002_lab05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.fuliang_comp304sec002_lab05.databinding.FragmentLandmarkTypeListBinding


class LandmarkTypeListFragment : Fragment() {

    lateinit var viewModel: LandmarkViewModel
    private var _binding: FragmentLandmarkTypeListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLandmarkTypeListBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewModelFactory = ViewModelFactory()
        viewModel = ViewModelProvider(this, viewModelFactory).get(LandmarkViewModel::class.java)

        val adapter = LandmarkITypeAdapter(viewModel.types, {
            val action = LandmarkTypeListFragmentDirections.actionLandmarkTypeListFragToLandmarkListByTypeFrag(
                landmarkType = it.name
            )
            view.findNavController().navigate(action)
        })
        binding.landmarkTypeList.adapter = adapter

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}