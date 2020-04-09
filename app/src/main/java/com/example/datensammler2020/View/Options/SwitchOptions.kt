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
                Toast.makeText(context,sharedPreferences.isAccelerometerActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setAccelerometerActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isAccelerometerActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun gyroListener(){
        view.gyroscopeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setGyroActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isGyroActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setGyroActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isGyroActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun gravityListener(){
        view.gravitySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setGravityActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isGravityActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setGravityActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isGravityActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun linearAccelerationListener(){
        view.linearAccSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setLinearAccelerationActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isLinearAccelerationActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setLinearAccelerationActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isLinearAccelerationActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun proximityListener(){
        view.proximitySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setProximityActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isProximityActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setProximityActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isProximityActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun lightListener(){
        view.lightSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setLightActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isLightActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setLightActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isLightActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun magneticFieldListener(){
        view.magnetFieldSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                sharedPreferences.setMagneticFieldActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isMagneticFieldActivated().toString(), Toast.LENGTH_SHORT).show()
            } else{
                sharedPreferences.setMagneticFieldActivated(isChecked)
                Toast.makeText(context,sharedPreferences.isMagneticFieldActivated().toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}