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
            if (isChecked){
                sharedPreferences.setAccelerometerActivated(isChecked)
            } else{
                sharedPreferences.setAccelerometerActivated(isChecked)
            }
        }
    }

    private fun gyroListener(){
        view.gyroscopeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setGyroActivated(isChecked)
            } else{
                sharedPreferences.setGyroActivated(isChecked)
            }
        }
    }
    private fun gravityListener(){
        view.gravitySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setGravityActivated(isChecked)
            } else{
                sharedPreferences.setGravityActivated(isChecked)
            }
        }
    }
    private fun linearAccelerationListener(){
        view.linearAccSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setLinearAccelerationActivated(isChecked)
            } else{
                sharedPreferences.setLinearAccelerationActivated(isChecked)
            }
        }
    }
    private fun proximityListener(){
        view.proximitySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setProximityActivated(isChecked)
            } else{
                sharedPreferences.setProximityActivated(isChecked)
            }
        }
    }
    private fun lightListener(){
        view.lightSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setLightActivated(isChecked)
            } else{
                sharedPreferences.setLightActivated(isChecked)
            }
        }
    }
    private fun magneticFieldListener(){
        view.magnetFieldSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setMagneticFieldActivated(isChecked)
            } else{
                sharedPreferences.setMagneticFieldActivated(isChecked)
            }
        }
    }
}