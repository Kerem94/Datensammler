package com.example.datensammler2020.View.LiveData

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.datensammler2020.R
import com.example.datensammler2020.SharedPreferences.SharedPreferences
import kotlinx.android.synthetic.main.fragment_live_data.*

class LiveDataFragment : Fragment(), SensorEventListener {

    private var mSensorManager: SensorManager? = null
    private var mAccelerometer: Sensor? = null
    private var resume = true;
    private val sharedPreferences by lazy { SharedPreferences(requireContext()) }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_live_data, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mSensorManager = context?.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        mAccelerometer = mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    }

    override fun onResume() {
        super.onResume()
        mSensorManager?.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mSensorManager?.unregisterListener(this, mAccelerometer)
    }


    companion object {
        fun newInstance(): LiveDataFragment = LiveDataFragment()
    }


    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event != null && resume) {
            if (event.sensor.type == Sensor.TYPE_ACCELEROMETER) {
                accelerometerTv(event)
            }
        }
    }

    private fun accelerometerTv(event: SensorEvent){
        if (sharedPreferences.isAccelerometerActivated()){
            requireActivity().findViewById<TextView>(R.id.accelerometerTvX).text = event.values[0].toString()
            requireActivity().findViewById<TextView>(R.id.accelerometerTvY).text = event.values[1].toString()
            requireActivity().findViewById<TextView>(R.id.accelerometerTvZ).text = event.values[2].toString()
        } else{
            return
        }

    }

}