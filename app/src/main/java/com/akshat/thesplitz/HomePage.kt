package com.akshat.thesplitz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import android.widget.EditText
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class HomePage : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home_page, container, false)
        val grp2 = view.findViewById<ImageButton>(R.id.grp2)
        grp2.setOnClickListener { findNavController().navigate(R.id.action_homePage_to_person2) }
//        grp2.setOnClickListener{ actionGRP2() }

        val grp3 = view.findViewById<ImageButton>(R.id.grp3)
        grp3.setOnClickListener { findNavController().navigate(R.id.action_homePage_to_person3) }

        val grp4 = view.findViewById<ImageButton>(R.id.grp4)
        grp4.setOnClickListener { findNavController().navigate(R.id.action_homePage_to_person4) }

        val grp5 = view.findViewById<ImageButton>(R.id.grp5)
        grp5.setOnClickListener { findNavController().navigate(R.id.action_homePage_to_person5) }



        return view
    }


}