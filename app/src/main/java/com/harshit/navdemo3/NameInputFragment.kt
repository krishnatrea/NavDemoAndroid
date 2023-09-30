package com.harshit.navdemo3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.harshit.navdemo3.databinding.FragmentNameDisplayBinding
import com.harshit.navdemo3.databinding.FragmentNameInputBinding

class NameInputFragment : Fragment() {
    private lateinit var binding: FragmentNameInputBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_name_input, container, false)
        binding.emailSubmitbtn.setOnClickListener{
            var name = requireArguments().getString("input")
            var bundle : Bundle = bundleOf("input_email" to binding.emailText.text.toString(), "input_name" to name)
            it.findNavController().navigate(R.id.action_nameInputFragment_to_nameDisplayFragment, bundle)
        }
        return binding.root
    }
}