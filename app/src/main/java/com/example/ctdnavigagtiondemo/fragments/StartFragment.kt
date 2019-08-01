package com.example.ctdnavigagtiondemo.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.ctdnavigagtiondemo.R
import com.example.ctdnavigagtiondemo.databinding.FragmentStartBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_start, container, false
        )

        binding.buttonPlayGame.setOnClickListener {

        }
        return binding.root
    }


}