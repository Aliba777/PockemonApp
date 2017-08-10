package com.example.terexion.pockemonandroid

import android.location.Location


class Pockemon {

    var name:String?=null
    var description:String?=null
    var image:Int?=null
    var power:Double?=null
    var location:Location?=null
    var isCatch:Boolean?=false
    constructor(image:Int, name:String, description:String, power:Double, latitude:Double, longitude:Double) {
        this.name = name
        this.description = description
        this.image = image
        this.power = power
        this.location=Location(name)
        this.location!!.latitude = latitude
        this.location!!.longitude = longitude
        this.isCatch = false
    }

}