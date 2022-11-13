package com.example.exodusonline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exodusonline.Ministries.Ministry

class ResourceAdapter(private val resource:List<Ministry>):RecyclerView.Adapter<ResourceAdapter.ViewHolder>() {

    //private val layoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_row_items,parent,false)
      //  val view = layoutInflater.inflate(R.layout.category_row_items,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val res = resource[position]
        holder.tv.text = res.name

    }

    override fun getItemCount(): Int {
        return resource.size
    }
    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val tv:TextView = itemView.findViewById(R.id.ministry_name)
    }
}