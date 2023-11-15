package com.example.fuliang_comp304sec002_lab05

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fuliang_comp304sec002_lab05.databinding.LandmarkItemBinding

class LandmarkItemHolder(
    val binding: LandmarkItemBinding
) : RecyclerView.ViewHolder(binding.root) {
}

class LandmarkListAdapter(
    private val landmarks: List<Landmark>
): RecyclerView.Adapter<LandmarkItemHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LandmarkItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LandmarkItemBinding.inflate(inflater, parent, false)
        return LandmarkItemHolder(binding)

    }

    override fun onBindViewHolder(holder: LandmarkItemHolder, position: Int) {
        val landmark = landmarks[position]
        holder.apply{
            binding.landmarkType.text = landmark.type
        }
    }

    override fun getItemCount() = landmarks.size

}