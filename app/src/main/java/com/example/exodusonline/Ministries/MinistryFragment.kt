package com.example.exodusonline.Ministries

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exodusonline.R

class MinistryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_ministry, container, false)

        val recycler = view.findViewById<RecyclerView>(R.id.pfRv)
        recycler.adapter = MinistriesAdapter(MINISTRIES)
        recycler.layoutManager = LinearLayoutManager(view.context)




        return view
    }

}