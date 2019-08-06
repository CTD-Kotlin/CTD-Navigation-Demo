package com.example.ctdnavigagtiondemo.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ctdnavigagtiondemo.R
import com.example.ctdnavigagtiondemo.models.RPS
import kotlinx.android.synthetic.main.fragment_play_game.*
import kotlin.random.Random
import com.example.ctdnavigagtiondemo.models.AIRPS

class PlayGameFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_play_game, container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        buttonRock.setOnClickListener {
            navi(RPS.ROCK)
            var userChoice = 1
        }
        buttonPaper.setOnClickListener {
            navi(RPS.PAPER)
            var userChoice = 2
        }
        buttonScissors.setOnClickListener {
            navi(RPS.SCISSORS)
            var userChoice = 3
        }
    }

    private fun navi(userChoice: RPS){
        val bundle = bundleOf(getString(R.string.UserChoice) to userChoice)

        findNavController().navigate(R.id.action_playGameFragment_to_resultsFragment, bundle)
    }
}
