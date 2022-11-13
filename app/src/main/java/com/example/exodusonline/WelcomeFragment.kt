package com.example.exodusonline

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)

        view.findViewById<Button>(R.id.button_login).setOnClickListener {

            val email = view.findViewById<EditText>(R.id.editTextEmail).text.toString().trim{ it <= ' ' }
            val password = view.findViewById<EditText>(R.id.editTextPassword).text.toString().trim{ it <= ' ' }

            if (email.isNotEmpty() and password.isNotEmpty()) {
               // val action = WelcomeFragmentDirections.actionsWelcomeFragmentToHomeFragment()
               // findNavController(action)
                findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
            } else{
                Snackbar.make(it,"Password and email cannot be empty",Snackbar.LENGTH_LONG).show()
            }
        }






        view.findViewById<Button>(R.id.button_registration).setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_welcomeFragment_to_registrationFragment)
               // val action = WelcomeFragmentDirections.actionWelcomeFragmentToRegistrationFragment()
              //  findNavController(action)
        )

        return view
    }
}
