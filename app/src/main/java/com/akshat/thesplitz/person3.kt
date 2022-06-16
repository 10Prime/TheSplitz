package com.akshat.thesplitz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton


class person3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_person3, container, false)
        val fab3 = view.findViewById<FloatingActionButton>(R.id.fab3)
        fab3.setOnClickListener { findNavController().navigate(R.id.action_person3_to_expense3) }

        val done3 = view.findViewById<FloatingActionButton>(R.id.done3)
        done3.setOnClickListener { findNavController().navigate(R.id.action_person3_to_done32) }
        return view
    }


}