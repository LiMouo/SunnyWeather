package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * 在项目任何位置调用此类都可获取 Context
 * */
class SunnyWeatherApplication : Application(){
    companion object{
        @SuppressLint("StaticFieldLeak")
        const val TOKEN = "PPhPMBzKtbn72fnI"
        lateinit var context : Context;
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}