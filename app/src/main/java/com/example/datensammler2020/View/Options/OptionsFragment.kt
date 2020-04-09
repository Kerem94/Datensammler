package com.example.datensammler2020.View.Options

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.datensammler2020.R
import com.example.datensammler2020.SharedPreferences.SharedPreferences
import kotlinx.android.synthetic.main.fragment_options.*

class OptionsFragment : Fragment() {

    private val sharedPreferences by lazy { SharedPreferences(requireContext()) }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_options, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val switchOptions =
            SwitchOptions(
                requireView(),
                sharedPreferences,
                context
            )
        switchOptions.addListener()
        setSwitchButtons()
    }

    companion object {
        fun newInstance(): OptionsFragment = OptionsFragment()
    }

    private fun setSwitchButtons(){
        accelerometerSwitch.isChecked = sharedPreferences.isAccelerometerActivated()
        gyroscopeSwitch.isChecked = sharedPreferences.isGyroActivated()
        gravitySwitch.isChecked = sharedPreferences.isGravityActivated()
        linearAccSwitch.isChecked = sharedPreferences.isLinearAccelerationActivated()
        proximitySwitch.isChecked = sharedPreferences.isProximityActivated()
        lightSwitch.isChecked = sharedPreferences.isLightActivated()
        magnetFieldSwitch.isChecked = sharedPreferences.isMagneticFieldActivated()
    }

}