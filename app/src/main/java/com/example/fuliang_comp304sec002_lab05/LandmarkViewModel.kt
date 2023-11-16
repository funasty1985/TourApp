package com.example.fuliang_comp304sec002_lab05

import androidx.lifecycle.ViewModel

class LandmarkViewModel: ViewModel() {

    val landmarks = mutableListOf<Landmark>()
    val types =  mutableListOf<LandmarkType>()
    lateinit var selectedLandmark: Landmark

    init {
        landmarks.add(Landmark("Toronto City Hall", "Heritage", 43.652483, -79.382016, R.drawable.old_city_hall))
        landmarks.add(Landmark("Distillery Historic District", "Heritage", 43.650238, -79.359222, R.drawable.distillery_district))

        landmarks.add(Landmark("Royal Ontario Museum", "Museum", 43.667713,    -79.394913, R.drawable.rom))
        landmarks.add(Landmark("Gardiner Museum", "Museum", 43.668140,   -79.393083, R.drawable.gardiner_museum))
        landmarks.add(Landmark("Aga Khan Museum", "Museum", 43.678055, -79.409538, R.drawable.aga_khan_museum))
        landmarks.add(Landmark("Ontario Science Centre", "Museum", 43.716407, -79.339184, R.drawable.ontario_science_centre))
        landmarks.add(Landmark("Spadina Museum", "Museum", 43.678993, -79.408147, R.drawable.spadina_museum))


        landmarks.add(Landmark("Rogers Centre", "Stadium", 43.641796,  -79.390083, R.drawable.rogers_center))
        landmarks.add(Landmark("BMO Field", "Stadium", 43.633223,   -79.418562, R.drawable.bmo_field))


        landmarks.add(Landmark("CN Tower", "Attraction", 43.642567,   -79.387054, R.drawable.cn_tower))
        landmarks.add(Landmark("Gibraltar Point Lighthouse", "Attraction", 43.6137,   -79.3853, R.drawable.g_p))


        types.add(LandmarkType("Heritage", R.drawable.stupa))
        types.add(LandmarkType("Museum", R.drawable.museum))
        types.add(LandmarkType("Stadium", R.drawable.stadium))
        types.add(LandmarkType("Attraction", R.drawable.landmark))
    }

    fun getLandmarksByType(type: String): List<Landmark> {
        return landmarks.filter { it.type == type }
    }

    fun selectedLandmark(item: Landmark){
        selectedLandmark = item
    }
}