package com.example.fuliang_comp304sec002_lab05

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(): ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LandmarkViewModel::class.java))
            return LandmarkViewModel() as T
        throw IllegalArgumentException("Unknown ViewModel")
    }
}