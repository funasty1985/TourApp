package com.example.fuliang_comp304sec002_lab05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.fuliang_comp304sec002_lab05.databinding.FragmentLandmarksByTypeBinding

class LandmarksByTypeFragment : Fragment() {

    companion object {
        var TYPE = "landmarkType"
    }

    private var _binding: FragmentLandmarksByTypeBinding? = null;
    private val binding get() = _binding!!
    private lateinit var landmarkType: String

    private val viewModel: LandmarkViewModel by activityViewModels {
        ViewModelFactory()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?. let {
            landmarkType = it.getString(TYPE).toString()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLandmarksByTypeBinding.inflate(inflater, container, false)
        val view = binding.root
        val landmarks = viewModel.getLandmarksByType(landmarkType)
        val adapter = LandmarkItemAdapter(landmarks, {
            viewModel.selectedLandmark(it)
            val action = LandmarksByTypeFragmentDirections.actionLandmarkListByTypeFragToMapFag()
            view.findNavController().navigate(action)
        })
        binding.landmarkList.adapter = adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null

    }

}