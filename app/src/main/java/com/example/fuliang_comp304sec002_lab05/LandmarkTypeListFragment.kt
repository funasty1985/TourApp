package com.example.fuliang_comp304sec002_lab05

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fuliang_comp304sec002_lab05.databinding.FragmentLandmarkTypeListBinding

private const val TAG = "LandmarkTypeListFragment"
class LandmarkTypeListFragment: Fragment() {

    private var _binding: FragmentLandmarkTypeListBinding? = null
    private val binding get() = _binding!!

    private val viewModel: LandmarkViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Total type: ${viewModel.getLandmarkTypes().size}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLandmarkTypeListBinding.inflate(inflater, container, false)

        binding.landmarkTypeList.layoutManager = LinearLayoutManager(context)

        val landmarks = viewModel.landmarks
        val adapter = LandmarkListAdapter(landmarks)
        binding.landmarkTypeList.adapter = adapter

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}


//class LandmarkTypeListFragment : Fragment() {
//
//    lateinit var viewModel: LandmarkViewModel
//    private var _binding: FragmentLandmarkTypeListBinding? = null
//    private val binding get() = _binding!!
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentLandmarkTypeListBinding.inflate(inflater, container, false)
//        val view = binding.root
//
//        viewModel = ViewModelProvider(this).get(LandmarkViewModel::class.java)
//        binding.viewModel = viewModel
//        binding.lifecycleOwner = viewLifecycleOwner
//
//        val types = viewModel.getLandmarkTypes()
//        Log.d(ContentValues.TAG, "Types : ${types.joinToString()}", )
//
//
//        val adapter = LandmarkItemAdapter()
//        binding.landmarkTypeList.adapter = adapter
//
//        return view
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        _binding = null
//    }
//}