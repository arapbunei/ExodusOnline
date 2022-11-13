package com.example.exodusonline.Ministries

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.exodusonline.R
import com.google.android.material.snackbar.Snackbar

class MinistriesAdapter(private val ministriesList:List<Ministry>)
    :RecyclerView.Adapter<MinistriesAdapter.MinistriesVH>(){

    private val onItemClick:((Ministry) -> Unit)?=null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MinistriesVH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)
        return MinistriesVH(view)
    }

    override fun onBindViewHolder(holder: MinistriesVH, position: Int) {
        val mn = ministriesList[position]
        holder.tvname.text=mn.name
        holder.img.setImageResource(mn.image)
        holder.cv.setOnClickListener { it ->
            Snackbar.make(it,"We are still working on this, for now Kindly head over to The Adventist Youth Ministry Thank you. ",Snackbar.LENGTH_LONG).show()
}

        }



    override fun getItemCount() = ministriesList.size


    class MinistriesVH(itemView: View): RecyclerView.ViewHolder(itemView) {
        val img = itemView.findViewById<ImageView>(R.id.imv_ministry)
        val tvname = itemView.findViewById<TextView>(R.id.ministry_name)
        val cv = itemView.findViewById<CardView>(R.id.cv_item)
    }
}