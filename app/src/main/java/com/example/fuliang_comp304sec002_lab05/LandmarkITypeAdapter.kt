package com.example.fuliang_comp304sec002_lab05

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class LandmarkITypeAdapter(
    private val data: List<LandmarkType>,
    private val onItemClicked: (LandmarkType) -> Unit
    ): RecyclerView.Adapter<LandmarkITypeAdapter.LandmarkItemViewHolder>() {

    override fun getItemCount() = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkItemViewHolder {
        val viewHolder =  LandmarkItemViewHolder.inflateFrom(parent)

        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            onItemClicked(data[position])
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: LandmarkItemViewHolder, position: Int) {
        val item = data[position]
        holder.rootView.findViewById<ImageView>(R.id.type_image).setImageResource(item.source)
        holder.bind(item)
    }

    class LandmarkItemViewHolder(val rootView: CardView)
        : RecyclerView.ViewHolder(rootView) {

            val landmark_type = rootView.findViewById<TextView>(R.id.landmark_type)

            companion object {
                fun inflateFrom(parent: ViewGroup): LandmarkItemViewHolder {
                    val layoutInflater = LayoutInflater.from(parent.context)
                    val view = layoutInflater
                        .inflate(R.layout.type_item, parent, false) as CardView

                    return LandmarkItemViewHolder(view)
                }
            }

            fun bind(item: LandmarkType) {
                landmark_type.text = item.name
//                rootView.setOnClickListener{
//                    Toast.makeText(rootView.context, "Clicked type ${item.name}", Toast.LENGTH_SHORT).show()
//                }
            }
        }
}

