package com.akshat.thesplitz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class expense2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_expense2, container, false)
        val tick4 = view.findViewById<FloatingActionButton>(R.id.tick4)
        tick4.setOnClickListener { findNavController().navigate(R.id.action_expense2_to_person2) }
        return view
    }

}

