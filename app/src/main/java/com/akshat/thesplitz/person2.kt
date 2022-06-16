package com.akshat.thesplitz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class person2 : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_person2, container, false)
        val fab4 = view.findViewById<FloatingActionButton>(R.id.fab4)
        fab4.setOnClickListener { findNavController().navigate(R.id.action_person2_to_expense2) }

        val done4 = view.findViewById<FloatingActionButton>(R.id.done4)
        done4.setOnClickListener { findNavController().navigate(R.id.action_person2_to_done22) }
        return view
    }


}