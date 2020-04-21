package com.example.datensammler2020.View.Options

import android.content.Context
import android.view.View
import android.widget.Toast
import com.example.datensammler2020.SharedPreferences.SharedPreferences
import kotlinx.android.synthetic.main.fragment_options.view.*

class SwitchOptions(private val view: View, private val sharedPreferences: SharedPreferences, private val context : Context?) {


     fun addListener(){
         accelerometerListener()
         gyroListener()
         gravityListener()
         linearAccelerationListener()
         proximityListener()
         lightListener()
         magneticFieldListener()
    }

    private fun accelerometerListener(){
        view.accelerometerSwitch.setOnCheckedChangeListener { _, isChecked ->
                sharedPreferences.setAccelerometerActivated(isChecked)
        }
    }

    private fun gyroListener(){
        view.gyroscopeSwitch.setOnCheckedChangeListener { _, isChecked ->
                sharedPreferences.setGyroActivated(isChecked)
        }
    }
    private fun gravityListener(){
        view.gravitySwitch.setOnCheckedChangeListener { _, isChecked ->
                sharedPreferences.setGravityActivated(isChecked)
        }
    }
    private fun linearAccelerationListener(){
        view.linearAccSwitch.setOnCheckedChangeListener { _, isChecked ->
                sharedPreferences.setLinearAccelerationActivated(isChecked)
        }
    }
    private fun proximityListener(){
        view.proximitySwitch.setOnCheckedChangeListener { _, isChecked ->
                sharedPreferences.setProximityActivated(isChecked)
        }
    }
    private fun lightListener(){
        view.lightSwitch.setOnCheckedChangeListener { _, isChecked ->
                sharedPreferences.setLightActivated(isChecked)
        }
    }
    private fun magneticFieldListener(){
        view.magnetFieldSwitch.setOnCheckedChangeListener { _, isChecked ->
                sharedPreferences.setMagneticFieldActivated(isChecked)
        }
    }
}