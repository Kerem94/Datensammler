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
import com.example.datensammler2020.Sql.*
import com.example.datensammler2020.View.MainActivity
import kotlinx.android.synthetic.main.fragment_live_data.*

class LiveDataFragment : Fragment(), SensorEventListener {

    private var mSensorManager: SensorManager? = null
    private var mAccelerometer: Sensor? = null
    private var mGyro : Sensor? = null
    private var mGravity : Sensor? = null
    private var mLinAcc : Sensor? = null
    private  var mProximity : Sensor? = null
    private var mLight : Sensor? = null
    private var mMagneticField : Sensor? = null
    private var resume = true;
    private val sharedPreferences by lazy { SharedPreferences(requireContext()) }
    private lateinit  var dbHelper: DbHelper


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_live_data, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.dbHelper = MainActivity.getdbHelper()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mSensorManager = context?.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        mAccelerometer = mSensorManager!!.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        mGyro = mSensorManager!!.getDefaultSensor(Sensor.TYPE_GYROSCOPE)
        mGravity = mSensorManager!!.getDefaultSensor(Sensor.TYPE_GRAVITY)
        mLinAcc = mSensorManager!!.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION)
        mProximity = mSensorManager!!.getDefaultSensor(Sensor.TYPE_PROXIMITY)
        mLight = mSensorManager!!.getDefaultSensor(Sensor.TYPE_LIGHT)
        mMagneticField = mSensorManager!!.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD)
    }

    override fun onResume() {
        super.onResume()
        mSensorManager?.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL)
        mSensorManager?.registerListener(this, mGyro, SensorManager.SENSOR_DELAY_NORMAL)
        mSensorManager?.registerListener(this, mGravity, SensorManager.SENSOR_DELAY_NORMAL)
        mSensorManager?.registerListener(this, mLinAcc, SensorManager.SENSOR_DELAY_NORMAL)
        mSensorManager?.registerListener(this, mProximity, SensorManager.SENSOR_DELAY_NORMAL)
        mSensorManager?.registerListener(this, mLight, SensorManager.SENSOR_DELAY_NORMAL)
        mSensorManager?.registerListener(this, mMagneticField, SensorManager.SENSOR_DELAY_NORMAL)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        mSensorManager?.unregisterListener(this, mAccelerometer)
        mSensorManager?.unregisterListener(this, mGyro)
        mSensorManager?.unregisterListener(this, mGravity)
        mSensorManager?.unregisterListener(this, mLinAcc)
        mSensorManager?.unregisterListener(this, mProximity)
        mSensorManager?.unregisterListener(this, mLight)
        mSensorManager?.unregisterListener(this, mMagneticField)
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
            if (event.sensor.type == Sensor.TYPE_GYROSCOPE) {
                gyroTv(event)
            }
            if (event.sensor.type == Sensor.TYPE_GRAVITY) {
                gravityTv(event)
            }
            if (event.sensor.type == Sensor.TYPE_LINEAR_ACCELERATION) {
                linAccTv(event)
            }
            if (event.sensor.type == Sensor.TYPE_PROXIMITY) {
                proximityTv(event)
            }
            if (event.sensor.type == Sensor.TYPE_LIGHT) {
                lighTv(event)
            }
            if (event.sensor.type == Sensor.TYPE_MAGNETIC_FIELD) {
                magneticFieldTv(event)
            }
        }
    }

    private fun accelerometerTv(event: SensorEvent){
        if (sharedPreferences.isAccelerometerActivated()){
            requireActivity().findViewById<TextView>(R.id.accTvX).text = event.values[0].toString()
            requireActivity().findViewById<TextView>(R.id.accTvY).text = event.values[1].toString()
            requireActivity().findViewById<TextView>(R.id.accTvZ).text = event.values[2].toString()
            var ass = AccelerometerSensor(event.values[0],event.values[1],event.values[2])
            this.dbHelper.insertAccelerometerSensorData(ass)
        } else{
            return
        }
    }

    private fun gyroTv(event: SensorEvent){
        if (sharedPreferences.isGyroActivated()){
            requireActivity().findViewById<TextView>(R.id.gyroTvX).text = event.values[0].toString()
            requireActivity().findViewById<TextView>(R.id.gyroTvY).text = event.values[1].toString()
            requireActivity().findViewById<TextView>(R.id.gyroTvZ).text = event.values[2].toString()
            var gs = Gyro_Sensor(event.values[0],event.values[1],event.values[2])
            this.dbHelper.insertGyroSensorData(gs)
        } else{
            return
        }
    }

    private fun gravityTv(event: SensorEvent){
        if (sharedPreferences.isGravityActivated()){
            requireActivity().findViewById<TextView>(R.id.gravityTvX).text = event.values[0].toString()
            requireActivity().findViewById<TextView>(R.id.gravityTvY).text = event.values[1].toString()
            requireActivity().findViewById<TextView>(R.id.gravityTvZ).text = event.values[2].toString()
            var gs = Gravity_Sensor(event.values[0],event.values[1],event.values[2])
            this.dbHelper.insertGravitySensorData(gs)
        } else{
            return
        }
    }

    private fun linAccTv(event: SensorEvent){
        if (sharedPreferences.isLinearAccelerationActivated()){
            requireActivity().findViewById<TextView>(R.id.linearAccTvX).text = event.values[0].toString()
            requireActivity().findViewById<TextView>(R.id.linearAccTvY).text = event.values[1].toString()
            requireActivity().findViewById<TextView>(R.id.linearAccTvZ).text = event.values[2].toString()
            var ls = LinAcc_Sensor(event.values[0],event.values[1],event.values[2])
            this.dbHelper.insertLinAccSensorData(ls)
        } else{
            return
        }
    }

    private fun proximityTv(event: SensorEvent){
        if (sharedPreferences.isProximityActivated()){
            requireActivity().findViewById<TextView>(R.id.proximityTvX).text = event.values[0].toString()
            var ps = Proximity_Sensor(event.values[0])
            this.dbHelper.insertProximitySensorData(ps)
        } else{
            return
        }
    }

    private fun lighTv(event: SensorEvent){
        if (sharedPreferences.isLightActivated()){
            requireActivity().findViewById<TextView>(R.id.lightTvX).text = event.values[0].toString()
            var ls = Light_Sensor(event.values[0])
            this.dbHelper.insertLightSensorData(ls)
        } else{
            return
        }
    }

    private fun magneticFieldTv(event: SensorEvent){
        if (sharedPreferences.isMagneticFieldActivated()){
            requireActivity().findViewById<TextView>(R.id.magneticFIeldTvX).text = event.values[0].toString()
            requireActivity().findViewById<TextView>(R.id.magneticFIeldTvY).text = event.values[1].toString()
            requireActivity().findViewById<TextView>(R.id.magneticFIeldTvZ).text = event.values[2].toString()
            var ms = MagneticField_Sensor(event.values[0],event.values[1],event.values[2])
            this.dbHelper.insertMagneticFieldSensorData(ms)
        } else{
            return
        }
    }



}