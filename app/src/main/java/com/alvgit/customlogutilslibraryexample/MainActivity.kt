package com.alvgit.customlogutilslibraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvgit.logutil.LogDebug

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogDebug.d("DEnememeee")
    }
}