package io.raveerocks.androidtrivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import io.raveerocks.androidtrivia.databinding.FragmentGameOverBinding

class GameOverFragment: Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentGameOverBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_over, container, false
        )
        binding.tryAgainButton.setOnClickListener { view: View ->
            view.findNavController().navigate(GameOverFragmentDirections.actionGameOverFragmentToGameFragment())
        }
        return binding.root
    }
}