package com.example.datensammler2020.View

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.isInvisible
import androidx.fragment.app.Fragment
import com.example.datensammler2020.R
import kotlinx.android.synthetic.main.fragment_options.*

class OptionsFragment : Fragment(), SensorEventListener {
    private var mSensorManager : SensorManager ?= null
    private var mAccelerometer : Sensor ?= null
    private var resume = true;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_options, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mSensorManager = context?.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        mAccelerometer = mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    }

    override fun onResume() {
        super.onResume()
        mSensorManager?.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL)
    }

    private fun addListener(){
        gyroscopeSwitch.setOnClickListener {
            if (gyroscopeSwitch.isEnabled){
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null && resume) {
            if (event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
                requireActivity().findViewById<TextView>(R.id.gyroTv).text = event.values[0].toString()
            }
        }
    }
}