package com.example.fuliang_comp304sec002_lab05

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fuliang_comp304sec002_lab05.databinding.FragmentLandmarksByTypeBinding

class LandmarksByTypeFragment : Fragment() {

    private var _binding: FragmentLandmarksByTypeBinding? = null;
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landmarks_by_type, container, false)
    }

}