package com.example.customcrashhandler

import android.app.Application
import com.rohitss.uceh.UCEHandler

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        UCEHandler.Builder(applicationContext).build()





    }
}