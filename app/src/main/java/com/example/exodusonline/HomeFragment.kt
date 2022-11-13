package com.example.exodusonline


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class HomeFragment : Fragment() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController:NavController
    lateinit var toolbar: Toolbar
    private lateinit var drawerLayout   : DrawerLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        toolbar = view.findViewById<Toolbar>(R.id.toolbar)
     //   drawerLayout    = view.findViewById(R.id.drawer_layout)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment

       //bottom nav
        navController = navHostFragment.navController
        view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
                .setupWithNavController(navController)

      //  appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)
     //  view.findViewById<Toolbar>(R.id.toolbar)
      //    .setupWithNavController(navController,appBarConfiguration)




        // Custom navigation listener allows me to change the title
        navController.addOnDestinationChangedListener() { controller,destination,arguments ->
            toolbar.title = destination.label
        }

        return view
    }


}
