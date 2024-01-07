package com.yuri_berezhnoy

import android.util.Log

class User (var name:String, var id: String, var age: Int) {

    fun addAge(years: Int){
        age = age.plus(years)
    }
    fun printUserInfo(){
        Log.d("My Log","User name; $name User id: $id User age: $age")
    }
}