package com.example.basicroom.database

import android.app.Application

class MyApplication: Application(){
    fun OnCreate(){
        DatabaseManager.instance.initializeDatabase(applicationContext)
        super.onCreate()
    }
}