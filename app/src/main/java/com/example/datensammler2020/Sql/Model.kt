package com.example.datensammler2020.Sql


class Light_Sensor{
    var x : Float = 0.0f;
    var time: String = "";

    constructor(x: Float){
        this.x = x;
        this.time  = System.currentTimeMillis().toString();
    }
}

class Proximity_Sensor{
    var x : Float = 0.0f;
    var time: String = "";

    constructor(x: Float){
        this.x = x;
        this.time  = System.currentTimeMillis().toString();
    }
}

class Gravity_Sensor{
    var x : Float = 0.0f;
    var y : Float = 0.0f;
    var z : Float = 0.0f;
    var time: String = "";

    constructor(x: Float, y: Float, z:Float){
        this.x = x;
        this.y = y;
        this.z = z;
        this.time  = System.currentTimeMillis().toString();
    }
}

class MagneticField_Sensor{
    var x : Float = 0.0f;
    var y : Float = 0.0f;
    var z : Float = 0.0f;
    var time: String = "";

    constructor(x: Float, y: Float, z:Float){
        this.x = x;
        this.y = y;
        this.z = z;
        this.time  = System.currentTimeMillis().toString();
    }
}

class AccelerometerSensor{
    var x : Float = 0.0f;
    var y : Float = 0.0f;
    var z : Float = 0.0f;
    var time: String = "";

    constructor(x: Float, y: Float, z:Float){
        this.x = x;
        this.y = y;
        this.z = z;
        this.time  = System.currentTimeMillis().toString();
    }
}

class Gyro_Sensor{
    var x : Float = 0.0f;
    var y : Float = 0.0f;
    var z : Float = 0.0f;
    var time: String = "";

    constructor(x: Float, y: Float, z:Float){
        this.x = x;
        this.y = y;
        this.z = z;
        this.time  = System.currentTimeMillis().toString();
    }
}


class LinAcc_Sensor{
    var x : Float = 0.0f;
    var y : Float = 0.0f;
    var z : Float = 0.0f;
    var time: String = "";

    constructor(x: Float, y: Float, z:Float){
        this.x = x;
        this.y = y;
        this.z = z;
        this.time  = System.currentTimeMillis().toString();
    }
}
