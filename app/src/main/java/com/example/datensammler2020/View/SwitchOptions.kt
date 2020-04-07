package com.example.datensammler2020.View

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
                sharedPreferences.setAccelerometerActivated(true)
                Toast.makeText(context,sharedPreferences.isAccelerometerActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setAccelerometerActivated(false)
                Toast.makeText(context,sharedPreferences.isAccelerometerActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun gyroListener(){
        view.gyroscopeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setGyroActivated(true)
                Toast.makeText(context,sharedPreferences.isGyroActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setGyroActivated(false)
                Toast.makeText(context,sharedPreferences.isGyroActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun gravityListener(){
        view.gravitySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setGravityActivated(true)
                Toast.makeText(context,sharedPreferences.isGravityActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setGravityActivated(false)
                Toast.makeText(context,sharedPreferences.isGravityActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun linearAccelerationListener(){
        view.linearAccSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setLinearAccelerationActivated(true)
                Toast.makeText(context,sharedPreferences.isLinearAccelerationActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setLinearAccelerationActivated(false)
                Toast.makeText(context,sharedPreferences.isLinearAccelerationActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun proximityListener(){
        view.proximitySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setProximityActivated(true)
                Toast.makeText(context,sharedPreferences.isProximityActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setProximityActivated(false)
                Toast.makeText(context,sharedPreferences.isProximityActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun lightListener(){
        view.lightSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setLightActivated(true)
                Toast.makeText(context,sharedPreferences.isLightActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setLightActivated(false)
                Toast.makeText(context,sharedPreferences.isLightActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun magneticFieldListener(){
        view.magnetFieldSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setMagneticFieldActivated(true)
                Toast.makeText(context,sharedPreferences.isMagneticFieldActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setMagneticFieldActivated(false)
                Toast.makeText(context,sharedPreferences.isMagneticFieldActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}