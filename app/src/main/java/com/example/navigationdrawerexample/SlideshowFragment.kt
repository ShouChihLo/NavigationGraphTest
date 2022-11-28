package com.example.navigationdrawerexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navigationdrawerexample.databinding.FragmentNextBinding
import com.example.navigationdrawerexample.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSlideshowBinding.inflate(inflater, container, false)

        binding.backNext.setOnClickListener {
            //requireView().findNavController().navigate(R.id.action_slideshowFragment_to_nextFragment)
            requireView().findNavController().popBackStack(R.id.nextFragment,true)
        }

        binding.backHome2.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_slideshowFragment_to_homeFragment)
            //requireView().findNavController().popBackStack(R.id.homeFragment, false)
        }

        return binding.root
    }

}