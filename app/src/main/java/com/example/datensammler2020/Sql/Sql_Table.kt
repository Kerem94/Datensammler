package com.example.datensammler2020.Sql

import android.provider.BaseColumns

object DbTable{
    class Light_Table : BaseColumns {
        companion object {
            val TABLE_NAME = "light"
            val COLUMN_ID = "id"
            val COLUMN_X = "x"
            val COLUMN_TIME = "time"
            val CREATE_TABLE ="CREATE TABLE " + this.TABLE_NAME + " (" +
                    this.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    this.COLUMN_X+ " REAL," +
                    this.COLUMN_TIME + " TEXT)"
            val DELETE_TABLE =  "DROP TABLE IF EXISTS " + this.TABLE_NAME
        }
    }

    class Proximity_Table : BaseColumns{
        companion object {
            val TABLE_NAME = "proximit"
            val COLUMN_ID = "id"
            val COLUMN_X = "x"
            val COLUMN_TIME = "time"
            val CREATE_TABLE ="CREATE TABLE " + this.TABLE_NAME + " (" +
                    this.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    this.COLUMN_X+ " REAL," +
                    this.COLUMN_TIME + " TEXT)"
            val DELETE_TABLE =  "DROP TABLE IF EXISTS " + this.TABLE_NAME
        }
    }

    class Gravity_Table : BaseColumns{
        companion object {
            val TABLE_NAME = "gravity"
            val COLUMN_ID = "id"
            val COLUMN_X = "x"
            val COLUMN_Y = "y"
            val COLUMN_Z = "z"
            val COLUMN_TIME = "time"
            val CREATE_TABLE ="CREATE TABLE " + this.TABLE_NAME + " (" +
                    this.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    this.COLUMN_X+ " REAL," +
                    this.COLUMN_Y+ " REAL," +
                    this.COLUMN_Z+ " REAL," +
                    this.COLUMN_TIME + " TEXT)"
            val DELETE_TABLE =  "DROP TABLE IF EXISTS " + this.TABLE_NAME
        }
    }

    class Gyro_Table : BaseColumns{
        companion object {
            val TABLE_NAME = "gyro"
            val COLUMN_ID = "id"
            val COLUMN_X = "x"
            val COLUMN_Y = "y"
            val COLUMN_Z = "z"
            val COLUMN_TIME = "time"
            val CREATE_TABLE ="CREATE TABLE " + this.TABLE_NAME + " (" +
                    this.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    this.COLUMN_X+ " REAL," +
                    this.COLUMN_Y+ " REAL," +
                    this.COLUMN_Z+ " REAL," +
                    this.COLUMN_TIME + " TEXT)"
            val DELETE_TABLE =  "DROP TABLE IF EXISTS " + this.TABLE_NAME
        }
    }

    class Accelerometer_Table : BaseColumns{
        companion object {
            val TABLE_NAME = "accelerometer"
            val COLUMN_ID = "id"
            val COLUMN_X = "x"
            val COLUMN_Y = "y"
            val COLUMN_Z = "z"
            val COLUMN_TIME = "time"
            val CREATE_TABLE ="CREATE TABLE " + this.TABLE_NAME + " (" +
                    this.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    this.COLUMN_X+ " REAL," +
                    this.COLUMN_Y+ " REAL," +
                    this.COLUMN_Z+ " REAL," +
                    this.COLUMN_TIME + " TEXT)"
            val DELETE_TABLE =  "DROP TABLE IF EXISTS " + this.TABLE_NAME
        }
    }

    class MagneticField__Table : BaseColumns{
        companion object {
            val TABLE_NAME = "magneticfield_"
            val COLUMN_ID = "id"
            val COLUMN_X = "x"
            val COLUMN_Y = "y"
            val COLUMN_Z = "z"
            val COLUMN_TIME = "time"
            val CREATE_TABLE ="CREATE TABLE " + this.TABLE_NAME + " (" +
                    this.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    this.COLUMN_X+ " REAL," +
                    this.COLUMN_Y+ " REAL," +
                    this.COLUMN_Z+ " REAL," +
                    this.COLUMN_TIME + " TEXT)"
            val DELETE_TABLE =  "DROP TABLE IF EXISTS " + this.TABLE_NAME
        }
    }

    class LinAcc_Table : BaseColumns{
        companion object {
            val TABLE_NAME = "linacc"
            val COLUMN_ID = "id"
            val COLUMN_X = "x"
            val COLUMN_Y = "y"
            val COLUMN_Z = "z"
            val COLUMN_TIME = "time"
            val CREATE_TABLE ="CREATE TABLE " + this.TABLE_NAME + " (" +
                    this.COLUMN_ID + " INTEGER PRIMARY KEY," +
                    this.COLUMN_X+ " REAL," +
                    this.COLUMN_Y+ " REAL," +
                    this.COLUMN_Z+ " REAL," +
                    this.COLUMN_TIME + " TEXT)"
            val DELETE_TABLE =  "DROP TABLE IF EXISTS " + this.TABLE_NAME
        }
    }


}