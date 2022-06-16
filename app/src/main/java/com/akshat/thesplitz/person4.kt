package com.akshat.thesplitz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class person4 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_person4, container, false)
        val fab2 = view.findViewById<FloatingActionButton>(R.id.fab2)
        fab2.setOnClickListener { findNavController().navigate(R.id.action_person4_to_expense4) }

        val done2 = view.findViewById<FloatingActionButton>(R.id.done2)
        done2.setOnClickListener { findNavController().navigate(R.id.action_person4_to_done42) }
        return view
    }


}