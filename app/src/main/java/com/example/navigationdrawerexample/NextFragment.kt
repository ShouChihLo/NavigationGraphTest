package com.example.navigationdrawerexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigationdrawerexample.databinding.FragmentHomeBinding
import com.example.navigationdrawerexample.databinding.FragmentNextBinding

class NextFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentNextBinding.inflate(inflater, container, false)

        binding.toSlideshow.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_nextFragment_to_slideshowFragment)
        }

        binding.backHome.setOnClickListener {
            requireView().findNavController().popBackStack()
        }

        return binding.root
    }


}