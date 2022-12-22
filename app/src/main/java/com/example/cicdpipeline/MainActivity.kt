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
// Test7
        AppCenter.start(
            application, "c23c2986-53bf-46aa-bc99-7fafc74cfc5b",
            Analytics::class.java, Crashes::class.java
        )

    }
}