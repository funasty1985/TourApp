package com.example.fuliang_comp304sec002_lab05

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.fuliang_comp304sec002_lab05.databinding.LandmarkItemBinding

class LandmarkItemHolder(
    val binding: LandmarkItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(landmark: Landmark){
        binding.landmarkType.text = landmark.type

        binding.root.setOnClickListener{
            Toast.makeText(binding.root.context, "Toast !! ", Toast.LENGTH_SHORT).show()
        }
    }
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
//        holder.apply{
//            binding.landmarkType.text = landmark.type
//        }
          holder.bind(landmark)
    }

    override fun getItemCount() = landmarks.size

}