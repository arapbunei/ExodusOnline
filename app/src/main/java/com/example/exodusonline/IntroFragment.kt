package com.example.exodusonline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.exodusonline.Ministries.MINISTRIES
import com.example.exodusonline.Ministries.MinistriesAdapter

class IntroFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_intro, container, false)

        val recycler = view.findViewById<RecyclerView>(R.id.pfRecycler)
        recycler.adapter = ResourceAdapter(MINISTRIES)
        //recycler.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL)
        recycler.layoutManager = LinearLayoutManager(view.context)

        return view
    }


}