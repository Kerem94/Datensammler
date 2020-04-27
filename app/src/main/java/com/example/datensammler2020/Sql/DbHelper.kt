package com.example.datensammler2020.Sql

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null,DATABASE_VERSION){
    companion object{
        private val DATABASE_NAME = "Datensammler.db";
        private val DATABASE_VERSION = 1;

    }
    init {
        val db = this.readableDatabase
    }
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(DbTable.Light_Table.CREATE_TABLE)
        db?.execSQL(DbTable.Proximity_Table.CREATE_TABLE)
        db?.execSQL(DbTable.Gravity_Table.CREATE_TABLE)
        db?.execSQL(DbTable.Gyro_Table.CREATE_TABLE)
        db?.execSQL(DbTable.Accelerometer_Table.CREATE_TABLE)
        db?.execSQL(DbTable.MagneticField__Table.CREATE_TABLE)
        db?.execSQL(DbTable.LinAcc_Table.CREATE_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(DbTable.Light_Table.DELETE_TABLE)
        db?.execSQL(DbTable.Proximity_Table.DELETE_TABLE)
        db?.execSQL(DbTable.Gravity_Table.DELETE_TABLE)
        db?.execSQL(DbTable.Gyro_Table.DELETE_TABLE)
        db?.execSQL(DbTable.Accelerometer_Table.DELETE_TABLE)
        db?.execSQL(DbTable.MagneticField__Table.DELETE_TABLE)
        db?.execSQL(DbTable.LinAcc_Table.DELETE_TABLE)
        onCreate(db)
    }

    @Throws(SQLiteConstraintException::class)
    fun insertGravitySensorData(gravitySensor: Gravity_Sensor): Boolean {
        val db = writableDatabase
        val values = ContentValues()
        values.put(DbTable.Gravity_Table.COLUMN_X, gravitySensor.x)
        values.put(DbTable.Gravity_Table.COLUMN_Y, gravitySensor.y)
        values.put(DbTable.Gravity_Table.COLUMN_Z, gravitySensor.z)
        values.put(DbTable.Gravity_Table.COLUMN_TIME, gravitySensor.time)
        val newRowId = db.insert(DbTable.Gravity_Table.TABLE_NAME, null, values)
        return true
    }
    @Throws(SQLiteConstraintException::class)
    fun insertLightSensorData(lightSensor: Light_Sensor): Boolean {
        val db = writableDatabase
        val values = ContentValues()
        values.put(DbTable.Light_Table.COLUMN_X, lightSensor.x)
        values.put(DbTable.Light_Table.COLUMN_TIME, lightSensor.time)
        val newRowId = db.insert(DbTable.Light_Table.TABLE_NAME, null, values)
        return true
    }
    @Throws(SQLiteConstraintException::class)
    fun insertProximitySensorData(proximitySensor: Proximity_Sensor): Boolean {
        val db = writableDatabase
        val values = ContentValues()
        values.put(DbTable.Proximity_Table.COLUMN_X, proximitySensor.x)
        values.put(DbTable.Proximity_Table.COLUMN_TIME, proximitySensor.time)
        val newRowId = db.insert(DbTable.Proximity_Table.TABLE_NAME, null, values)
        return true
    }
    @Throws(SQLiteConstraintException::class)
    fun insertMagneticFieldSensorData(magneticfieldSensor: MagneticField_Sensor): Boolean {
        val db = writableDatabase
        val values = ContentValues()
        values.put(DbTable.MagneticField__Table.COLUMN_X, magneticfieldSensor.x)
        values.put(DbTable.MagneticField__Table.COLUMN_Y, magneticfieldSensor.y)
        values.put(DbTable.MagneticField__Table.COLUMN_Z, magneticfieldSensor.z)
        values.put(DbTable.MagneticField__Table.COLUMN_TIME, magneticfieldSensor.time)
        val newRowId = db.insert(DbTable.MagneticField__Table.TABLE_NAME, null, values)
        return true
    }
    @Throws(SQLiteConstraintException::class)
    fun insertLinAccSensorData(linaccSensor: LinAcc_Sensor): Boolean {
        val db = writableDatabase
        val values = ContentValues()
        values.put(DbTable.LinAcc_Table.COLUMN_X, linaccSensor.x)
        values.put(DbTable.LinAcc_Table.COLUMN_Y, linaccSensor.y)
        values.put(DbTable.LinAcc_Table.COLUMN_Z, linaccSensor.z)
        values.put(DbTable.LinAcc_Table.COLUMN_TIME, linaccSensor.time)
        val newRowId = db.insert(DbTable.LinAcc_Table.TABLE_NAME, null, values)
        return true
    }
    @Throws(SQLiteConstraintException::class)
    fun insertAccelerometerSensorData(accelerometerSensor: AccelerometerSensor): Boolean {
        val db = writableDatabase
        val values = ContentValues()
        values.put(DbTable.Accelerometer_Table.COLUMN_X, accelerometerSensor.x)
        values.put(DbTable.Accelerometer_Table.COLUMN_Y, accelerometerSensor.y)
        values.put(DbTable.Accelerometer_Table.COLUMN_Z, accelerometerSensor.z)
        values.put(DbTable.Accelerometer_Table.COLUMN_TIME, accelerometerSensor.time)
        val newRowId = db.insert(DbTable.Accelerometer_Table.TABLE_NAME, null, values)
        return true
    }
    @Throws(SQLiteConstraintException::class)
    fun insertGyroSensorData(gyroSensor: Gyro_Sensor): Boolean {
        val db = writableDatabase
        val values = ContentValues()
        values.put(DbTable.Gyro_Table.COLUMN_X, gyroSensor.x)
        values.put(DbTable.Gyro_Table.COLUMN_Y, gyroSensor.y)
        values.put(DbTable.Gyro_Table.COLUMN_Z, gyroSensor.z)
        values.put(DbTable.Gyro_Table.COLUMN_TIME, gyroSensor.time)
        val newRowId = db.insert(DbTable.Gyro_Table.TABLE_NAME, null, values)
        return true
    }

}