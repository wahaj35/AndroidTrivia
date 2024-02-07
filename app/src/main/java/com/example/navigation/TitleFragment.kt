package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.navigation.R.id.aboutFragment
import com.example.navigation.databinding.FragmentGameOverBinding
import com.example.navigation.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {
lateinit var binding: FragmentTitleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_title,container,false)
        setHasOptionsMenu(true)
        binding.playButton.setOnClickListener{view:View-> Navigation.findNavController(view).navigate(R.id.action_titleFragment2_to_gameFragment2)}
        return binding.root
    }
}
