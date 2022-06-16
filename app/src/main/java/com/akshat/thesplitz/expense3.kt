package com.akshat.thesplitz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class expense3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_expense3, container, false)
        val tick3 = view.findViewById<FloatingActionButton>(R.id.tick3)
        tick3.setOnClickListener { findNavController().navigate(R.id.action_expense3_to_person3) }

        return view

    }



}