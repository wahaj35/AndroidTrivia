package com.example.navigation

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.navigation.R.id.NavHost
import com.example.navigation.R.id.aboutFragment
import com.example.navigation.R.id.rulesFragment
import com.example.navigation.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(NavHost) as NavHostFragment
        setSupportActionBar(binding.myToolbar)
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(R.id.HomeScreen),
            fallbackOnNavigateUpListener = ::onSupportNavigateUp
        )
        binding.myToolbar.setupWithNavController(navController, appBarConfiguration)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.rulesFragment -> {
                     NavigationUI.onNavDestinationSelected(item!!, findNavController(NavHost))
                true
            }
            R.id.aboutFragment ->{
                NavigationUI.onNavDestinationSelected(item!!, findNavController(NavHost))
                true
            } else -> super.onOptionsItemSelected(item)

        }
    }

}

