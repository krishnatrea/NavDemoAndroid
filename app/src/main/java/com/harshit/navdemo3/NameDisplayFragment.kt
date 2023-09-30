package com.harshit.navdemo3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.harshit.navdemo3.databinding.FragmentNameDisplayBinding
import com.harshit.navdemo3.databinding.FragmentNameInputBinding


class NameDisplayFragment : Fragment() {
    private lateinit var binding: FragmentNameDisplayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_name_display, container, false )
        var name = requireArguments().getString("input_name")
        var email = requireArguments().getString("input_email")
        binding.showNameText.text = name
        binding.showEmailText.text = email
        binding.termBtn.setOnClickListener{
            it.findNavController().navigate(R.id.action_nameDisplayFragment_to_termsFragment)
        }
        return binding.root
    }
}