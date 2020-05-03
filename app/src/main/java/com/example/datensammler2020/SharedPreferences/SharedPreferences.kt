package com.example.datensammler2020.SharedPreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.example.datensammler2020.R

class SharedPreferences(private var context: Context) {

    private var preferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

    fun isAccelerometerActivated(): Boolean {
        val key = context.getString(R.string.preference_is_accelerometer_activated)
        return preferences.getBoolean(key, false)
    }

    fun setAccelerometerActivated(isAccelerometerActivated: Boolean) {
        val key = context.getString(R.string.preference_is_accelerometer_activated)
        preferences.edit().putBoolean(key, isAccelerometerActivated).apply()
    }

    fun isGyroActivated(): Boolean {
        val key = context.getString(R.string.preference_is_gyroscope_activated)
        return preferences.getBoolean(key, false)
    }

    fun setGyroActivated(isGyroActivated: Boolean) {
        val key = context.getString(R.string.preference_is_gyroscope_activated)
        preferences.edit().putBoolean(key, isGyroActivated).apply()
    }

    fun isGravityActivated(): Boolean {
        val key = context.getString(R.string.preference_is_gravity_activated)
        return preferences.getBoolean(key, false)
    }

    fun setGravityActivated(isGravityActivated: Boolean) {
        val key = context.getString(R.string.preference_is_gravity_activated)
        preferences.edit().putBoolean(key, isGravityActivated).apply()
    }

    fun isLinearAccelerationActivated(): Boolean {
        val key = context.getString(R.string.preference_is_linear_acceleration_activated)
        return preferences.getBoolean(key, false)
    }

    fun setLinearAccelerationActivated(isLinearAccelerationActivated: Boolean) {
        val key = context.getString(R.string.preference_is_linear_acceleration_activated)
        preferences.edit().putBoolean(key, isLinearAccelerationActivated).apply()
    }

    fun isProximityActivated(): Boolean {
        val key = context.getString(R.string.preference_is_proximity_activated)
        return preferences.getBoolean(key, false)
    }

    fun setProximityActivated(isProximityActivated: Boolean) {
        val key = context.getString(R.string.preference_is_proximity_activated)
        preferences.edit().putBoolean(key, isProximityActivated).apply()
    }

    fun isLightActivated(): Boolean {
        val key = context.getString(R.string.preference_is_light_activated)
        return preferences.getBoolean(key, false)
    }

    fun setLightActivated(isLightActivated: Boolean) {
        val key = context.getString(R.string.preference_is_light_activated)
        preferences.edit().putBoolean(key, isLightActivated).apply()
    }

    fun isMagneticFieldActivated(): Boolean {
        val key = context.getString(R.string.preference_is_magnetic_field_activated)
        return preferences.getBoolean(key, false)
    }

    fun setMagneticFieldActivated(isMagneticFieldActivated: Boolean) {
        val key = context.getString(R.string.preference_is_magnetic_field_activated)
        preferences.edit().putBoolean(key, isMagneticFieldActivated).apply()
    }

    fun isDbActivated(): Boolean {
        val key = context.getString(R.string.preference_is_save_to_db_activated)
        return preferences.getBoolean(key, false)
    }

    fun setDbActivated(isDbActivated: Boolean) {
        val key = context.getString(R.string.preference_is_save_to_db_activated)
        preferences.edit().putBoolean(key, isDbActivated).apply()
    }

}