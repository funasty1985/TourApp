package com.example.fuliang_comp304sec002_lab05

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class LandmarkItemAdapter: RecyclerView.Adapter<LandmarkItemAdapter.LandmarkItemViewHolder>() {

    var data = listOf<Landmark>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkItemViewHolder = LandmarkItemViewHolder.inflateFrom(parent)

    override fun onBindViewHolder(holder: LandmarkItemViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    class LandmarkItemViewHolder(val rootView: TextView)
        : RecyclerView.ViewHolder(rootView) {

            companion object {
                fun inflateFrom(parent: ViewGroup): LandmarkItemViewHolder {
                    val layoutInflater = LayoutInflater.from(parent.context)
                    val view = layoutInflater
                        .inflate(R.layout.landmark_item, parent, false) as TextView

                    return LandmarkItemViewHolder(view)
                }
            }

            fun bind(item: Landmark) {
                rootView.text = item.type
            }
        }
}

