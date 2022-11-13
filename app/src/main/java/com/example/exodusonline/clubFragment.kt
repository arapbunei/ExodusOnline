package com.example.exodusonline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar


class clubFragment : Fragment() {

    private lateinit var toolbar        : Toolbar
    private lateinit var navController  : NavController
    private lateinit var drawerLayout   : DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_club, container, false)

       // toolbar = view.findViewById(R.id.main_toolbar)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        navController=navHostFragment.navController
        drawerLayout = view.findViewById(R.id.drawer_layout)
        toolbar = view.findViewById<Toolbar>(R.id.toolbar)

        appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)
        view.findViewById<MaterialToolbar>(R.id.toolbar)
            .setupWithNavController(navController,appBarConfiguration)



        val appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
        toolbar.setupWithNavController(navController, appBarConfiguration)


        return view
    }


}