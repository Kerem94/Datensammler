package com.example.datensammler2020.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datensammler2020.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startFragment = OptionsFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container,startFragment).commit()
    }
}
