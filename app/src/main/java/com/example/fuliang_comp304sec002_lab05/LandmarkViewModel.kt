package com.example.fuliang_comp304sec002_lab05

import androidx.lifecycle.ViewModel

class LandmarkViewModel: ViewModel() {

    val landmarks = mutableListOf<Landmark>()
    private val types =  listOf("old building", "museums", "stadiums", "attractions")

    init {
        landmarks.add(Landmark("Toronto City Hall", "old building", 43.653908,-79.384293))
        landmarks.add(Landmark("Fort York National Historic Site", "museums", 43.637314,  -79.40659))
        landmarks.add(Landmark("Spadina Museum", "museums", 43.678055, -79.409538))
    }

    fun getLandmarksByType(type: String): List<Landmark> {
        return landmarks.filter { it.type == type }
    }

    fun getLandmarkTypes(): List<String> {
        return types
    }
}