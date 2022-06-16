package com.akshat.thesplitz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class person5 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_person5, container, false)
        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { findNavController().navigate(R.id.action_person5_to_expense5) }

        val done = view.findViewById<FloatingActionButton>(R.id.done)
        done.setOnClickListener { findNavController().navigate(R.id.action_person5_to_done5) }
        return view


    }


}