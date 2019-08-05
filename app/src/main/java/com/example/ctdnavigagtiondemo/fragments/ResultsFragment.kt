package com.example.ctdnavigagtiondemo.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.ctdnavigagtiondemo.R
import com.example.ctdnavigagtiondemo.models.RPS
import kotlinx.android.synthetic.main.fragment_results.*


class ResultsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(
            R.layout.fragment_results, container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val userChoice: RPS = arguments?.get("user_choice") as RPS
        val aiChoice: RPS = arguments?.get("ai_choice") as RPS


        textViewPlayerChoice.text = userChoice.name
        textViewAiChoice.text = aiChoice.name

        buttonPlayAgain.setOnClickListener {
            findNavController().navigate(R.id.action_global_startFragment)
        }


        private fun findResult(a: RPS, aI: RPS): String = when (a) {
            aI -> getString(R.string.draw)
            RPS.ROCK -> if (aI == RPS.PAPER) getString(R.string.lost) else getString(R.string.won)
            RPS.PAPER -> if (aI == RPS.SCISSORS) getString(R.string.lost) else getString(R.string.won)
            RPS.SCISSORS -> if (aI == RPS.ROCK) getString(R.string.lost) else getString(R.string.won)
        }

    }
}









