package com.example.cicdpipeline

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Test7 test1 TEST7 test7
        AppCenter.start(
            application, "00dc97ae-479d-4201-9f03-92de1b397e34",
            Analytics::class.java, Crashes::class.java
        )

    }
}