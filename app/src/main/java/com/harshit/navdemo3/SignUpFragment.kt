package com.harshit.navdemo3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.harshit.navdemo3.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {
    private lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up, container, false )
        binding.submitBtn.setOnClickListener{
            var bundle : Bundle = bundleOf("input" to binding.nameText.text.toString())
            it.findNavController().navigate(R.id.action_signUpFragment_to_nameInputFragment, bundle)
        }
        return binding.root
    }
}