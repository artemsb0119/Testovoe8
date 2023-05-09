package com.example.testovoe8

import android.app.Application
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "cdc98eb6-dbdf-4398-a3ec-0d7d2a49370c"

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()

        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}