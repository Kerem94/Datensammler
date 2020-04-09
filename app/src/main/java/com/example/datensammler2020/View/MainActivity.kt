package com.example.datensammler2020.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.example.datensammler2020.R
import com.example.datensammler2020.View.Graph.GraphFragment
import com.example.datensammler2020.View.LiveData.LiveDataFragment
import com.example.datensammler2020.View.Options.OptionsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startFragment =
            OptionsFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container,startFragment).commit()

        toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_nav_mainActivity)
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.optionsMenu -> {
                    val optionsFragment = OptionsFragment.newInstance()
                    openFragment(optionsFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.liveDataMenu -> {
                    val liveDataFragment = LiveDataFragment.newInstance()
                    openFragment(liveDataFragment)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.graphMenu -> {
                    val graphFragment = GraphFragment.newInstance()
                    openFragment(graphFragment)
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
